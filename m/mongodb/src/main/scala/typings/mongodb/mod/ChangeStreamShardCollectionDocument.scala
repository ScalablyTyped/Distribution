package typings.mongodb.mod

import typings.mongodb.mongodbStrings.shardCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeStreamShardCollectionDocument
  extends StObject
     with ChangeStreamDocumentCommon
     with ChangeStreamDocumentCollectionUUID
     with ChangeStreamDocumentOperationDescription
     with ChangeStreamDocument[Any] {
  
  /** Describes the type of operation represented in this change notification */
  var operationType: shardCollection
}
object ChangeStreamShardCollectionDocument {
  
  inline def apply(_id: ResumeToken, collectionUUID: typings.bson.mod.Binary): ChangeStreamShardCollectionDocument = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], collectionUUID = collectionUUID.asInstanceOf[js.Any], operationType = "shardCollection")
    __obj.asInstanceOf[ChangeStreamShardCollectionDocument]
  }
  
  extension [Self <: ChangeStreamShardCollectionDocument](x: Self) {
    
    inline def setOperationType(value: shardCollection): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
  }
}
