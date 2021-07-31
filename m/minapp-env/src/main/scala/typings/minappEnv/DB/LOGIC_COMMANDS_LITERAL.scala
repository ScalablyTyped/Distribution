package typings.minappEnv.DB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LOGIC_COMMANDS_LITERAL extends StObject
@JSGlobal("DB.LOGIC_COMMANDS_LITERAL")
@js.native
object LOGIC_COMMANDS_LITERAL extends StObject {
  
  @js.native
  sealed trait AND
    extends StObject
       with LOGIC_COMMANDS_LITERAL
  
  @js.native
  sealed trait NOR
    extends StObject
       with LOGIC_COMMANDS_LITERAL
  
  @js.native
  sealed trait NOT
    extends StObject
       with LOGIC_COMMANDS_LITERAL
  
  @js.native
  sealed trait OR
    extends StObject
       with LOGIC_COMMANDS_LITERAL
}
