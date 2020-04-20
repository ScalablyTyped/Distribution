package typings.officeJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides specific information about an error that occurred during an asynchronous data operation.
  *
  * @remarks
  * 
  * The Error object is accessed from the AsyncResult object that is returned in the function passed as the callback argument of an asynchronous 
  * data operation, such as the `setSelectedDataAsync` method of the Document object.
  */
trait Error extends js.Object {
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
}

