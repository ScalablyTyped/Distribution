package typings.pixiSpine.PIXI.spine.core

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
  
}

