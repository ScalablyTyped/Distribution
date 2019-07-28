package typings.pixiDashSpine.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventType extends js.Object

@JSGlobal("PIXI.spine.core.EventType")
@js.native
object EventType extends js.Object {
  @js.native
  sealed trait complete extends EventType
  
  @js.native
  sealed trait dispose extends EventType
  
  @js.native
  sealed trait end extends EventType
  
  @js.native
  sealed trait event extends EventType
  
  @js.native
  sealed trait interrupt extends EventType
  
  @js.native
  sealed trait start extends EventType
  
  /* 4 */ val complete: typings.pixiDashSpine.PIXINs.spineNs.coreNs.EventType.complete with Double = js.native
  /* 3 */ val dispose: typings.pixiDashSpine.PIXINs.spineNs.coreNs.EventType.dispose with Double = js.native
  /* 2 */ val end: typings.pixiDashSpine.PIXINs.spineNs.coreNs.EventType.end with Double = js.native
  /* 5 */ val event: typings.pixiDashSpine.PIXINs.spineNs.coreNs.EventType.event with Double = js.native
  /* 1 */ val interrupt: typings.pixiDashSpine.PIXINs.spineNs.coreNs.EventType.interrupt with Double = js.native
  /* 0 */ val start: typings.pixiDashSpine.PIXINs.spineNs.coreNs.EventType.start with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventType with Double] = js.native
}

