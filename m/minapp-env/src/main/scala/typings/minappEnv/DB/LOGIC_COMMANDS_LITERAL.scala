package typings.minappEnv.DB

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LOGIC_COMMANDS_LITERAL with String] = js.native
  /* "and" */ @js.native
  object AND extends TopLevel[AND with String]
  
  /* "nor" */ @js.native
  object NOR extends TopLevel[NOR with String]
  
  /* "not" */ @js.native
  object NOT extends TopLevel[NOT with String]
  
  /* "or" */ @js.native
  object OR extends TopLevel[OR with String]
  
}

