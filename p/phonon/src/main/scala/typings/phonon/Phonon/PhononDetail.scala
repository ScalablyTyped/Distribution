package typings.phonon.Phonon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhononDetail extends StObject {
  
  var page: String = js.native
  
  var req: js.Array[String] = js.native
}
object PhononDetail {
  
  @scala.inline
  def apply(page: String, req: js.Array[String]): PhononDetail = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhononDetail]
  }
  
  @scala.inline
  implicit class PhononDetailMutableBuilder[Self <: PhononDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReq(value: js.Array[String]): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReqVarargs(value: String*): Self = StObject.set(x, "req", js.Array(value :_*))
  }
}
