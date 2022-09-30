package typings.mongodb.mod

import typings.mongodb.mongodbStrings.createIndexes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeStreamCreateIndexDocument
  extends StObject
     with ChangeStreamDocumentCommon
     with ChangeStreamDocumentCollectionUUID
     with ChangeStreamDocumentOperationDescription
     with ChangeStreamDocument[Any] {
  
  /** Describes the type of operation represented in this change notification */
  var operationType: createIndexes
}
object ChangeStreamCreateIndexDocument {
  
  inline def apply(_id: ResumeToken, collectionUUID: typings.bson.mod.Binary): ChangeStreamCreateIndexDocument = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], collectionUUID = collectionUUID.asInstanceOf[js.Any], operationType = "createIndexes")
    __obj.asInstanceOf[ChangeStreamCreateIndexDocument]
  }
  
  extension [Self <: ChangeStreamCreateIndexDocument](x: Self) {
    
    inline def setOperationType(value: createIndexes): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
  }
}
