package typings.ol.pointerMod

import typings.std.PointerEvent
import typings.std.UIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointerInteraction
  extends typings.ol.interactionInteractionMod.default {
  
  /**
    * Returns the current number of pointers involved in the interaction,
    * e.g. 2 when two fingers are used.
    */
  def getPointerCount(): Double = js.native
  
  /**
    * Handle pointer down events.
    */
  /* protected */ def handleDownEvent(mapBrowserEvent: typings.ol.mapBrowserEventMod.default[UIEvent]): Boolean = js.native
  
  /**
    * Handle pointer drag events.
    */
  /* protected */ def handleDragEvent(mapBrowserEvent: typings.ol.mapBrowserEventMod.default[UIEvent]): Unit = js.native
  
  /**
    * Handle pointer move events.
    */
  /* protected */ def handleMoveEvent(mapBrowserEvent: typings.ol.mapBrowserEventMod.default[UIEvent]): Unit = js.native
  
  /**
    * Handle pointer up events.
    */
  /* protected */ def handleUpEvent(mapBrowserEvent: typings.ol.mapBrowserEventMod.default[UIEvent]): Boolean = js.native
  
  var handlingDownUpSequence: Boolean = js.native
  
  /**
    * This function is used to determine if "down" events should be propagated
    * to other interactions or should be stopped.
    */
  def stopDown(handled: Boolean): Boolean = js.native
  
  var targetPointers: js.Array[PointerEvent] = js.native
}
