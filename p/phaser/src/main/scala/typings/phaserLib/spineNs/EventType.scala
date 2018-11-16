package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventType extends js.Object

@JSGlobal("spine.EventType")
@js.native
object EventType extends js.Object {
  @js.native
  sealed trait complete
    extends phaserLib.spineNs.EventType
  
  @js.native
  sealed trait dispose
    extends phaserLib.spineNs.EventType
  
  @js.native
  sealed trait end
    extends phaserLib.spineNs.EventType
  
  @js.native
  sealed trait event
    extends phaserLib.spineNs.EventType
  
  @js.native
  sealed trait interrupt
    extends phaserLib.spineNs.EventType
  
  @js.native
  sealed trait start
    extends phaserLib.spineNs.EventType
  
  /* 4 */ val complete: complete with scala.Double = js.native
  /* 3 */ val dispose: dispose with scala.Double = js.native
  /* 2 */ val end: end with scala.Double = js.native
  /* 5 */ val event: event with scala.Double = js.native
  /* 1 */ val interrupt: interrupt with scala.Double = js.native
  /* 0 */ val start: start with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[phaserLib.spineNs.EventType with scala.Double] = js.native
}

