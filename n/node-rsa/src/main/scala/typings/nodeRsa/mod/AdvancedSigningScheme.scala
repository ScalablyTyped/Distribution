package typings.nodeRsa.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.nodeRsa.mod.AdvancedSigningSchemePSS
  - typings.nodeRsa.mod.AdvancedSigningSchemePKCS1
*/
trait AdvancedSigningScheme extends StObject
object AdvancedSigningScheme {
  
  inline def AdvancedSigningSchemePKCS1(hash: HashingAlgorithm): typings.nodeRsa.mod.AdvancedSigningSchemePKCS1 = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], scheme = "pkcs1")
    __obj.asInstanceOf[typings.nodeRsa.mod.AdvancedSigningSchemePKCS1]
  }
  
  inline def AdvancedSigningSchemePSS(hash: HashingAlgorithm, saltLength: Double): typings.nodeRsa.mod.AdvancedSigningSchemePSS = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], saltLength = saltLength.asInstanceOf[js.Any], scheme = "pss")
    __obj.asInstanceOf[typings.nodeRsa.mod.AdvancedSigningSchemePSS]
  }
}
