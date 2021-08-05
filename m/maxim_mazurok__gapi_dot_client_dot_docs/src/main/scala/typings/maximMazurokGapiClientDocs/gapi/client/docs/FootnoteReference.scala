package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FootnoteReference extends StObject {
  
  /** The ID of the footnote that contains the content of this footnote reference. */
  var footnoteId: js.UndefOr[String] = js.undefined
  
  /** The rendered number of this footnote. */
  var footnoteNumber: js.UndefOr[String] = js.undefined
  
  /** The suggested deletion IDs. If empty, then there are no suggested deletions of this content. */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The suggested insertion IDs. A FootnoteReference may have multiple insertion IDs if it is a nested suggested change. If empty, then this is not a suggested insertion. */
  var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The suggested text style changes to this FootnoteReference, keyed by suggestion ID. */
  var suggestedTextStyleChanges: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.SuggestedTextStyle}
    */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.FootnoteReference & TopLevel[js.Any]
  ] = js.undefined
  
  /** The text style of this FootnoteReference. */
  var textStyle: js.UndefOr[TextStyle] = js.undefined
}
object FootnoteReference {
  
  inline def apply(): FootnoteReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FootnoteReference]
  }
  
  extension [Self <: FootnoteReference](x: Self) {
    
    inline def setFootnoteId(value: String): Self = StObject.set(x, "footnoteId", value.asInstanceOf[js.Any])
    
    inline def setFootnoteIdUndefined: Self = StObject.set(x, "footnoteId", js.undefined)
    
    inline def setFootnoteNumber(value: String): Self = StObject.set(x, "footnoteNumber", value.asInstanceOf[js.Any])
    
    inline def setFootnoteNumberUndefined: Self = StObject.set(x, "footnoteNumber", js.undefined)
    
    inline def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
    
    inline def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
    
    inline def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value :_*))
    
    inline def setSuggestedInsertionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedInsertionIds", value.asInstanceOf[js.Any])
    
    inline def setSuggestedInsertionIdsUndefined: Self = StObject.set(x, "suggestedInsertionIds", js.undefined)
    
    inline def setSuggestedInsertionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedInsertionIds", js.Array(value :_*))
    
    inline def setSuggestedTextStyleChanges(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.SuggestedTextStyle}
      */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.FootnoteReference & TopLevel[js.Any]
    ): Self = StObject.set(x, "suggestedTextStyleChanges", value.asInstanceOf[js.Any])
    
    inline def setSuggestedTextStyleChangesUndefined: Self = StObject.set(x, "suggestedTextStyleChanges", js.undefined)
    
    inline def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
  }
}
