package typings.minappEnv.DB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UPDATE_COMMANDS_LITERAL extends StObject
@JSGlobal("DB.UPDATE_COMMANDS_LITERAL")
@js.native
object UPDATE_COMMANDS_LITERAL extends StObject {
  
  @js.native
  sealed trait INC
    extends StObject
       with UPDATE_COMMANDS_LITERAL
  
  @js.native
  sealed trait MUL
    extends StObject
       with UPDATE_COMMANDS_LITERAL
  
  @js.native
  sealed trait POP
    extends StObject
       with UPDATE_COMMANDS_LITERAL
  
  @js.native
  sealed trait PUSH
    extends StObject
       with UPDATE_COMMANDS_LITERAL
  
  @js.native
  sealed trait REMOVE
    extends StObject
       with UPDATE_COMMANDS_LITERAL
  
  @js.native
  sealed trait SET
    extends StObject
       with UPDATE_COMMANDS_LITERAL
  
  @js.native
  sealed trait SHIFT
    extends StObject
       with UPDATE_COMMANDS_LITERAL
  
  @js.native
  sealed trait UNSHIFT
    extends StObject
       with UPDATE_COMMANDS_LITERAL
}
