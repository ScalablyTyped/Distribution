package typings
package olLib.pointerEventTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventType extends js.Object

@JSImport("ol/pointer/EventType", "EventType")
@js.native
object EventType extends js.Object {
  @js.native
  sealed trait POINTERCANCEL
    extends olLib.pointerEventTypeMod.EventType
  
  @js.native
  sealed trait POINTERDOWN
    extends olLib.pointerEventTypeMod.EventType
  
  @js.native
  sealed trait POINTERENTER
    extends olLib.pointerEventTypeMod.EventType
  
  @js.native
  sealed trait POINTERLEAVE
    extends olLib.pointerEventTypeMod.EventType
  
  @js.native
  sealed trait POINTERMOVE
    extends olLib.pointerEventTypeMod.EventType
  
  @js.native
  sealed trait POINTEROUT
    extends olLib.pointerEventTypeMod.EventType
  
  @js.native
  sealed trait POINTEROVER
    extends olLib.pointerEventTypeMod.EventType
  
  @js.native
  sealed trait POINTERUP
    extends olLib.pointerEventTypeMod.EventType
  
}

