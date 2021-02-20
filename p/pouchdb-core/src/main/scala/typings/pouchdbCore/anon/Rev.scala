package typings.pouchdbCore.anon

import typings.pouchdbCore.PouchDB.Core.RevisionId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rev extends StObject {
  
  var id: String = js.native
  
  var rev: js.UndefOr[RevisionId] = js.native
}
object Rev {
  
  @scala.inline
  def apply(id: String): Rev = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rev]
  }
  
  @scala.inline
  implicit class RevMutableBuilder[Self <: Rev] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRev(value: RevisionId): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevUndefined: Self = StObject.set(x, "rev", js.undefined)
  }
}
