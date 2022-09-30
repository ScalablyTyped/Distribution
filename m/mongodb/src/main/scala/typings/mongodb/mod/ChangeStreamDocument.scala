package typings.mongodb.mod

import typings.bson.mod.Document
import typings.mongodb.anon.Coll
import typings.mongodb.anon.DictshardKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.mongodb.mod.ChangeStreamInsertDocument[TSchema]
  - typings.mongodb.mod.ChangeStreamUpdateDocument[TSchema]
  - typings.mongodb.mod.ChangeStreamReplaceDocument[TSchema]
  - typings.mongodb.mod.ChangeStreamDeleteDocument[TSchema]
  - typings.mongodb.mod.ChangeStreamDropDocument
  - typings.mongodb.mod.ChangeStreamRenameDocument
  - typings.mongodb.mod.ChangeStreamDropDatabaseDocument
  - typings.mongodb.mod.ChangeStreamInvalidateDocument
  - typings.mongodb.mod.ChangeStreamCreateIndexDocument
  - typings.mongodb.mod.ChangeStreamCreateDocument
  - typings.mongodb.mod.ChangeStreamCollModDocument
  - typings.mongodb.mod.ChangeStreamDropIndexDocument
  - typings.mongodb.mod.ChangeStreamShardCollectionDocument
  - typings.mongodb.mod.ChangeStreamReshardCollectionDocument
  - typings.mongodb.mod.ChangeStreamRefineCollectionShardKeyDocument
*/
trait ChangeStreamDocument[TSchema /* <: Document */] extends StObject
object ChangeStreamDocument {
  
