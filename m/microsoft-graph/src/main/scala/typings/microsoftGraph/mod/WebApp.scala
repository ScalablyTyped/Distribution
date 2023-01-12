package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebApp
  extends StObject
     with MobileApp {
  
  // The web app URL. This property cannot be PATCHed.
  var appUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Whether or not to use managed browser. This property is only applicable for Android and IOS.
  var useManagedBrowser: js.UndefOr[Boolean] = js.undefined
}
object WebApp {
  
  inline def apply(): WebApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebApp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebApp] (val x: Self) extends AnyVal {
    
    inline def setAppUrl(value: NullableOption[String]): Self = StObject.set(x, "appUrl", value.asInstanceOf[js.Any])
    
    inline def setAppUrlNull: Self = StObject.set(x, "appUrl", null)
    
    inline def setAppUrlUndefined: Self = StObject.set(x, "appUrl", js.undefined)
    
    inline def setUseManagedBrowser(value: Boolean): Self = StObject.set(x, "useManagedBrowser", value.asInstanceOf[js.Any])
    
    inline def setUseManagedBrowserUndefined: Self = StObject.set(x, "useManagedBrowser", js.undefined)
  }
}
