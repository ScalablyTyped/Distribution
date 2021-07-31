package typings.nodeRsa.mod

import typings.nodeRsa.nodeRsaStrings.pkcs1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvancedEncryptionSchemePKCS1
  extends StObject
     with AdvancedEncryptionScheme {
  
  var padding: Double
  
  var scheme: pkcs1
}
object AdvancedEncryptionSchemePKCS1 {
  
  @scala.inline
  def apply(padding: Double): AdvancedEncryptionSchemePKCS1 = {
    val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any], scheme = "pkcs1")
    __obj.asInstanceOf[AdvancedEncryptionSchemePKCS1]
  }
  
  @scala.inline
  implicit class AdvancedEncryptionSchemePKCS1MutableBuilder[Self <: AdvancedEncryptionSchemePKCS1] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheme(value: pkcs1): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
  }
}
