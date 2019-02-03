package typings
package phaserLib.spineNs.webglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.webgl.LoadingScreen")
@js.native
class LoadingScreen protected () extends js.Object {
  def this(renderer: SceneRenderer) = this()
  var angle: js.Any = js.native
  var backgroundColor: phaserLib.spineNs.Color = js.native
  var fadeOut: js.Any = js.native
  var firstDraw: js.Any = js.native
  var logo: js.Any = js.native
  var renderer: js.Any = js.native
  var spinner: js.Any = js.native
  var tempColor: js.Any = js.native
  var timeKeeper: js.Any = js.native
  def draw(): scala.Unit = js.native
  def draw(complete: scala.Boolean): scala.Unit = js.native
}

/* static members */
@JSGlobal("spine.webgl.LoadingScreen")
@js.native
object LoadingScreen extends js.Object {
  var FADE_SECONDS: scala.Double = js.native
  var SPINE_LOGO_DATA: js.Any = js.native
  var SPINNER_DATA: js.Any = js.native
  var loaded: js.Any = js.native
  var logoImg: js.Any = js.native
  var spinnerImg: js.Any = js.native
}

