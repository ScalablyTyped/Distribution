package typings.nodeRsa.mod

import typings.nodeRsa.nodeRsaStrings.pkcs1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvancedSigningSchemePKCS1
  extends StObject
     with AdvancedSigningScheme {
  
  var hash: HashingAlgorithm
  
  var scheme: pkcs1
}
object AdvancedSigningSchemePKCS1 {
  
  inline def apply(hash: HashingAlgorithm): AdvancedSigningSchemePKCS1 = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], scheme = "pkcs1")
    __obj.asInstanceOf[AdvancedSigningSchemePKCS1]
  }
  
  extension [Self <: AdvancedSigningSchemePKCS1](x: Self) {
    
    inline def setHash(value: HashingAlgorithm): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setScheme(value: pkcs1): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
  }
}
