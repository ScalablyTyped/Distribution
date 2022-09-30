package typings.pkijs.mod

import typings.std.Algorithm
import typings.std.CryptoKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _MakeInternalValuesParams extends StObject
object _MakeInternalValuesParams {
  
  inline def Pbkdf2HashAlgorithm(
    hmacHashAlgorithm: String,
    iterations: Double,
    password: js.typedarray.ArrayBuffer,
    pbkdf2HashAlgorithm: Algorithm
  ): typings.pkijs.anon.Pbkdf2HashAlgorithm = {
    val __obj = js.Dynamic.literal(hmacHashAlgorithm = hmacHashAlgorithm.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], pbkdf2HashAlgorithm = pbkdf2HashAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pkijs.anon.Pbkdf2HashAlgorithm]
  }
  
  inline def PrivateKey(hashAlgorithm: String, privateKey: CryptoKey, signingCertificate: Certificate): typings.pkijs.anon.PrivateKey = {
    val __obj = js.Dynamic.literal(hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any], signingCertificate = signingCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pkijs.anon.PrivateKey]
  }
}
