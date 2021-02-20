package typings.officeJsPreview.OfficeExtension

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An abstract proxy object that represents an object in an Office document.
  * You create proxy objects from the context (or from other proxy objects), add commands to a queue to act on the object, and then synchronize the
  * proxy object state with the document by calling `context.sync()`.
  */
@js.native
trait ClientObject extends StObject {
  
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
  implicit class ClientObjectMutableBuilder[Self <: ClientObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: ClientRequestContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNullObject(value: Boolean): Self = StObject.set(x, "isNullObject", value.asInstanceOf[js.Any])
  }
}
