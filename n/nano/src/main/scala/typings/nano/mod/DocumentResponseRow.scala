package typings.nano.mod

import typings.nano.anon.Rev
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentResponseRow[D] extends DocumentResponseRowMeta {
  
  var doc: js.UndefOr[D with Document] = js.native
}
object DocumentResponseRow {
  
  @scala.inline
  def apply[D](id: String, key: String, value: Rev): DocumentResponseRow[D] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentResponseRow[D]]
  }
  
  @scala.inline
  implicit class DocumentResponseRowMutableBuilder[Self <: DocumentResponseRow[_], D] (val x: Self with DocumentResponseRow[D]) extends AnyVal {
    
    @scala.inline
    def setDoc(value: D with Document): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocUndefined: Self = StObject.set(x, "doc", js.undefined)
  }
}
