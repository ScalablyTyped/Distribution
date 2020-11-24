package typings.officeJsPreview.OfficeExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An abstract proxy object that represents an object in an Office document.
  * You create proxy objects from the context (or from other proxy objects), add commands to a queue to act on the object, and then synchronize the
  * proxy object state with the document by calling `context.sync()`.
  */
@js.native
trait ClientObject extends js.Object {
  
  /** The request context associated with the object */
  var context: ClientRequestContext = js.native
  
  /**
    *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
    * isNullObject property.
    */
  var isNullObject: Boolean = js.native
}
object ClientObject {
  
  @scala.inline
  def apply(context: ClientRequestContext, isNullObject: Boolean): ClientObject = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], isNullObject = isNullObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientObject]
  }
  
  @scala.inline
  implicit class ClientObjectOps[Self <: ClientObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContext(value: ClientRequestContext): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNullObject(value: Boolean): Self = this.set("isNullObject", value.asInstanceOf[js.Any])
  }
}
