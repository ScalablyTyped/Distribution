package typings.pkijs.mod

import typings.std.CryptoKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.pkijs.mod.EnvelopedDataDecryptBufferParams
  - typings.pkijs.mod.EnvelopedDataDecryptKeyParams
*/
trait EnvelopedDataDecryptParams extends StObject
object EnvelopedDataDecryptParams {
  
  inline def EnvelopedDataDecryptBufferParams(): typings.pkijs.mod.EnvelopedDataDecryptBufferParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.pkijs.mod.EnvelopedDataDecryptBufferParams]
  }
  
  inline def EnvelopedDataDecryptKeyParams(recipientPrivateKey: CryptoKey): typings.pkijs.mod.EnvelopedDataDecryptKeyParams = {
    val __obj = js.Dynamic.literal(recipientPrivateKey = recipientPrivateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pkijs.mod.EnvelopedDataDecryptKeyParams]
  }
}
