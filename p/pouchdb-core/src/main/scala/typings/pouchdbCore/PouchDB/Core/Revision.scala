package typings.pouchdbCore.PouchDB.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Revision[Content /* <: js.Object */] extends StObject {
  
  var ok: Document[Content] with RevisionIdMeta = js.native
}
object Revision {
  
  @scala.inline
  def apply[Content /* <: js.Object */](ok: Document[Content] with RevisionIdMeta): Revision[Content] = {
    val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[Revision[Content]]
  }
  
  @scala.inline
  implicit class RevisionMutableBuilder[Self <: Revision[_], Content /* <: js.Object */] (val x: Self with Revision[Content]) extends AnyVal {
    
    @scala.inline
    def setOk(value: Document[Content] with RevisionIdMeta): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
  }
}
