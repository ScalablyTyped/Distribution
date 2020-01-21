package typings.officeJs.OfficeExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An abstract proxy object that represents an object in an Office document. 
  * You create proxy objects from the context (or from other proxy objects), add commands to a queue to act on the object, and then synchronize the 
  * proxy object state with the document by calling `context.sync()`.
  */
@JSGlobal("OfficeExtension.ClientObject")
@js.native
class ClientObject () extends js.Object {
  /** The request context associated with the object */
  var context: ClientRequestContext = js.native
  /**
    *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the 
    * isNullObject property.
    */
  var isNullObject: Boolean = js.native
}

