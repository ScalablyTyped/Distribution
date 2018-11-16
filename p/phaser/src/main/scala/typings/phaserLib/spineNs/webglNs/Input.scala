package typings
package phaserLib.spineNs.webglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.webgl.Input")
@js.native
class Input protected () extends js.Object {
  def this(element: stdLib.HTMLElement) = this()
  var buttonDown: scala.Boolean = js.native
  var currTouch: Touch = js.native
  var element: stdLib.HTMLElement = js.native
  var lastX: scala.Double = js.native
  var lastY: scala.Double = js.native
  var listeners: js.Any = js.native
  var touchesPool: phaserLib.spineNs.Pool[Touch] = js.native
  def addListener(listener: InputListener): scala.Unit = js.native
  def removeListener(listener: InputListener): scala.Unit = js.native
  /* private */ def setupCallbacks(element: js.Any): js.Any = js.native
}

