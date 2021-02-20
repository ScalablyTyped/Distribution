package typings.pouchdbCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Docs[Content /* <: js.Object */] extends StObject {
  
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
  implicit class DocsMutableBuilder[Self <: Docs[_], Content /* <: js.Object */] (val x: Self with Docs[Content]) extends AnyVal {
    
    @scala.inline
    def setDocs(value: js.Array[Ok[Content] | Error]): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocsVarargs(value: (Ok[Content] | Error)*): Self = StObject.set(x, "docs", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
