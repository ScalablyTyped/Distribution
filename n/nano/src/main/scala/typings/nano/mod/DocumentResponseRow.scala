package typings.nano.mod

import typings.nano.anon.Rev
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentResponseRow[D]
  extends StObject
     with DocumentResponseRowMeta {
  
  var doc: js.UndefOr[D & Document] = js.undefined
}
object DocumentResponseRow {
  
  @scala.inline
  def apply[D](id: String, key: String, value: Rev): DocumentResponseRow[D] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentResponseRow[D]]
  }
  
  @scala.inline
  implicit class DocumentResponseRowMutableBuilder[Self <: DocumentResponseRow[?], D] (val x: Self & DocumentResponseRow[D]) extends AnyVal {
    
    @scala.inline
    def setDoc(value: D & Document): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocUndefined: Self = StObject.set(x, "doc", js.undefined)
  }
}
