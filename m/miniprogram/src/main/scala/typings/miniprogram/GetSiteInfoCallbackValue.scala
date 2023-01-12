package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSiteInfoCallbackValue extends StObject {
  
  var siteName: String
}
object GetSiteInfoCallbackValue {
  
  inline def apply(siteName: String): GetSiteInfoCallbackValue = {
    val __obj = js.Dynamic.literal(siteName = siteName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSiteInfoCallbackValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSiteInfoCallbackValue] (val x: Self) extends AnyVal {
    
    inline def setSiteName(value: String): Self = StObject.set(x, "siteName", value.asInstanceOf[js.Any])
  }
}
