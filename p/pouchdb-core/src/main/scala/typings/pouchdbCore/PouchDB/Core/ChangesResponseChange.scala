package typings.pouchdbCore.PouchDB.Core

import typings.pouchdbCore.anon.RevString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangesResponseChange[Content /* <: js.Object */] extends StObject {
  
  var changes: js.Array[RevString] = js.native
  
  var deleted: js.UndefOr[Boolean] = js.native
  
  var doc: js.UndefOr[ExistingDocument[Content with ChangesMeta]] = js.native
  
  var id: String = js.native
  
  var seq: Double | String = js.native
}
object ChangesResponseChange {
  
  @scala.inline
  def apply[Content /* <: js.Object */](changes: js.Array[RevString], id: String, seq: Double | String): ChangesResponseChange[Content] = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangesResponseChange[Content]]
  }
  
  @scala.inline
  implicit class ChangesResponseChangeMutableBuilder[Self <: ChangesResponseChange[_], Content /* <: js.Object */] (val x: Self with ChangesResponseChange[Content]) extends AnyVal {
    
    @scala.inline
    def setChanges(value: js.Array[RevString]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangesVarargs(value: RevString*): Self = StObject.set(x, "changes", js.Array(value :_*))
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    @scala.inline
    def setDoc(value: ExistingDocument[Content with ChangesMeta]): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocUndefined: Self = StObject.set(x, "doc", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeq(value: Double | String): Self = StObject.set(x, "seq", value.asInstanceOf[js.Any])
  }
}
