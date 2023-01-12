package typings.mongodb.mod

import typings.bson.mod.Document
import typings.mongodb.anon.DictshardKey
import typings.mongodb.mongodbStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeStreamUpdateDocument[TSchema /* <: Document */]
  extends StObject
     with ChangeStreamDocumentCommon
     with ChangeStreamDocumentKey[TSchema]
     with ChangeStreamDocumentCollectionUUID
     with ChangeStreamDocument[TSchema] {
  
  /**
    * This is only set if `fullDocument` is set to `'updateLookup'`
    * Contains the point-in-time post-image of the modified document if the
    * post-image is available and either 'required' or 'whenAvailable' was
    * specified for the 'fullDocument' option when creating the change stream.
    */
  var fullDocument: js.UndefOr[TSchema] = js.undefined
  
  /**
    * Contains the pre-image of the modified or deleted document if the
    * pre-image is available for the change event and either 'required' or
    * 'whenAvailable' was specified for the 'fullDocumentBeforeChange' option
    * when creating the change stream. If 'whenAvailable' was specified but the
    * pre-image is unavailable, this will be explicitly set to null.
    */
  var fullDocumentBeforeChange: js.UndefOr[TSchema] = js.undefined
  
  /** Namespace the update event occurred on */
  var ns: ChangeStreamNameSpace
  
  /** Describes the type of operation represented in this change notification */
  var operationType: update
  
  /** Contains a description of updated and removed fields in this operation */
  var updateDescription: UpdateDescription[TSchema]
}
object ChangeStreamUpdateDocument {
  
  inline def apply[TSchema /* <: Document */](
    _id: ResumeToken,
    collectionUUID: typings.bson.mod.Binary,
    documentKey: DictshardKey[TSchema],
    ns: ChangeStreamNameSpace,
    updateDescription: UpdateDescription[TSchema]
  ): ChangeStreamUpdateDocument[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], collectionUUID = collectionUUID.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = "update", updateDescription = updateDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeStreamUpdateDocument[TSchema]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeStreamUpdateDocument[?], TSchema /* <: Document */] (val x: Self & ChangeStreamUpdateDocument[TSchema]) extends AnyVal {
    
    inline def setFullDocument(value: TSchema): Self = StObject.set(x, "fullDocument", value.asInstanceOf[js.Any])
    
    inline def setFullDocumentBeforeChange(value: TSchema): Self = StObject.set(x, "fullDocumentBeforeChange", value.asInstanceOf[js.Any])
    
    inline def setFullDocumentBeforeChangeUndefined: Self = StObject.set(x, "fullDocumentBeforeChange", js.undefined)
    
    inline def setFullDocumentUndefined: Self = StObject.set(x, "fullDocument", js.undefined)
    
    inline def setNs(value: ChangeStreamNameSpace): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
    
    inline def setOperationType(value: update): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    inline def setUpdateDescription(value: UpdateDescription[TSchema]): Self = StObject.set(x, "updateDescription", value.asInstanceOf[js.Any])
  }
}
