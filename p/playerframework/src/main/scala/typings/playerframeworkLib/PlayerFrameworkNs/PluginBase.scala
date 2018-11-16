package typings
package playerframeworkLib.PlayerFrameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PlayerFramework.PluginBase")
@js.native
class PluginBase () extends js.Object {
  var currentMediaSource: stdLib.MediaSource = js.native
  var isActive: scala.Boolean = js.native
  var isEnabled: scala.Boolean = js.native
  var isLoaded: scala.Boolean = js.native
  var mediaPlayer: MediaPlayer = js.native
  def load(): scala.Unit = js.native
  def unload(): scala.Unit = js.native
  def update(mediaSource: stdLib.MediaSource): scala.Unit = js.native
}

