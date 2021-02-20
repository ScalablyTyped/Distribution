package typings.pouchdbCore.anon

import typings.pouchdbCore.PouchDB.Core.AllDocsMeta
import typings.pouchdbCore.PouchDB.Core.DocumentId
import typings.pouchdbCore.PouchDB.Core.DocumentKey
import typings.pouchdbCore.PouchDB.Core.ExistingDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Doc[Content /* <: js.Object */] extends StObject {
  
  /** Only present if `include_docs` was `true`. */
  var doc: js.UndefOr[ExistingDocument[Content with AllDocsMeta]] = js.native
  
  var id: DocumentId = js.native
  
  var key: DocumentKey = js.native
  
  var value: Deleted = js.native
}
object Doc {
  
  @scala.inline
  def apply[Content /* <: js.Object */](id: DocumentId, key: DocumentKey, value: Deleted): Doc[Content] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Doc[Content]]
  }
  
  @scala.inline
  implicit class DocMutableBuilder[Self <: Doc[_], Content /* <: js.Object */] (val x: Self with Doc[Content]) extends AnyVal {
    
    @scala.inline
    def setDoc(value: ExistingDocument[Content with AllDocsMeta]): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocUndefined: Self = StObject.set(x, "doc", js.undefined)
    
    @scala.inline
    def setId(value: DocumentId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: DocumentKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Deleted): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
