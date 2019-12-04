package typings.ol.interactionPointerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointerInteraction
  extends typings.ol.interactionInteractionMod.default {
  var handlingDownUpSequence: Boolean = js.native
  var targetPointers: js.Array[typings.ol.pointerPointerEventMod.default] = js.native
  /* protected */ def handleDownEvent(mapBrowserEvent: typings.ol.mapBrowserPointerEventMod.default): Boolean = js.native
  /* protected */ def handleDragEvent(mapBrowserEvent: typings.ol.mapBrowserPointerEventMod.default): Unit = js.native
  /* protected */ def handleMoveEvent(mapBrowserEvent: typings.ol.mapBrowserPointerEventMod.default): Unit = js.native
  /* protected */ def handleUpEvent(mapBrowserEvent: typings.ol.mapBrowserPointerEventMod.default): Boolean = js.native
  def stopDown(handled: Boolean): Boolean = js.native
}

