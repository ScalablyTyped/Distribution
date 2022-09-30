package typings.mongodb.mod

import typings.mongodb.mongodbStrings.modify
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeStreamCollModDocument
  extends StObject
     with ChangeStreamDocumentCommon
     with ChangeStreamDocumentCollectionUUID
     with ChangeStreamDocument[Any] {
  
  /** Describes the type of operation represented in this change notification */
  var operationType: modify
}
object ChangeStreamCollModDocument {
  
  inline def apply(_id: ResumeToken, collectionUUID: typings.bson.mod.Binary): ChangeStreamCollModDocument = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], collectionUUID = collectionUUID.asInstanceOf[js.Any], operationType = "modify")
    __obj.asInstanceOf[ChangeStreamCollModDocument]
  }
  
  extension [Self <: ChangeStreamCollModDocument](x: Self) {
    
    inline def setOperationType(value: modify): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
  }
}
