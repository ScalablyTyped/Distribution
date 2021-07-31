package typings.officeJsPreview.OfficeExtension

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the result for methods that return primitive types. The object's value property is retrieved from the document after `context.sync()` is invoked. */
trait ClientResult[T] extends StObject {
  
  /** The value of the result that is retrieved from the document after `context.sync()` is invoked. */
  var value: T
}
object ClientResult {
  
  @scala.inline
  def apply[T](value: T): ClientResult[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientResult[T]]
  }
  
  @scala.inline
  implicit class ClientResultMutableBuilder[Self <: ClientResult[?], T] (val x: Self & ClientResult[T]) extends AnyVal {
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
