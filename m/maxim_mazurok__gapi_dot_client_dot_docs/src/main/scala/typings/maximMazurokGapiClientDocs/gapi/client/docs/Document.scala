package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Document extends js.Object {
  
  /** Output only. The main body of the document. */
  var body: js.UndefOr[Body] = js.native
  
  /** Output only. The ID of the document. */
  var documentId: js.UndefOr[String] = js.native
  
  /** Output only. The style of the document. */
  var documentStyle: js.UndefOr[DocumentStyle] = js.native
  
  /** Output only. The footers in the document, keyed by footer ID. */
  var footers: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.Footer}
    */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Document with TopLevel[js.Any]
  ] = js.native
  
  /** Output only. The footnotes in the document, keyed by footnote ID. */
  var footnotes: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.Footnote}
    */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Document with TopLevel[js.Any]
  ] = js.native
  
  /** Output only. The headers in the document, keyed by header ID. */
  var headers: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.Header}
    */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Document with TopLevel[js.Any]
  ] = js.native
  
  /** Output only. The inline objects in the document, keyed by object ID. */
  var inlineObjects: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.InlineObject}
    */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Document with TopLevel[js.Any]
  ] = js.native
  
  /** Output only. The lists in the document, keyed by list ID. */
  var lists: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.List}
    */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Document with TopLevel[js.Any]
  ] = js.native
  
  /** Output only. The named ranges in the document, keyed by name. */
  var namedRanges: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.NamedRanges}
    */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Document with TopLevel[js.Any]
  ] = js.native
  
  /** Output only. The named styles of the document. */
  var namedStyles: js.UndefOr[NamedStyles] = js.native
  
  /** Output only. The positioned objects in the document, keyed by object ID. */
  var positionedObjects: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.PositionedObject}
    */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Document with TopLevel[js.Any]
  ] = js.native
  
  /**
    * Output only. The revision ID of the document. Can be used in update requests to specify which revision of a document to apply updates to and how the request should behave if the
    * document has been edited since that revision. Only populated if the user has edit access to the document. The format of the revision ID may change over time, so it should be treated
    * opaquely. A returned revision ID is only guaranteed to be valid for 24 hours after it has been returned and cannot be shared across users. If the revision ID is unchanged between
    * calls, then the document has not changed. Conversely, a changed ID (for the same document and user) usually means the document has been updated; however, a changed ID can also be
    * due to internal factors such as ID format changes.
    */
  var revisionId: js.UndefOr[String] = js.native
  
  /** Output only. The suggested changes to the style of the document, keyed by suggestion ID. */
  var suggestedDocumentStyleChanges: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.SuggestedDocumentStyle}
    */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Document with TopLevel[js.Any]
  ] = js.native
  
  /** Output only. The suggested changes to the named styles of the document, keyed by suggestion ID. */
  var suggestedNamedStylesChanges: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.SuggestedNamedStyles}
    */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Document with TopLevel[js.Any]
  ] = js.native
  
  /** Output only. The suggestions view mode applied to the document. Note: When editing a document, changes must be based on a document with SUGGESTIONS_INLINE. */
  var suggestionsViewMode: js.UndefOr[String] = js.native
  
  /** The title of the document. */
  var title: js.UndefOr[String] = js.native
}
object Document {
  
  @scala.inline
  def apply(): Document = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Document]
  }
  
  @scala.inline
  implicit class DocumentOps[Self <: Document] (val x: Self) extends AnyVal {
    
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
    def setBody(value: Body): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setDocumentId(value: String): Self = this.set("documentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentId: Self = this.set("documentId", js.undefined)
    
    @scala.inline
    def setDocumentStyle(value: DocumentStyle): Self = this.set("documentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentStyle: Self = this.set("documentStyle", js.undefined)
    
    @scala.inline
    def setFooters(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.Footer}
      */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Document with TopLevel[js.Any]
    ): Self = this.set("footers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooters: Self = this.set("footers", js.undefined)
    
    @scala.inline
    def setFootnotes(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.Footnote}
      */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Document with TopLevel[js.Any]
    ): Self = this.set("footnotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFootnotes: Self = this.set("footnotes", js.undefined)
    
    @scala.inline
    def setHeaders(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.Header}
      */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Document with TopLevel[js.Any]
    ): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setInlineObjects(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.InlineObject}
      */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Document with TopLevel[js.Any]
    ): Self = this.set("inlineObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineObjects: Self = this.set("inlineObjects", js.undefined)
    
    @scala.inline
    def setLists(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.List}
      */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Document with TopLevel[js.Any]
    ): Self = this.set("lists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLists: Self = this.set("lists", js.undefined)
    
    @scala.inline
    def setNamedRanges(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.NamedRanges}
      */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Document with TopLevel[js.Any]
    ): Self = this.set("namedRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamedRanges: Self = this.set("namedRanges", js.undefined)
    
    @scala.inline
    def setNamedStyles(value: NamedStyles): Self = this.set("namedStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamedStyles: Self = this.set("namedStyles", js.undefined)
    
    @scala.inline
    def setPositionedObjects(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.PositionedObject}
      */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Document with TopLevel[js.Any]
    ): Self = this.set("positionedObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionedObjects: Self = this.set("positionedObjects", js.undefined)
    
    @scala.inline
    def setRevisionId(value: String): Self = this.set("revisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevisionId: Self = this.set("revisionId", js.undefined)
    
    @scala.inline
    def setSuggestedDocumentStyleChanges(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.SuggestedDocumentStyle}
      */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Document with TopLevel[js.Any]
    ): Self = this.set("suggestedDocumentStyleChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestedDocumentStyleChanges: Self = this.set("suggestedDocumentStyleChanges", js.undefined)
    
    @scala.inline
    def setSuggestedNamedStylesChanges(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.SuggestedNamedStyles}
      */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Document with TopLevel[js.Any]
    ): Self = this.set("suggestedNamedStylesChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestedNamedStylesChanges: Self = this.set("suggestedNamedStylesChanges", js.undefined)
    
    @scala.inline
    def setSuggestionsViewMode(value: String): Self = this.set("suggestionsViewMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestionsViewMode: Self = this.set("suggestionsViewMode", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
