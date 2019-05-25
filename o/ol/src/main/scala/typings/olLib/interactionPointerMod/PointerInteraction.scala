package typings
package olLib.interactionPointerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointerInteraction
  extends olLib.interactionInteractionMod.default {
  var handlingDownUpSequence: scala.Boolean = js.native
  var targetPointers: js.Array[olLib.pointerPointerEventMod.default] = js.native
  /* protected */ def handleDownEvent(mapBrowserEvent: olLib.mapBrowserPointerEventMod.default): scala.Boolean = js.native
  /* protected */ def handleDragEvent(mapBrowserEvent: olLib.mapBrowserPointerEventMod.default): scala.Unit = js.native
  /* protected */ def handleMoveEvent(mapBrowserEvent: olLib.mapBrowserPointerEventMod.default): scala.Unit = js.native
  /* protected */ def handleUpEvent(mapBrowserEvent: olLib.mapBrowserPointerEventMod.default): scala.Boolean = js.native
  def stopDown(handled: scala.Boolean): scala.Boolean = js.native
}

