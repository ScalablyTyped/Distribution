package typings
package openjscadLib.OpenJsCadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("OpenJsCad.Viewer")
@js.native
class Viewer protected () extends js.Object {
  def this(containerElm: js.Any, size: js.Any, options: IViewerOptions) = this()
  var `bgColor_`: js.Any = js.native
  var `camera_`: js.Any = js.native
  var canvas: js.Any = js.native
  var `containerElm_`: js.Any = js.native
  var `controls_`: js.Any = js.native
  var `defaultColor_`: js.Any = js.native
  var drawOptions: js.Any = js.native
  var `pauseRender_`: js.Any = js.native
  var perspective: js.Any = js.native
  var `renderer_`: js.Any = js.native
  var `requestID_`: js.Any = js.native
  var `scene_`: js.Any = js.native
  var size: js.Any = js.native
  def animate(): scala.Unit = js.native
  def applyDrawOptions(): scala.Unit = js.native
  def cancelAnimate(): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def createCamera(): scala.Unit = js.native
  def createControls(canvas: js.Any): scala.Unit = js.native
  def createRenderer(bool_noWebGL: js.Any): scala.Unit = js.native
  def createScene(drawAxes: js.Any, axLen: js.Any): scala.Unit = js.native
  def drawAxes(axLen: js.Any): scala.Unit = js.native
  def getUserMeshes(): js.Array[threeLib.threeMod.Object3D] = js.native
  def getUserMeshes(str: js.Any): js.Array[threeLib.threeMod.Object3D] = js.native
  def handleResize(): scala.Unit = js.native
  def parseSizeParams(): scala.Unit = js.native
  def refreshRenderer(bool_noWebGL: js.Any): scala.Unit = js.native
  def render(): scala.Unit = js.native
  def resetZoom(r: js.Any): scala.Unit = js.native
  def setCsg(csg: js.Any, resetZoom: js.Any): scala.Unit = js.native
  def webGLAvailable(): scala.Boolean = js.native
}

