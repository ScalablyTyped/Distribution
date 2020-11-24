package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FootnoteReference extends js.Object {
  
  /** The ID of the footnote that contains the content of this footnote reference. */
  var footnoteId: js.UndefOr[String] = js.native
  
  /** The rendered number of this footnote. */
  var footnoteNumber: js.UndefOr[String] = js.native
  
  /** The suggested deletion IDs. If empty, then there are no suggested deletions of this content. */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.native
  
  /** The suggested insertion IDs. A FootnoteReference may have multiple insertion IDs if it is a nested suggested change. If empty, then this is not a suggested insertion. */
  var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.native
  
  /** The suggested text style changes to this FootnoteReference, keyed by suggestion ID. */
  var suggestedTextStyleChanges: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.SuggestedTextStyle}
    */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.FootnoteReference with TopLevel[js.Any]
  ] = js.native
  
  /** The text style of this FootnoteReference. */
  var textStyle: js.UndefOr[TextStyle] = js.native
}
object FootnoteReference {
  
  @scala.inline
  def apply(): FootnoteReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FootnoteReference]
  }
  
  @scala.inline
  implicit class FootnoteReferenceOps[Self <: FootnoteReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFootnoteId(value: String): Self = this.set("footnoteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFootnoteId: Self = this.set("footnoteId", js.undefined)
    
    @scala.inline
    def setFootnoteNumber(value: String): Self = this.set("footnoteNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFootnoteNumber: Self = this.set("footnoteNumber", js.undefined)
    
    @scala.inline
    def setSuggestedDeletionIdsVarargs(value: String*): Self = this.set("suggestedDeletionIds", js.Array(value :_*))
    
    @scala.inline
    def setSuggestedDeletionIds(value: js.Array[String]): Self = this.set("suggestedDeletionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestedDeletionIds: Self = this.set("suggestedDeletionIds", js.undefined)
    
    @scala.inline
    def setSuggestedInsertionIdsVarargs(value: String*): Self = this.set("suggestedInsertionIds", js.Array(value :_*))
    
    @scala.inline
    def setSuggestedInsertionIds(value: js.Array[String]): Self = this.set("suggestedInsertionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestedInsertionIds: Self = this.set("suggestedInsertionIds", js.undefined)
    
    @scala.inline
    def setSuggestedTextStyleChanges(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.SuggestedTextStyle}
      */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.FootnoteReference with TopLevel[js.Any]
    ): Self = this.set("suggestedTextStyleChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestedTextStyleChanges: Self = this.set("suggestedTextStyleChanges", js.undefined)
    
    @scala.inline
    def setTextStyle(value: TextStyle): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
  }
}
