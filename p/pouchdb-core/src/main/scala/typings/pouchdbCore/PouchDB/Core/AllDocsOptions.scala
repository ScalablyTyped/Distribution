package typings.pouchdbCore.PouchDB.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllDocsOptions extends Options {
  
  /**
    * Include attachment data for each document.
    *
    * Requires `include_docs` to be `true`.
    *
    * By default, attachments are Base64-encoded.
    * @see binary
    */
  var attachments: js.UndefOr[Boolean] = js.native
  
  /**
    * Return attachments as Buffers.
    *
    * Requires `include_docs` to be `true`.
    * Requires `attachments` to be `true`.
    */
  var binary: js.UndefOr[Boolean] = js.native
  
  /**
    * Include conflict information for each document.
    *
    * Requires `include_docs` to be `true`.
    */
  var conflicts: js.UndefOr[Boolean] = js.native
  
  /** Reverse ordering of results. */
  var descending: js.UndefOr[Boolean] = js.native
  
  /** Include contents for each document. */
  var include_docs: js.UndefOr[Boolean] = js.native
  
  /** Maximum number of documents to return. */
  var limit: js.UndefOr[Double] = js.native
  
  /**
    * Number of documents to skip before returning.
    *
    * Causes poor performance on IndexedDB and LevelDB.
    */
  var skip: js.UndefOr[Double] = js.native
  
  /**
    * Include an update_seq value indicating which sequence id
    * of the underlying database the view reflects.
    */
  var update_seq: js.UndefOr[Boolean] = js.native
}
object AllDocsOptions {
  
  @scala.inline
  def apply(): AllDocsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllDocsOptions]
  }
  
  @scala.inline
  implicit class AllDocsOptionsMutableBuilder[Self <: AllDocsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachments(value: Boolean): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    @scala.inline
    def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    
    @scala.inline
    def setConflicts(value: Boolean): Self = StObject.set(x, "conflicts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConflictsUndefined: Self = StObject.set(x, "conflicts", js.undefined)
    
    @scala.inline
    def setDescending(value: Boolean): Self = StObject.set(x, "descending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescendingUndefined: Self = StObject.set(x, "descending", js.undefined)
    
    @scala.inline
    def setInclude_docs(value: Boolean): Self = StObject.set(x, "include_docs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude_docsUndefined: Self = StObject.set(x, "include_docs", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    @scala.inline
    def setUpdate_seq(value: Boolean): Self = StObject.set(x, "update_seq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate_seqUndefined: Self = StObject.set(x, "update_seq", js.undefined)
  }
}
