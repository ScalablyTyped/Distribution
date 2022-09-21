package typings.minio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionConfig extends StObject {
  
  var Rule: js.Array[EncryptionRule]
}
object EncryptionConfig {
  
  inline def apply(Rule: js.Array[EncryptionRule]): EncryptionConfig = {
    val __obj = js.Dynamic.literal(Rule = Rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionConfig]
  }
  
  extension [Self <: EncryptionConfig](x: Self) {
    
    inline def setRule(value: js.Array[EncryptionRule]): Self = StObject.set(x, "Rule", value.asInstanceOf[js.Any])
    
    inline def setRuleVarargs(value: EncryptionRule*): Self = StObject.set(x, "Rule", js.Array(value*))
  }
}
