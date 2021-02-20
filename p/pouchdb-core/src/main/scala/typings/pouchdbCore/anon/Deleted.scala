package typings.pouchdbCore.anon

import typings.pouchdbCore.PouchDB.Core.RevisionId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deleted extends StObject {
  
  var deleted: js.UndefOr[Boolean] = js.native
  
  var rev: RevisionId = js.native
}
object Deleted {
  
  @scala.inline
  def apply(rev: RevisionId): Deleted = {
    val __obj = js.Dynamic.literal(rev = rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deleted]
  }
  
  @scala.inline
  implicit class DeletedMutableBuilder[Self <: Deleted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    @scala.inline
    def setRev(value: RevisionId): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
  }
}
