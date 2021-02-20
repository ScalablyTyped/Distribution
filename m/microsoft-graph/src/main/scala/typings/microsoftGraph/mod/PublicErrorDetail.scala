package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicErrorDetail extends StObject {
  
  var code: js.UndefOr[NullableOption[String]] = js.native
  
  var message: js.UndefOr[NullableOption[String]] = js.native
  
  var target: js.UndefOr[NullableOption[String]] = js.native
}
object PublicErrorDetail {
  
  @scala.inline
  def apply(): PublicErrorDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicErrorDetail]
  }
  
  @scala.inline
  implicit class PublicErrorDetailMutableBuilder[Self <: PublicErrorDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: NullableOption[String]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeNull: Self = StObject.set(x, "code", null)
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setMessage(value: NullableOption[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageNull: Self = StObject.set(x, "message", null)
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setTarget(value: NullableOption[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNull: Self = StObject.set(x, "target", null)
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
