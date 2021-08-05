package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineObject extends StObject {
  
  /** The properties of this inline object. */
  var inlineObjectProperties: js.UndefOr[InlineObjectProperties] = js.undefined
  
  /** The ID of this inline object. */
  var objectId: js.UndefOr[String] = js.undefined
  
  /** The suggested deletion IDs. If empty, then there are no suggested deletions of this content. */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The suggested changes to the inline object properties, keyed by suggestion ID. */
  var suggestedInlineObjectPropertiesChanges: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.SuggestedInlineObjectProperties}
    */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.InlineObject & TopLevel[js.Any]
  ] = js.undefined
  
  /** The suggested insertion ID. If empty, then this is not a suggested insertion. */
  var suggestedInsertionId: js.UndefOr[String] = js.undefined
}
object InlineObject {
  
  inline def apply(): InlineObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InlineObject]
  }
  
  extension [Self <: InlineObject](x: Self) {
    
    inline def setInlineObjectProperties(value: InlineObjectProperties): Self = StObject.set(x, "inlineObjectProperties", value.asInstanceOf[js.Any])
    
    inline def setInlineObjectPropertiesUndefined: Self = StObject.set(x, "inlineObjectProperties", js.undefined)
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
    
    inline def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
    
    inline def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value :_*))
    
    inline def setSuggestedInlineObjectPropertiesChanges(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.SuggestedInlineObjectProperties}
      */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.InlineObject & TopLevel[js.Any]
    ): Self = StObject.set(x, "suggestedInlineObjectPropertiesChanges", value.asInstanceOf[js.Any])
    
    inline def setSuggestedInlineObjectPropertiesChangesUndefined: Self = StObject.set(x, "suggestedInlineObjectPropertiesChanges", js.undefined)
    
    inline def setSuggestedInsertionId(value: String): Self = StObject.set(x, "suggestedInsertionId", value.asInstanceOf[js.Any])
    
    inline def setSuggestedInsertionIdUndefined: Self = StObject.set(x, "suggestedInsertionId", js.undefined)
  }
}
