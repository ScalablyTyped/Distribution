package typings.minappEnv.DB

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[QUERY_COMMANDS_LITERAL with String] = js.native
  /* "eq" */ @js.native
  object EQ extends TopLevel[EQ with String]
  
  /* "gt" */ @js.native
  object GT extends TopLevel[GT with String]
  
  /* "gte" */ @js.native
  object GTE extends TopLevel[GTE with String]
  
  /* "in" */ @js.native
  object IN extends TopLevel[IN with String]
  
  /* "lt" */ @js.native
  object LT extends TopLevel[LT with String]
  
  /* "lte" */ @js.native
  object LTE extends TopLevel[LTE with String]
  
  /* "neq" */ @js.native
  object NEQ extends TopLevel[NEQ with String]
  
  /* "nin" */ @js.native
  object NIN extends TopLevel[NIN with String]
  
}

