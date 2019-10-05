package typings.playerframework.PlayerFramework

import typings.std.MediaSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PlayerFramework.PluginBase")
@js.native
class PluginBase () extends js.Object {
  var currentMediaSource: MediaSource = js.native
  var isActive: Boolean = js.native
  var isEnabled: Boolean = js.native
  var isLoaded: Boolean = js.native
  var mediaPlayer: MediaPlayer = js.native
  def load(): Unit = js.native
  def unload(): Unit = js.native
  def update(mediaSource: MediaSource): Unit = js.native
}

