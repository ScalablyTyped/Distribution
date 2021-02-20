package typings.pouchdbCore.PouchDB.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasicResponse extends StObject {
  
  /** `true` if the operation was successful; `false` otherwise */
  var ok: Boolean = js.native
}
object BasicResponse {
  
  @scala.inline
  def apply(ok: Boolean): BasicResponse = {
    val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicResponse]
  }
  
  @scala.inline
  implicit class BasicResponseMutableBuilder[Self <: BasicResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
  }
}
