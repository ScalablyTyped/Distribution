package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait YaraRuleSignature extends StObject {
  
  /** The name of the YARA rule. */
  var yaraRule: js.UndefOr[String] = js.undefined
}
object YaraRuleSignature {
  
  inline def apply(): YaraRuleSignature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YaraRuleSignature]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: YaraRuleSignature] (val x: Self) extends AnyVal {
    
    inline def setYaraRule(value: String): Self = StObject.set(x, "yaraRule", value.asInstanceOf[js.Any])
    
    inline def setYaraRuleUndefined: Self = StObject.set(x, "yaraRule", js.undefined)
  }
}
