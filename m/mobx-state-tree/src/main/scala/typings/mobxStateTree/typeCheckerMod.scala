package typings.mobxStateTree

import typings.mobxStateTree.typeMod.ExtractCSTWithSTN
import typings.mobxStateTree.typeMod.IAnyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeCheckerMod {
  
  @JSImport("mobx-state-tree/dist/core/type/type-checker", "typecheck")
  @js.native
  def typecheck[IT /* <: IAnyType */](`type`: IT, value: ExtractCSTWithSTN[IT]): Unit = js.native
  
  type IValidationContext = js.Array[IValidationContextEntry]
  
  @js.native
  trait IValidationContextEntry extends StObject {
    
    /** Subpath where the validation should be run, or an empty string to validate it all */
    var path: String = js.native
    
    /** Type to validate the subpath against */
    var `type`: IAnyType = js.native
  }
  object IValidationContextEntry {
    
    @scala.inline
    def apply(path: String, `type`: IAnyType): IValidationContextEntry = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IValidationContextEntry]
    }
    
    @scala.inline
    implicit class IValidationContextEntryMutableBuilder[Self <: IValidationContextEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: IAnyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IValidationError extends StObject {
    
    /** Validation context */
    var context: IValidationContext = js.native
    
    /** Error message */
    var message: js.UndefOr[String] = js.native
    
    /** Value that was being validated, either a snapshot or an instance */
    var value: js.Any = js.native
  }
  object IValidationError {
    
    @scala.inline
    def apply(context: IValidationContext, value: js.Any): IValidationError = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IValidationError]
    }
    
    @scala.inline
    implicit class IValidationErrorMutableBuilder[Self <: IValidationError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: IValidationContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextVarargs(value: IValidationContextEntry*): Self = StObject.set(x, "context", js.Array(value :_*))
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type IValidationResult = js.Array[IValidationError]
}
