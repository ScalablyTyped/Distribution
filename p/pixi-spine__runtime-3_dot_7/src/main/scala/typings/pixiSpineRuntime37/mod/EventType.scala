package typings.pixiSpineRuntime37.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventType extends StObject
@JSImport("@pixi-spine/runtime-3.7", "EventType")
@js.native
object EventType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventType & Double] = js.native
  
  @js.native
  sealed trait complete
    extends StObject
       with EventType
  /* 4 */ val complete: typings.pixiSpineRuntime37.mod.EventType.complete & Double = js.native
  
  @js.native
  sealed trait dispose
    extends StObject
       with EventType
  /* 3 */ val dispose: typings.pixiSpineRuntime37.mod.EventType.dispose & Double = js.native
  
  @js.native
  sealed trait end
    extends StObject
       with EventType
  /* 2 */ val end: typings.pixiSpineRuntime37.mod.EventType.end & Double = js.native
  
  @js.native
  sealed trait event
    extends StObject
       with EventType
  /* 5 */ val event: typings.pixiSpineRuntime37.mod.EventType.event & Double = js.native
  
  @js.native
  sealed trait interrupt
    extends StObject
       with EventType
  /* 1 */ val interrupt: typings.pixiSpineRuntime37.mod.EventType.interrupt & Double = js.native
  
  @js.native
  sealed trait start
    extends StObject
       with EventType
  /* 0 */ val start: typings.pixiSpineRuntime37.mod.EventType.start & Double = js.native
}
