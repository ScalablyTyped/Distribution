package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnBreak extends StObject {
  
  /** The suggested deletion IDs. If empty, then there are no suggested deletions of this content. */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The suggested insertion IDs. A ColumnBreak may have multiple insertion IDs if it is a nested suggested change. If empty, then this is not a suggested insertion. */
  var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The suggested text style changes to this ColumnBreak, keyed by suggestion ID. */
  var suggestedTextStyleChanges: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.SuggestedTextStyle}
    */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.ColumnBreak & TopLevel[js.Any]
  ] = js.undefined
  
  /**
    * The text style of this ColumnBreak. Similar to text content, like text runs and footnote references, the text style of a column break can affect content layout as well as the
    * styling of text inserted adjacent to it.
    */
  var textStyle: js.UndefOr[TextStyle] = js.undefined
}
object ColumnBreak {
  
  @scala.inline
  def apply(): ColumnBreak = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnBreak]
  }
  
  @scala.inline
  implicit class ColumnBreakMutableBuilder[Self <: ColumnBreak] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
    
    @scala.inline
    def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value :_*))
    
    @scala.inline
    def setSuggestedInsertionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedInsertionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedInsertionIdsUndefined: Self = StObject.set(x, "suggestedInsertionIds", js.undefined)
    
    @scala.inline
    def setSuggestedInsertionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedInsertionIds", js.Array(value :_*))
    
    @scala.inline
    def setSuggestedTextStyleChanges(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.SuggestedTextStyle}
      */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.ColumnBreak & TopLevel[js.Any]
    ): Self = StObject.set(x, "suggestedTextStyleChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedTextStyleChangesUndefined: Self = StObject.set(x, "suggestedTextStyleChanges", js.undefined)
    
    @scala.inline
    def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
  }
}
