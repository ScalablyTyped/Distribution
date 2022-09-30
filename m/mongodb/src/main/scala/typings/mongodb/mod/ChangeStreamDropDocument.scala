package typings.mongodb.mod

import typings.mongodb.mongodbStrings.drop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeStreamDropDocument
  extends StObject
     with ChangeStreamDocumentCommon
     with ChangeStreamDocumentCollectionUUID
     with ChangeStreamDocument[Any] {
  
  /** Namespace the drop event occured on */
  var ns: ChangeStreamNameSpace
  
  /** Describes the type of operation represented in this change notification */
  var operationType: drop
}
object ChangeStreamDropDocument {
  
  inline def apply(_id: ResumeToken, collectionUUID: typings.bson.mod.Binary, ns: ChangeStreamNameSpace): ChangeStreamDropDocument = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], collectionUUID = collectionUUID.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = "drop")
    __obj.asInstanceOf[ChangeStreamDropDocument]
  }
  
  extension [Self <: ChangeStreamDropDocument](x: Self) {
    
    inline def setNs(value: ChangeStreamNameSpace): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
    
    inline def setOperationType(value: drop): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
  }
}
