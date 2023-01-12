package typings.mongodb.mod

import typings.mongodb.mongodbStrings.dropIndexes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeStreamDropIndexDocument
  extends StObject
     with ChangeStreamDocumentCommon
     with ChangeStreamDocumentCollectionUUID
     with ChangeStreamDocumentOperationDescription
     with ChangeStreamDocument[Any] {
  
  /** Describes the type of operation represented in this change notification */
  var operationType: dropIndexes
}
object ChangeStreamDropIndexDocument {
  
  inline def apply(_id: ResumeToken, collectionUUID: typings.bson.mod.Binary): ChangeStreamDropIndexDocument = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], collectionUUID = collectionUUID.asInstanceOf[js.Any], operationType = "dropIndexes")
    __obj.asInstanceOf[ChangeStreamDropIndexDocument]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeStreamDropIndexDocument] (val x: Self) extends AnyVal {
    
    inline def setOperationType(value: dropIndexes): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
  }
}
