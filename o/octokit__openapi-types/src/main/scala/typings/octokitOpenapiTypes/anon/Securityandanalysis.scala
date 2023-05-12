package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Securityandanalysis extends StObject {
  
  var security_and_analysis: js.UndefOr[Secretscanning | Null] = js.undefined
}
object Securityandanalysis {
  
  inline def apply(): Securityandanalysis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Securityandanalysis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Securityandanalysis] (val x: Self) extends AnyVal {
    
    inline def setSecurity_and_analysis(value: Secretscanning): Self = StObject.set(x, "security_and_analysis", value.asInstanceOf[js.Any])
    
    inline def setSecurity_and_analysisNull: Self = StObject.set(x, "security_and_analysis", null)
    
    inline def setSecurity_and_analysisUndefined: Self = StObject.set(x, "security_and_analysis", js.undefined)
  }
}
