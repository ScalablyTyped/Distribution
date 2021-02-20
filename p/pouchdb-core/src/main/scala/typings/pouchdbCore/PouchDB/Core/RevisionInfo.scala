package typings.pouchdbCore.PouchDB.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevisionInfo extends StObject {
  
  var rev: RevisionId = js.native
  
  var status: Availability = js.native
}
object RevisionInfo {
  
  @scala.inline
  def apply(rev: RevisionId, status: Availability): RevisionInfo = {
    val __obj = js.Dynamic.literal(rev = rev.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevisionInfo]
  }
  
  @scala.inline
  implicit class RevisionInfoMutableBuilder[Self <: RevisionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRev(value: RevisionId): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Availability): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
