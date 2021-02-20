package typings.pouchdbCore.PouchDB.Core

import typings.pouchdbCore.anon.Rev
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkGetOptions extends Options {
  
  var attachments: js.UndefOr[Boolean] = js.native
  
  var binary: js.UndefOr[Boolean] = js.native
  
  var docs: js.Array[Rev] = js.native
  
  var revs: js.UndefOr[Boolean] = js.native
}
object BulkGetOptions {
  
  @scala.inline
  def apply(docs: js.Array[Rev]): BulkGetOptions = {
    val __obj = js.Dynamic.literal(docs = docs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkGetOptions]
  }
  
  @scala.inline
  implicit class BulkGetOptionsMutableBuilder[Self <: BulkGetOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachments(value: Boolean): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    @scala.inline
    def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    
    @scala.inline
    def setDocs(value: js.Array[Rev]): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocsVarargs(value: Rev*): Self = StObject.set(x, "docs", js.Array(value :_*))
    
    @scala.inline
    def setRevs(value: Boolean): Self = StObject.set(x, "revs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevsUndefined: Self = StObject.set(x, "revs", js.undefined)
  }
}
