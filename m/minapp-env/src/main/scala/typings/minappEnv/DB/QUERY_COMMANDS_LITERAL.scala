package typings.minappEnv.DB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QUERY_COMMANDS_LITERAL extends StObject
@JSGlobal("DB.QUERY_COMMANDS_LITERAL")
@js.native
object QUERY_COMMANDS_LITERAL extends StObject {
  
  @js.native
  sealed trait EQ
    extends StObject
       with QUERY_COMMANDS_LITERAL
  
  @js.native
  sealed trait GT
    extends StObject
       with QUERY_COMMANDS_LITERAL
  
  @js.native
  sealed trait GTE
    extends StObject
       with QUERY_COMMANDS_LITERAL
  
  @js.native
  sealed trait IN
    extends StObject
       with QUERY_COMMANDS_LITERAL
  
  @js.native
  sealed trait LT
    extends StObject
       with QUERY_COMMANDS_LITERAL
  
  @js.native
  sealed trait LTE
    extends StObject
       with QUERY_COMMANDS_LITERAL
  
  @js.native
  sealed trait NEQ
    extends StObject
       with QUERY_COMMANDS_LITERAL
  
  @js.native
  sealed trait NIN
    extends StObject
       with QUERY_COMMANDS_LITERAL
}
