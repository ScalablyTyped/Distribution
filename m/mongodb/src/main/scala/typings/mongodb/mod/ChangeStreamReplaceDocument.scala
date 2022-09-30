package typings.mongodb.mod

import typings.bson.mod.Document
import typings.mongodb.anon.DictshardKey
import typings.mongodb.mongodbStrings.replace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeStreamReplaceDocument[TSchema /* <: Document */]
  extends StObject
     with ChangeStreamDocumentCommon
     with ChangeStreamDocumentKey[TSchema]
     with ChangeStreamDocument[TSchema] {
  
  /** The fullDocument of a replace event represents the document after the insert of the replacement document */
  var fullDocument: TSchema
  
  /**
    * Contains the pre-image of the modified or deleted document if the
    * pre-image is available for the change event and either 'required' or
    * 'whenAvailable' was specified for the 'fullDocumentBeforeChange' option
    * when creating the change stream. If 'whenAvailable' was specified but the
    * pre-image is unavailable, this will be explicitly set to null.
    */
  var fullDocumentBeforeChange: js.UndefOr[TSchema] = js.undefined
  
  /** Namespace the replace event occured on */
  var ns: ChangeStreamNameSpace
  
  /** Describes the type of operation represented in this change notification */
  var operationType: replace
}
object ChangeStreamReplaceDocument {
  
  inline def apply[TSchema /* <: Document */](
    _id: ResumeToken,
    documentKey: DictshardKey[TSchema],
    fullDocument: TSchema,
    ns: ChangeStreamNameSpace
  ): ChangeStreamReplaceDocument[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], fullDocument = fullDocument.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = "replace")
    __obj.asInstanceOf[ChangeStreamReplaceDocument[TSchema]]
  }
  
  extension [Self <: ChangeStreamReplaceDocument[?], TSchema /* <: Document */](x: Self & ChangeStreamReplaceDocument[TSchema]) {
    
    inline def setFullDocument(value: TSchema): Self = StObject.set(x, "fullDocument", value.asInstanceOf[js.Any])
    
    inline def setFullDocumentBeforeChange(value: TSchema): Self = StObject.set(x, "fullDocumentBeforeChange", value.asInstanceOf[js.Any])
    
    inline def setFullDocumentBeforeChangeUndefined: Self = StObject.set(x, "fullDocumentBeforeChange", js.undefined)
    
    inline def setNs(value: ChangeStreamNameSpace): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
    
    inline def setOperationType(value: replace): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
  }
}
