package typings.pouchdbCore.PouchDB.Core

import typings.pouchdbCore.anon.Docs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkGetResponse[Content /* <: js.Object */] extends js.Object {
  
  var results: js.Array[Docs[Content]] = js.native
}
object BulkGetResponse {
  
  @scala.inline
  def apply[Content /* <: js.Object */](results: js.Array[Docs[Content]]): BulkGetResponse[Content] = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkGetResponse[Content]]
  }
  
  @scala.inline
  implicit class BulkGetResponseOps[Self <: BulkGetResponse[_], Content /* <: js.Object */] (val x: Self with BulkGetResponse[Content]) extends AnyVal {
    
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
    def setResultsVarargs(value: Docs[Content]*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[Docs[Content]]): Self = this.set("results", value.asInstanceOf[js.Any])
  }
}
