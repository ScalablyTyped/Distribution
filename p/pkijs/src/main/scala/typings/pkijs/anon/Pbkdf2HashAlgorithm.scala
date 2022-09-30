package typings.pkijs.anon

import typings.pkijs.mod._MakeInternalValuesParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pbkdf2HashAlgorithm
  extends StObject
     with _MakeInternalValuesParams {
  
  var hmacHashAlgorithm: String
  
  var iterations: Double
  
  var password: js.typedarray.ArrayBuffer
  
  var pbkdf2HashAlgorithm: typings.std.Algorithm
}
object Pbkdf2HashAlgorithm {
  
  inline def apply(
    hmacHashAlgorithm: String,
    iterations: Double,
    password: js.typedarray.ArrayBuffer,
    pbkdf2HashAlgorithm: typings.std.Algorithm
  ): Pbkdf2HashAlgorithm = {
    val __obj = js.Dynamic.literal(hmacHashAlgorithm = hmacHashAlgorithm.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], pbkdf2HashAlgorithm = pbkdf2HashAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pbkdf2HashAlgorithm]
  }
  
  extension [Self <: Pbkdf2HashAlgorithm](x: Self) {
    
    inline def setHmacHashAlgorithm(value: String): Self = StObject.set(x, "hmacHashAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPbkdf2HashAlgorithm(value: typings.std.Algorithm): Self = StObject.set(x, "pbkdf2HashAlgorithm", value.asInstanceOf[js.Any])
  }
}
