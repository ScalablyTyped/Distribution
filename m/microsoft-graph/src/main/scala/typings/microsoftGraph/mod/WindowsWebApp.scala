package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsWebApp
  extends StObject
     with MobileApp {
  
  // Indicates the Windows web app URL. Example: 'https://www.contoso.com'
  var appUrl: js.UndefOr[NullableOption[String]] = js.undefined
}
object WindowsWebApp {
  
  inline def apply(): WindowsWebApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsWebApp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindowsWebApp] (val x: Self) extends AnyVal {
    
    inline def setAppUrl(value: NullableOption[String]): Self = StObject.set(x, "appUrl", value.asInstanceOf[js.Any])
    
    inline def setAppUrlNull: Self = StObject.set(x, "appUrl", null)
    
    inline def setAppUrlUndefined: Self = StObject.set(x, "appUrl", js.undefined)
  }
}
