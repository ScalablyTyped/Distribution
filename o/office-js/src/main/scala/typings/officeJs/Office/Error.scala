package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides specific information about an error that occurred during an asynchronous data operation.
  *
  * @remarks
  * 
  * The Error object is accessed from the AsyncResult object that is returned in the function passed as the callback argument of an asynchronous 
  * data operation, such as the `setSelectedDataAsync` method of the Document object.
  */
trait Error extends StObject {
  
  /**
    * Gets the numeric code of the error. For a list of error codes, see {@link https://docs.microsoft.com/office/dev/add-ins/reference/javascript-api-for-office-error-codes | JavaScript API for Office error codes}.
    */
  var code: Double
  
  /**
    * Gets the name of the error.
    */
  var message: String
  
  /**
    * Gets a detailed description of the error.
    */
  var name: String
}
object Error {
  
  @scala.inline
  def apply(code: Double, message: String, name: String): Error = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  @scala.inline
  implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
