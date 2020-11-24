package typings.minappEnv.DB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LOGIC_COMMANDS_LITERAL extends js.Object
@JSGlobal("DB.LOGIC_COMMANDS_LITERAL")
@js.native
object LOGIC_COMMANDS_LITERAL extends js.Object {
  
  @js.native
  sealed trait AND extends LOGIC_COMMANDS_LITERAL
  
  @js.native
  sealed trait NOR extends LOGIC_COMMANDS_LITERAL
  
  @js.native
  sealed trait NOT extends LOGIC_COMMANDS_LITERAL
  
  @js.native
  sealed trait OR extends LOGIC_COMMANDS_LITERAL
}
