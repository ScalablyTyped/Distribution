package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkModifyDocsWrapper extends js.Object {
  
  var docs: js.Array[_] = js.native
}
object BulkModifyDocsWrapper {
  
  @scala.inline
  def apply(docs: js.Array[_]): BulkModifyDocsWrapper = {
    val __obj = js.Dynamic.literal(docs = docs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkModifyDocsWrapper]
  }
  
  @scala.inline
  implicit class BulkModifyDocsWrapperOps[Self <: BulkModifyDocsWrapper] (val x: Self) extends AnyVal {
    
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
    def setDocsVarargs(value: js.Any*): Self = this.set("docs", js.Array(value :_*))
    
    @scala.inline
    def setDocs(value: js.Array[_]): Self = this.set("docs", value.asInstanceOf[js.Any])
  }
}
