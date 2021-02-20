package typings.pouchdbCore.PouchDB.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevisionIdMeta extends StObject {
  
  var _rev: RevisionId = js.native
}
object RevisionIdMeta {
  
  @scala.inline
  def apply(_rev: RevisionId): RevisionIdMeta = {
    val __obj = js.Dynamic.literal(_rev = _rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevisionIdMeta]
  }
  
  @scala.inline
  implicit class RevisionIdMetaMutableBuilder[Self <: RevisionIdMeta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_rev(value: RevisionId): Self = StObject.set(x, "_rev", value.asInstanceOf[js.Any])
  }
}
