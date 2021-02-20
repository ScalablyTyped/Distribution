package typings.paystack.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined paystack.paystack.Response & {  data :undefined} */
@js.native
trait Responsedataundefined
  extends /* others */ StringDictionary[js.Any] {
  
  var data: js.UndefOr[js.Any] with js.UndefOr[scala.Nothing] = js.native
  
  var message: String = js.native
  
  var status: Boolean = js.native
}
object Responsedataundefined {
  
  @scala.inline
  def apply(data: js.UndefOr[js.Any] with js.UndefOr[scala.Nothing], message: String, status: Boolean): Responsedataundefined = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responsedataundefined]
  }
  
  @scala.inline
  implicit class ResponsedataundefinedMutableBuilder[Self <: Responsedataundefined] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.UndefOr[js.Any] with js.UndefOr[scala.Nothing]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
