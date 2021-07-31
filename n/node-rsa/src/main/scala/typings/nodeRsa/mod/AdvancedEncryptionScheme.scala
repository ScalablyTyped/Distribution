package typings.nodeRsa.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.nodeRsa.mod.AdvancedEncryptionSchemePKCS1
  - typings.nodeRsa.mod.AdvancedEncryptionSchemePKCS1OAEP
*/
trait AdvancedEncryptionScheme extends StObject
object AdvancedEncryptionScheme {
  
  @scala.inline
  def AdvancedEncryptionSchemePKCS1(padding: Double): typings.nodeRsa.mod.AdvancedEncryptionSchemePKCS1 = {
    val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any], scheme = "pkcs1")
    __obj.asInstanceOf[typings.nodeRsa.mod.AdvancedEncryptionSchemePKCS1]
  }
  
  @scala.inline
  def AdvancedEncryptionSchemePKCS1OAEP(hash: HashingAlgorithm): typings.nodeRsa.mod.AdvancedEncryptionSchemePKCS1OAEP = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], scheme = "pkcs1_oaep")
    __obj.asInstanceOf[typings.nodeRsa.mod.AdvancedEncryptionSchemePKCS1OAEP]
  }
}
