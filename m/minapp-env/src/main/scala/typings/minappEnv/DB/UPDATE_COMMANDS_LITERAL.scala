package typings.minappEnv.DB

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UPDATE_COMMANDS_LITERAL extends js.Object

@JSGlobal("DB.UPDATE_COMMANDS_LITERAL")
@js.native
object UPDATE_COMMANDS_LITERAL extends js.Object {
  @js.native
  sealed trait INC extends UPDATE_COMMANDS_LITERAL
  
  @js.native
  sealed trait MUL extends UPDATE_COMMANDS_LITERAL
  
  @js.native
  sealed trait POP extends UPDATE_COMMANDS_LITERAL
  
  @js.native
  sealed trait PUSH extends UPDATE_COMMANDS_LITERAL
  
  @js.native
  sealed trait REMOVE extends UPDATE_COMMANDS_LITERAL
  
  @js.native
  sealed trait SET extends UPDATE_COMMANDS_LITERAL
  
  @js.native
  sealed trait SHIFT extends UPDATE_COMMANDS_LITERAL
  
  @js.native
  sealed trait UNSHIFT extends UPDATE_COMMANDS_LITERAL
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[UPDATE_COMMANDS_LITERAL with String] = js.native
  /* "inc" */ @js.native
  object INC extends TopLevel[INC with String]
  
  /* "mul" */ @js.native
  object MUL extends TopLevel[MUL with String]
  
  /* "pop" */ @js.native
  object POP extends TopLevel[POP with String]
  
  /* "push" */ @js.native
  object PUSH extends TopLevel[PUSH with String]
  
  /* "remove" */ @js.native
  object REMOVE extends TopLevel[REMOVE with String]
  
  /* "set" */ @js.native
  object SET extends TopLevel[SET with String]
  
  /* "shift" */ @js.native
  object SHIFT extends TopLevel[SHIFT with String]
  
  /* "unshift" */ @js.native
  object UNSHIFT extends TopLevel[UNSHIFT with String]
  
}

