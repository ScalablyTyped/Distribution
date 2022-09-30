package typings.mobxStateTree

import typings.mobxStateTree.typeMod.ExtractCSTWithSTN
import typings.mobxStateTree.typeMod.IAnyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeCheckerMod {
  
  @JSImport("mobx-state-tree/dist/core/type/type-checker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def typecheck[IT /* <: IAnyType */](`type`: IT, value: ExtractCSTWithSTN[IT]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typecheck")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type IValidationContext = js.Array[IValidationContextEntry]
  
  trait IValidationContextEntry extends StObject {
    
    /** Subpath where the validation should be run, or an empty string to validate it all */
    var path: String
    
    /** Type to validate the subpath against */
    var `type`: IAnyType
  }
  object IValidationContextEntry {
    
    inline def apply(path: String, `type`: IAnyType): IValidationContextEntry = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IValidationContextEntry]
    }
    
    extension [Self <: IValidationContextEntry](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setType(value: IAnyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IValidationError extends StObject {
    
    /** Validation context */
    var context: IValidationContext
    
    /** Error message */
    var message: js.UndefOr[String] = js.undefined
    
    /** Value that was being validated, either a snapshot or an instance */
    var value: Any
  }
  object IValidationError {
    
    inline def apply(context: IValidationContext, value: Any): IValidationError = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IValidationError]
    }
    
    extension [Self <: IValidationError](x: Self) {
      
      inline def setContext(value: IValidationContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextVarargs(value: IValidationContextEntry*): Self = StObject.set(x, "context", js.Array(value*))
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type IValidationResult = js.Array[IValidationError]
}
