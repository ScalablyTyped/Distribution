package typings.mongodb.mod

import typings.mongodb.mongodbStrings.invalidate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeStreamInvalidateDocument
  extends StObject
     with ChangeStreamDocumentCommon
     with ChangeStreamDocument[Any] {
  
  /** Describes the type of operation represented in this change notification */
  var operationType: invalidate
}
object ChangeStreamInvalidateDocument {
  
  inline def apply(_id: ResumeToken): ChangeStreamInvalidateDocument = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], operationType = "invalidate")
    __obj.asInstanceOf[ChangeStreamInvalidateDocument]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeStreamInvalidateDocument] (val x: Self) extends AnyVal {
    
    inline def setOperationType(value: invalidate): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
  }
}
