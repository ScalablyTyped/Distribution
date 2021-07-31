package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Document extends StObject {
  
  /** Output only. The main body of the document. */
  var body: js.UndefOr[Body] = js.undefined
  
  /** Output only. The ID of the document. */
  var documentId: js.UndefOr[String] = js.undefined
  
  /** Output only. The style of the document. */
  var documentStyle: js.UndefOr[DocumentStyle] = js.undefined
  
  /** Output only. The footers in the document, keyed by footer ID. */
  var footers: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.Footer}
    */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Document & TopLevel[js.Any]
  ] = js.undefined
  
  /** Output only. The footnotes in the document, keyed by footnote ID. */
  var footnotes: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.Footnote}
    */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Document & TopLevel[js.Any]
  ] = js.undefined
  
  /** Output only. The headers in the document, keyed by header ID. */
  var headers: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.Header}
    */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Document & TopLevel[js.Any]
  ] = js.undefined
  
  /** Output only. The inline objects in the document, keyed by object ID. */
  var inlineObjects: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.InlineObject}
    */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Document & TopLevel[js.Any]
  ] = js.undefined
  
  /** Output only. The lists in the document, keyed by list ID. */
  var lists: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.List}
    */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Document & TopLevel[js.Any]
  ] = js.undefined
  
  /** Output only. The named ranges in the document, keyed by name. */
  var namedRanges: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.NamedRanges}
    */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Document & TopLevel[js.Any]
  ] = js.undefined
  
  /** Output only. The named styles of the document. */
  var namedStyles: js.UndefOr[NamedStyles] = js.undefined
  
  /** Output only. The positioned objects in the document, keyed by object ID. */
  var positionedObjects: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.PositionedObject}
    */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Document & TopLevel[js.Any]
  ] = js.undefined
  
  /**
    * Output only. The revision ID of the document. Can be used in update requests to specify which revision of a document to apply updates to and how the request should behave if the
    * document has been edited since that revision. Only populated if the user has edit access to the document. The format of the revision ID may change over time, so it should be treated
    * opaquely. A returned revision ID is only guaranteed to be valid for 24 hours after it has been returned and cannot be shared across users. If the revision ID is unchanged between
    * calls, then the document has not changed. Conversely, a changed ID (for the same document and user) usually means the document has been updated; however, a changed ID can also be
    * due to internal factors such as ID format changes.
    */
  var revisionId: js.UndefOr[String] = js.undefined
  
  /** Output only. The suggested changes to the style of the document, keyed by suggestion ID. */
  var suggestedDocumentStyleChanges: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.SuggestedDocumentStyle}
    */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Document & TopLevel[js.Any]
  ] = js.undefined
  
  /** Output only. The suggested changes to the named styles of the document, keyed by suggestion ID. */
  var suggestedNamedStylesChanges: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.SuggestedNamedStyles}
    */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Document & TopLevel[js.Any]
  ] = js.undefined
  
  /** Output only. The suggestions view mode applied to the document. Note: When editing a document, changes must be based on a document with SUGGESTIONS_INLINE. */
  var suggestionsViewMode: js.UndefOr[String] = js.undefined
  
  /** The title of the document. */
  var title: js.UndefOr[String] = js.undefined
}
object Document {
  
  @scala.inline
  def apply(): Document = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Document]
  }
  
  @scala.inline
  implicit class DocumentMutableBuilder[Self <: Document] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Body): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setDocumentId(value: String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentIdUndefined: Self = StObject.set(x, "documentId", js.undefined)
    
    @scala.inline
    def setDocumentStyle(value: DocumentStyle): Self = StObject.set(x, "documentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentStyleUndefined: Self = StObject.set(x, "documentStyle", js.undefined)
    
    @scala.inline
    def setFooters(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.Footer}
      */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Document & TopLevel[js.Any]
    ): Self = StObject.set(x, "footers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootersUndefined: Self = StObject.set(x, "footers", js.undefined)
    
    @scala.inline
    def setFootnotes(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.Footnote}
      */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Document & TopLevel[js.Any]
    ): Self = StObject.set(x, "footnotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnotesUndefined: Self = StObject.set(x, "footnotes", js.undefined)
    
    @scala.inline
    def setHeaders(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.Header}
      */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Document & TopLevel[js.Any]
    ): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setInlineObjects(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.InlineObject}
      */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Document & TopLevel[js.Any]
    ): Self = StObject.set(x, "inlineObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineObjectsUndefined: Self = StObject.set(x, "inlineObjects", js.undefined)
    
    @scala.inline
    def setLists(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.List}
      */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Document & TopLevel[js.Any]
    ): Self = StObject.set(x, "lists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListsUndefined: Self = StObject.set(x, "lists", js.undefined)
    
    @scala.inline
    def setNamedRanges(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.NamedRanges}
      */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Document & TopLevel[js.Any]
    ): Self = StObject.set(x, "namedRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedRangesUndefined: Self = StObject.set(x, "namedRanges", js.undefined)
    
    @scala.inline
    def setNamedStyles(value: NamedStyles): Self = StObject.set(x, "namedStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedStylesUndefined: Self = StObject.set(x, "namedStyles", js.undefined)
    
    @scala.inline
    def setPositionedObjects(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.PositionedObject}
      */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Document & TopLevel[js.Any]
    ): Self = StObject.set(x, "positionedObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionedObjectsUndefined: Self = StObject.set(x, "positionedObjects", js.undefined)
    
    @scala.inline
    def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
    
    @scala.inline
    def setSuggestedDocumentStyleChanges(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.SuggestedDocumentStyle}
      */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Document & TopLevel[js.Any]
    ): Self = StObject.set(x, "suggestedDocumentStyleChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedDocumentStyleChangesUndefined: Self = StObject.set(x, "suggestedDocumentStyleChanges", js.undefined)
    
    @scala.inline
    def setSuggestedNamedStylesChanges(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.SuggestedNamedStyles}
      */ typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.Document & TopLevel[js.Any]
    ): Self = StObject.set(x, "suggestedNamedStylesChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedNamedStylesChangesUndefined: Self = StObject.set(x, "suggestedNamedStylesChanges", js.undefined)
    
    @scala.inline
    def setSuggestionsViewMode(value: String): Self = StObject.set(x, "suggestionsViewMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionsViewModeUndefined: Self = StObject.set(x, "suggestionsViewMode", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
