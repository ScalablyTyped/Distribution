package typings.nodeRsa.mod

import typings.nodeRsa.nodeRsaStrings.pkcs1
import typings.nodeRsa.nodeRsaStrings.pss
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.nodeRsa.mod.AdvancedSigningSchemePSS
  - typings.nodeRsa.mod.AdvancedSigningSchemePKCS1
*/
trait AdvancedSigningScheme extends StObject
object AdvancedSigningScheme {
  
  @scala.inline
  def AdvancedSigningSchemePKCS1(hash: HashingAlgorithm, scheme: pkcs1): typings.nodeRsa.mod.AdvancedSigningSchemePKCS1 = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nodeRsa.mod.AdvancedSigningSchemePKCS1]
  }
  
  @scala.inline
  def AdvancedSigningSchemePSS(hash: HashingAlgorithm, saltLength: Double, scheme: pss): typings.nodeRsa.mod.AdvancedSigningSchemePSS = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], saltLength = saltLength.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nodeRsa.mod.AdvancedSigningSchemePSS]
  }
}
