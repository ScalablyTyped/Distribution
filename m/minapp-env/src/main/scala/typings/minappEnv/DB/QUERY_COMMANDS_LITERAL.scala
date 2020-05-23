package typings.minappEnv.DB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QUERY_COMMANDS_LITERAL extends js.Object

@JSGlobal("DB.QUERY_COMMANDS_LITERAL")
@js.native
object QUERY_COMMANDS_LITERAL extends js.Object {
  @js.native
  sealed trait EQ extends QUERY_COMMANDS_LITERAL
  
  @js.native
  sealed trait GT extends QUERY_COMMANDS_LITERAL
  
  @js.native
  sealed trait GTE extends QUERY_COMMANDS_LITERAL
  
  @js.native
  sealed trait IN extends QUERY_COMMANDS_LITERAL
  
  @js.native
  sealed trait LT extends QUERY_COMMANDS_LITERAL
  
  @js.native
  sealed trait LTE extends QUERY_COMMANDS_LITERAL
  
  @js.native
  sealed trait NEQ extends QUERY_COMMANDS_LITERAL
  
  @js.native
  sealed trait NIN extends QUERY_COMMANDS_LITERAL
  
}

