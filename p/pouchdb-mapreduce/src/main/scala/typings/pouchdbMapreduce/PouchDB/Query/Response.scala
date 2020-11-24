package typings.pouchdbMapreduce.PouchDB.Query

import typings.pouchdbMapreduce.anon.Doc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Response[Content /* <: js.Object */] extends js.Object {
  
  var offset: Double = js.native
  
  var rows: js.Array[Doc[Content]] = js.native
  
  var total_rows: Double = js.native
}
object Response {
  
  @scala.inline
  def apply[Content /* <: js.Object */](offset: Double, rows: js.Array[Doc[Content]], total_rows: Double): Response[Content] = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], total_rows = total_rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response[Content]]
  }
  
  @scala.inline
  implicit class ResponseOps[Self <: Response[_], Content /* <: js.Object */] (val x: Self with Response[Content]) extends AnyVal {
    
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
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsVarargs(value: Doc[Content]*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[Doc[Content]]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_rows(value: Double): Self = this.set("total_rows", value.asInstanceOf[js.Any])
  }
}
