package typings.meteorMdgValidationError

import org.scalablytyped.runtime.StringDictionary
import typings.meteor.Meteor.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line no-single-declare-module
object meteorMdgColonvalidationErrorMod {
  
  @JSImport("meteor/mdg:validation-error", "ValidationError")
  @js.native
  open class ValidationError protected ()
    extends StObject
       with Error {
    /**
      * @param errors The "details" property of the ValidationError must be an array of objects containing at least two properties. The "name" and "type" properties are required.
      */
    def this(errors: js.Array[ValidationErrorDetail]) = this()
    def this(errors: js.Array[ValidationErrorDetail], message: String) = this()
    
    /* CompleteClass */
    var error: String | Double = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  object ValidationError {
    
    @JSImport("meteor/mdg:validation-error", "ValidationError")
    @js.native
    val ^ : js.Any = js.native
    
    /**  Default validation error message that can be changed globally. */
    /* static member */
    @JSImport("meteor/mdg:validation-error", "ValidationError.DEFAULT_MESSAGE")
    @js.native
    def DEFAULT_MESSAGE: String = js.native
    inline def DEFAULT_MESSAGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MESSAGE")(x.asInstanceOf[js.Any])
    
    /**  Universal validation error code to be use in applications and packages. */
    /* static member */
    @JSImport("meteor/mdg:validation-error", "ValidationError.ERROR_CODE")
    @js.native
    def ERROR_CODE: String = js.native
    inline def ERROR_CODE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CODE")(x.asInstanceOf[js.Any])
    
    /** Static method checking if a given Meteor.Error is an instance of ValidationError. */
    /* static member */
    inline def is(err: Any): /* is meteor-mdg-validation-error.meteor/mdg:validation-error.ValidationError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(err.asInstanceOf[js.Any]).asInstanceOf[/* is meteor-mdg-validation-error.meteor/mdg:validation-error.ValidationError */ Boolean]
  }
  
  trait ValidationErrorDetail
    extends StObject
       with /* name */ StringDictionary[Any] {
    
    var name: String
    
    var `type`: String
  }
  object ValidationErrorDetail {
    
    inline def apply(name: String, `type`: String): ValidationErrorDetail = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationErrorDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValidationErrorDetail] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