  inline def ChangeStreamCollModDocument(_id: ResumeToken, collectionUUID: typings.bson.mod.Binary): typings.mongodb.mod.ChangeStreamCollModDocument = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], collectionUUID = collectionUUID.asInstanceOf[js.Any], operationType = "modify")
    __obj.asInstanceOf[typings.mongodb.mod.ChangeStreamCollModDocument]
  }
  
  inline def ChangeStreamCreateDocument(_id: ResumeToken, collectionUUID: typings.bson.mod.Binary): typings.mongodb.mod.ChangeStreamCreateDocument = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], collectionUUID = collectionUUID.asInstanceOf[js.Any], operationType = "create")
    __obj.asInstanceOf[typings.mongodb.mod.ChangeStreamCreateDocument]
  }
  
  inline def ChangeStreamCreateIndexDocument(_id: ResumeToken, collectionUUID: typings.bson.mod.Binary): typings.mongodb.mod.ChangeStreamCreateIndexDocument = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], collectionUUID = collectionUUID.asInstanceOf[js.Any], operationType = "createIndexes")
    __obj.asInstanceOf[typings.mongodb.mod.ChangeStreamCreateIndexDocument]
  }
  
  inline def ChangeStreamDeleteDocument[TSchema /* <: Document */](
    _id: ResumeToken,
    collectionUUID: typings.bson.mod.Binary,
    documentKey: DictshardKey[TSchema],
    ns: ChangeStreamNameSpace
  ): typings.mongodb.mod.ChangeStreamDeleteDocument[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], collectionUUID = collectionUUID.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = "delete")
    __obj.asInstanceOf[typings.mongodb.mod.ChangeStreamDeleteDocument[TSchema]]
  }
  
  inline def ChangeStreamDropDatabaseDocument(_id: ResumeToken, ns: typings.mongodb.anon.Db): typings.mongodb.mod.ChangeStreamDropDatabaseDocument = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = "dropDatabase")
    __obj.asInstanceOf[typings.mongodb.mod.ChangeStreamDropDatabaseDocument]
  }
  
  inline def ChangeStreamDropDocument(_id: ResumeToken, collectionUUID: typings.bson.mod.Binary, ns: ChangeStreamNameSpace): typings.mongodb.mod.ChangeStreamDropDocument = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], collectionUUID = collectionUUID.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = "drop")
    __obj.asInstanceOf[typings.mongodb.mod.ChangeStreamDropDocument]
  }
  
  inline def ChangeStreamDropIndexDocument(_id: ResumeToken, collectionUUID: typings.bson.mod.Binary): typings.mongodb.mod.ChangeStreamDropIndexDocument = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], collectionUUID = collectionUUID.asInstanceOf[js.Any], operationType = "dropIndexes")
    __obj.asInstanceOf[typings.mongodb.mod.ChangeStreamDropIndexDocument]
  }
  
  inline def ChangeStreamInsertDocument[TSchema /* <: Document */](
    _id: ResumeToken,
    collectionUUID: typings.bson.mod.Binary,
    documentKey: DictshardKey[TSchema],
    fullDocument: TSchema,
    ns: ChangeStreamNameSpace
  ): typings.mongodb.mod.ChangeStreamInsertDocument[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], collectionUUID = collectionUUID.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], fullDocument = fullDocument.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = "insert")
    __obj.asInstanceOf[typings.mongodb.mod.ChangeStreamInsertDocument[TSchema]]
  }
  
  inline def ChangeStreamInvalidateDocument(_id: ResumeToken): typings.mongodb.mod.ChangeStreamInvalidateDocument = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], operationType = "invalidate")
    __obj.asInstanceOf[typings.mongodb.mod.ChangeStreamInvalidateDocument]
  }
  
  inline def ChangeStreamRefineCollectionShardKeyDocument(_id: ResumeToken, collectionUUID: typings.bson.mod.Binary): typings.mongodb.mod.ChangeStreamRefineCollectionShardKeyDocument = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], collectionUUID = collectionUUID.asInstanceOf[js.Any], operationType = "refineCollectionShardKey")
    __obj.asInstanceOf[typings.mongodb.mod.ChangeStreamRefineCollectionShardKeyDocument]
  }
  
  inline def ChangeStreamRenameDocument(_id: ResumeToken, collectionUUID: typings.bson.mod.Binary, ns: ChangeStreamNameSpace, to: Coll): typings.mongodb.mod.ChangeStreamRenameDocument = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], collectionUUID = collectionUUID.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = "rename", to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mongodb.mod.ChangeStreamRenameDocument]
  }
  
  inline def ChangeStreamReplaceDocument[TSchema /* <: Document */](
    _id: ResumeToken,
    documentKey: DictshardKey[TSchema],
    fullDocument: TSchema,
    ns: ChangeStreamNameSpace
  ): typings.mongodb.mod.ChangeStreamReplaceDocument[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], fullDocument = fullDocument.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = "replace")
    __obj.asInstanceOf[typings.mongodb.mod.ChangeStreamReplaceDocument[TSchema]]
  }
  
  inline def ChangeStreamReshardCollectionDocument(_id: ResumeToken, collectionUUID: typings.bson.mod.Binary): typings.mongodb.mod.ChangeStreamReshardCollectionDocument = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], collectionUUID = collectionUUID.asInstanceOf[js.Any], operationType = "reshardCollection")
    __obj.asInstanceOf[typings.mongodb.mod.ChangeStreamReshardCollectionDocument]
  }
  
  inline def ChangeStreamShardCollectionDocument(_id: ResumeToken, collectionUUID: typings.bson.mod.Binary): typings.mongodb.mod.ChangeStreamShardCollectionDocument = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], collectionUUID = collectionUUID.asInstanceOf[js.Any], operationType = "shardCollection")
    __obj.asInstanceOf[typings.mongodb.mod.ChangeStreamShardCollectionDocument]
  }
  
  inline def ChangeStreamUpdateDocument[TSchema /* <: Document */](
    _id: ResumeToken,
    collectionUUID: typings.bson.mod.Binary,
    documentKey: DictshardKey[TSchema],
    ns: ChangeStreamNameSpace,
    updateDescription: UpdateDescription[TSchema]
  ): typings.mongodb.mod.ChangeStreamUpdateDocument[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], collectionUUID = collectionUUID.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = "update", updateDescription = updateDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mongodb.mod.ChangeStreamUpdateDocument[TSchema]]
  }
}
