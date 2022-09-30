package typings.mongodb.mod

import typings.mongodb.mongodbStrings.create
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeStreamCreateDocument
  extends StObject
     with ChangeStreamDocumentCommon
     with ChangeStreamDocumentCollectionUUID
     with ChangeStreamDocument[Any] {
  
  /** Describes the type of operation represented in this change notification */
  var operationType: create
}
object ChangeStreamCreateDocument {
  
  inline def apply(_id: ResumeToken, collectionUUID: typings.bson.mod.Binary): ChangeStreamCreateDocument = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], collectionUUID = collectionUUID.asInstanceOf[js.Any], operationType = "create")
    __obj.asInstanceOf[ChangeStreamCreateDocument]
  }
  
  extension [Self <: ChangeStreamCreateDocument](x: Self) {
    
    inline def setOperationType(value: create): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
  }
}
