package typings.onfidoSdkUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseLogoCobranding extends StObject {
  
  var darkLogoSrc: String
  
  var lightLogoSrc: String
}
object EnterpriseLogoCobranding {
  
  inline def apply(darkLogoSrc: String, lightLogoSrc: String): EnterpriseLogoCobranding = {
    val __obj = js.Dynamic.literal(darkLogoSrc = darkLogoSrc.asInstanceOf[js.Any], lightLogoSrc = lightLogoSrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseLogoCobranding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnterpriseLogoCobranding] (val x: Self) extends AnyVal {
    
    inline def setDarkLogoSrc(value: String): Self = StObject.set(x, "darkLogoSrc", value.asInstanceOf[js.Any])
    
    inline def setLightLogoSrc(value: String): Self = StObject.set(x, "lightLogoSrc", value.asInstanceOf[js.Any])
  }
}
