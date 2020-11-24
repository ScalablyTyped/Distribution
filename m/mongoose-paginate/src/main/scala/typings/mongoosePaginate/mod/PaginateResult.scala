package typings.mongoosePaginate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaginateResult[T] extends js.Object {
  
  var docs: js.Array[T] = js.native
  
  var limit: Double = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var page: js.UndefOr[Double] = js.native
  
  var pages: js.UndefOr[Double] = js.native
  
  var total: Double = js.native
}
object PaginateResult {
  
  @scala.inline
  def apply[T](docs: js.Array[T], limit: Double, total: Double): PaginateResult[T] = {
    val __obj = js.Dynamic.literal(docs = docs.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginateResult[T]]
  }
  
  @scala.inline
  implicit class PaginateResultOps[Self <: PaginateResult[_], T] (val x: Self with PaginateResult[T]) extends AnyVal {
    
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
    def setDocsVarargs(value: T*): Self = this.set("docs", js.Array(value :_*))
    
    @scala.inline
    def setDocs(value: js.Array[T]): Self = this.set("docs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setPages(value: Double): Self = this.set("pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePages: Self = this.set("pages", js.undefined)
  }
}
