package typings.ol.pointerEventTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventType extends js.Object

@JSImport("ol/pointer/EventType", "EventType")
@js.native
object EventType extends js.Object {
  @js.native
  sealed trait POINTERCANCEL extends EventType
  
  @js.native
  sealed trait POINTERDOWN extends EventType
  
  @js.native
  sealed trait POINTERENTER extends EventType
  
  @js.native
  sealed trait POINTERLEAVE extends EventType
  
  @js.native
  sealed trait POINTERMOVE extends EventType
  
  @js.native
  sealed trait POINTEROUT extends EventType
  
  @js.native
  sealed trait POINTEROVER extends EventType
  
  @js.native
  sealed trait POINTERUP extends EventType
  
}

