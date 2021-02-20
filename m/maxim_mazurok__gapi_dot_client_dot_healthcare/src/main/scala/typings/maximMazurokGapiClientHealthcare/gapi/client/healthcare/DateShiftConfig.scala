package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateShiftConfig extends StObject {
  
  /**
    * An AES 128/192/256 bit key. Causes the shift to be computed based on this key and the patient ID. A default key is generated for each Deidentify operation and is used wherever
    * crypto_key is not specified.
    */
  var cryptoKey: js.UndefOr[String] = js.native
}
object DateShiftConfig {
  
  @scala.inline
  def apply(): DateShiftConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateShiftConfig]
  }
  
  @scala.inline
  implicit class DateShiftConfigMutableBuilder[Self <: DateShiftConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCryptoKey(value: String): Self = StObject.set(x, "cryptoKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCryptoKeyUndefined: Self = StObject.set(x, "cryptoKey", js.undefined)
  }
}
