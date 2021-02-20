package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PassportData extends StObject {
  
  var credentials: EncryptedCredentials = js.native
  
  var data: js.Array[EncryptedPassportElement] = js.native
}
object PassportData {
  
  @scala.inline
  def apply(credentials: EncryptedCredentials, data: js.Array[EncryptedPassportElement]): PassportData = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PassportData]
  }
  
  @scala.inline
  implicit class PassportDataMutableBuilder[Self <: PassportData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredentials(value: EncryptedCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Array[EncryptedPassportElement]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: EncryptedPassportElement*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
