package typings.pixiSpine.PIXI.spine.core

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventType with Double] = js.native
  /* 4 */ @js.native
  object complete extends TopLevel[complete with Double]
  
  /* 3 */ @js.native
  object dispose extends TopLevel[dispose with Double]
  
  /* 2 */ @js.native
  object end extends TopLevel[end with Double]
  
  /* 5 */ @js.native
  object event extends TopLevel[event with Double]
  
  /* 1 */ @js.native
  object interrupt extends TopLevel[interrupt with Double]
  
  /* 0 */ @js.native
  object start extends TopLevel[start with Double]
  
}

