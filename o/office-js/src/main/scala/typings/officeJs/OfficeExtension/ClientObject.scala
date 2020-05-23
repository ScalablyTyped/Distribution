package typings.officeJs.OfficeExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An abstract proxy object that represents an object in an Office document. 
  * You create proxy objects from the context (or from other proxy objects), add commands to a queue to act on the object, and then synchronize the 
  * proxy object state with the document by calling `context.sync()`.
  */
trait ClientObject extends js.Object {
  /** The request context associated with the object */
  var context: ClientRequestContext
  /**
    *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the 
    * isNullObject property.
    */
  var isNullObject: Boolean
}

object ClientObject {
  @scala.inline
  def apply(context: ClientRequestContext, isNullObject: Boolean): ClientObject = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], isNullObject = isNullObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientObject]
  }
}

