package typings.mongodb.mod

import typings.bson.mod.Document
import typings.mongodb.anon.DictshardKey
import typings.mongodb.mongodbStrings.insert
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeStreamInsertDocument[TSchema /* <: Document */]
  extends StObject
     with ChangeStreamDocumentCommon
     with ChangeStreamDocumentKey[TSchema]
     with ChangeStreamDocumentCollectionUUID
     with ChangeStreamDocument[TSchema] {
  
  /** This key will contain the document being inserted */
  var fullDocument: TSchema
  
  /** Namespace the insert event occured on */
  var ns: ChangeStreamNameSpace
  
  /** Describes the type of operation represented in this change notification */
  var operationType: insert
}
object ChangeStreamInsertDocument {
  
  inline def apply[TSchema /* <: Document */](
    _id: ResumeToken,
    collectionUUID: typings.bson.mod.Binary,
    documentKey: DictshardKey[TSchema],
    fullDocument: TSchema,
    ns: ChangeStreamNameSpace
  ): ChangeStreamInsertDocument[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], collectionUUID = collectionUUID.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], fullDocument = fullDocument.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = "insert")
    __obj.asInstanceOf[ChangeStreamInsertDocument[TSchema]]
  }
  
  extension [Self <: ChangeStreamInsertDocument[?], TSchema /* <: Document */](x: Self & ChangeStreamInsertDocument[TSchema]) {
    
    inline def setFullDocument(value: TSchema): Self = StObject.set(x, "fullDocument", value.asInstanceOf[js.Any])
    
    inline def setNs(value: ChangeStreamNameSpace): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
    
    inline def setOperationType(value: insert): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
  }
}
