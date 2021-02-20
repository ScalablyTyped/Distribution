package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultInfo extends StObject {
  
  // The result code.
  var code: js.UndefOr[Double] = js.native
  
  // The message.
  var message: js.UndefOr[NullableOption[String]] = js.native
  
  // The result sub-code.
  var subcode: js.UndefOr[Double] = js.native
}
object ResultInfo {
  
  @scala.inline
  def apply(): ResultInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultInfo]
  }
  
  @scala.inline
  implicit class ResultInfoMutableBuilder[Self <: ResultInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setMessage(value: NullableOption[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageNull: Self = StObject.set(x, "message", null)
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setSubcode(value: Double): Self = StObject.set(x, "subcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubcodeUndefined: Self = StObject.set(x, "subcode", js.undefined)
  }
}
