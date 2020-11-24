package typings.pouchdbCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Docs[Content /* <: js.Object */] extends js.Object {
  
  var docs: js.Array[Ok[Content] | Error] = js.native
  
  var id: String = js.native
}
object Docs {
  
  @scala.inline
  def apply[Content /* <: js.Object */](docs: js.Array[Ok[Content] | Error], id: String): Docs[Content] = {
    val __obj = js.Dynamic.literal(docs = docs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Docs[Content]]
  }
  
  @scala.inline
  implicit class DocsOps[Self <: Docs[_], Content /* <: js.Object */] (val x: Self with Docs[Content]) extends AnyVal {
    
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
    def setDocsVarargs(value: (Ok[Content] | Error)*): Self = this.set("docs", js.Array(value :_*))
    
    @scala.inline
    def setDocs(value: js.Array[Ok[Content] | Error]): Self = this.set("docs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
  }
}
