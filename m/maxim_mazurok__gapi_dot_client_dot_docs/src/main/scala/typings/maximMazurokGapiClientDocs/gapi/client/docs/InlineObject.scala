package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineObject extends StObject {
  
  /** The properties of this inline object. */
  var inlineObjectProperties: js.UndefOr[InlineObjectProperties] = js.native
  
  /** The ID of this inline object. */
  var objectId: js.UndefOr[String] = js.native
  
  /** The suggested deletion IDs. If empty, then there are no suggested deletions of this content. */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.native
  
  /** The suggested changes to the inline object properties, keyed by suggestion ID. */
  var suggestedInlineObjectPropertiesChanges: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.SuggestedInlineObjectProperties}
    */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.InlineObject with TopLevel[js.Any]
  ] = js.native
  
  /** The suggested insertion ID. If empty, then this is not a suggested insertion. */
  var suggestedInsertionId: js.UndefOr[String] = js.native
}
object InlineObject {
  
  @scala.inline
  def apply(): InlineObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InlineObject]
  }
  
  @scala.inline
  implicit class InlineObjectMutableBuilder[Self <: InlineObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInlineObjectProperties(value: InlineObjectProperties): Self = StObject.set(x, "inlineObjectProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineObjectPropertiesUndefined: Self = StObject.set(x, "inlineObjectProperties", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    @scala.inline
    def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
    
    @scala.inline
    def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value :_*))
    
    @scala.inline
    def setSuggestedInlineObjectPropertiesChanges(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.SuggestedInlineObjectProperties}
      */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.InlineObject with TopLevel[js.Any]
    ): Self = StObject.set(x, "suggestedInlineObjectPropertiesChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedInlineObjectPropertiesChangesUndefined: Self = StObject.set(x, "suggestedInlineObjectPropertiesChanges", js.undefined)
    
    @scala.inline
    def setSuggestedInsertionId(value: String): Self = StObject.set(x, "suggestedInsertionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedInsertionIdUndefined: Self = StObject.set(x, "suggestedInsertionId", js.undefined)
  }
}
