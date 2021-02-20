package typings.pouchdbCore.anon

import typings.pouchdbCore.PouchDB.Core.GetMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ok[Content /* <: js.Object */] extends StObject {
  
  var ok: Content with GetMeta = js.native
}
object Ok {
  
  @scala.inline
  def apply[Content /* <: js.Object */](ok: Content with GetMeta): Ok[Content] = {
    val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ok[Content]]
  }
  
  @scala.inline
  implicit class OkMutableBuilder[Self <: Ok[_], Content /* <: js.Object */] (val x: Self with Ok[Content]) extends AnyVal {
    
    @scala.inline
    def setOk(value: Content with GetMeta): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
  }
}
