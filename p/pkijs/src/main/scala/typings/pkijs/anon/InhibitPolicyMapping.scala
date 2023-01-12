package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InhibitPolicyMapping extends StObject {
  
  var inhibitPolicyMapping: js.UndefOr[String] = js.undefined
  
  var requireExplicitPolicy: js.UndefOr[String] = js.undefined
}
object InhibitPolicyMapping {
  
  inline def apply(): InhibitPolicyMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InhibitPolicyMapping]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InhibitPolicyMapping] (val x: Self) extends AnyVal {
    
    inline def setInhibitPolicyMapping(value: String): Self = StObject.set(x, "inhibitPolicyMapping", value.asInstanceOf[js.Any])
    
    inline def setInhibitPolicyMappingUndefined: Self = StObject.set(x, "inhibitPolicyMapping", js.undefined)
    
    inline def setRequireExplicitPolicy(value: String): Self = StObject.set(x, "requireExplicitPolicy", value.asInstanceOf[js.Any])
    
    inline def setRequireExplicitPolicyUndefined: Self = StObject.set(x, "requireExplicitPolicy", js.undefined)
  }
}
