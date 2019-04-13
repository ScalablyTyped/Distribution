package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides specific information about an error that occurred during an asynchronous data operation.
  *
  * @remarks
  * The Error object is accessed from the AsyncResult object that is returned in the function passed as the callback argument of an asynchronous 
  * data operation, such as the `setSelectedDataAsync` method of the Document object.
  */
trait Error extends js.Object {
  /**
    * Gets the numeric code of the error.
    */
  var code: scala.Double
  /**
    * Gets the name of the error.
    */
  var message: java.lang.String
  /**
    * Gets a detailed description of the error.
    */
  var name: java.lang.String
}

object Error {
  @scala.inline
  def apply(code: scala.Double, message: java.lang.String, name: java.lang.String): Error = {
    val __obj = js.Dynamic.literal(code = code, message = message, name = name)
  
    __obj.asInstanceOf[Error]
  }
}

