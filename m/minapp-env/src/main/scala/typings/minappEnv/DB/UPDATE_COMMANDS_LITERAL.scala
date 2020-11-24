package typings.minappEnv.DB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
