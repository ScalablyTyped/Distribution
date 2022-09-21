package typings.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecretPayload extends StObject {
  
  /** The secret data. Must be no larger than 64KiB. */
  var data: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. If specified, SecretManagerService will verify the integrity of the received data on SecretManagerService.AddSecretVersion calls using the crc32c checksum and store it to
    * include in future SecretManagerService.AccessSecretVersion responses. If a checksum is not provided in the SecretManagerService.AddSecretVersion request, the SecretManagerService
    * will generate and store one for you. The CRC32C value is encoded as a Int64 for compatibility, and can be safely downconverted to uint32 in languages that support this type.
    * https://cloud.google.com/apis/design/design_patterns#integer_types
    */
  var dataCrc32c: js.UndefOr[String] = js.undefined
}
object SecretPayload {
  
  inline def apply(): SecretPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecretPayload]
  }
  
  extension [Self <: SecretPayload](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataCrc32c(value: String): Self = StObject.set(x, "dataCrc32c", value.asInstanceOf[js.Any])
    
    inline def setDataCrc32cUndefined: Self = StObject.set(x, "dataCrc32c", js.undefined)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
