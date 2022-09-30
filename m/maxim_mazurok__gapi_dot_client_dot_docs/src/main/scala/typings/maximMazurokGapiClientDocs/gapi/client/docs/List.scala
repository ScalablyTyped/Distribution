package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait List extends StObject {
  
  /** The properties of the list. */
  var listProperties: js.UndefOr[ListProperties] = js.undefined
  
  /** The suggested deletion IDs. If empty, then there are no suggested deletions of this list. */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The suggested insertion ID. If empty, then this is not a suggested insertion. */
  var suggestedInsertionId: js.UndefOr[String] = js.undefined
  
  /** The suggested changes to the list properties, keyed by suggestion ID. */
  var suggestedListPropertiesChanges: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.SuggestedListProperties}
    */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.List & TopLevel[Any]
  ] = js.undefined
}
object List {
  
  inline def apply(): typings.maximMazurokGapiClientDocs.gapi.client.docs.List = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.maximMazurokGapiClientDocs.gapi.client.docs.List]
  }
  
  extension [Self <: typings.maximMazurokGapiClientDocs.gapi.client.docs.List](x: Self) {
    
    inline def setListProperties(value: ListProperties): Self = StObject.set(x, "listProperties", value.asInstanceOf[js.Any])
    
    inline def setListPropertiesUndefined: Self = StObject.set(x, "listProperties", js.undefined)
    
    inline def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
    
    inline def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
    
    inline def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value*))
    
    inline def setSuggestedInsertionId(value: String): Self = StObject.set(x, "suggestedInsertionId", value.asInstanceOf[js.Any])
    
    inline def setSuggestedInsertionIdUndefined: Self = StObject.set(x, "suggestedInsertionId", js.undefined)
    
    inline def setSuggestedListPropertiesChanges(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.SuggestedListProperties}
      */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.List & TopLevel[Any]
    ): Self = StObject.set(x, "suggestedListPropertiesChanges", value.asInstanceOf[js.Any])
    
    inline def setSuggestedListPropertiesChangesUndefined: Self = StObject.set(x, "suggestedListPropertiesChanges", js.undefined)
  }
}
