package typings.mongodb.mod

import typings.bson.mod.Document
import typings.mongodb.anon.DictshardKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeStreamDocumentKey[TSchema /* <: Document */] extends StObject {
  
  /**
    * For unsharded collections this contains a single field `_id`.
    * For sharded collections, this will contain all the components of the shard key
    */
  var documentKey: DictshardKey[TSchema]
}
object ChangeStreamDocumentKey {
  
  inline def apply[TSchema /* <: Document */](documentKey: DictshardKey[TSchema]): ChangeStreamDocumentKey[TSchema] = {
    val __obj = js.Dynamic.literal(documentKey = documentKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeStreamDocumentKey[TSchema]]
  }
  
  extension [Self <: ChangeStreamDocumentKey[?], TSchema /* <: Document */](x: Self & ChangeStreamDocumentKey[TSchema]) {
    
    inline def setDocumentKey(value: DictshardKey[TSchema]): Self = StObject.set(x, "documentKey", value.asInstanceOf[js.Any])
  }
}
