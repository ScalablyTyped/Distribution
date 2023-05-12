package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosiPadOSWebClip
  extends StObject
     with MobileApp {
  
  // Indicates iOS/iPadOS web clip app URL. Example: 'https://www.contoso.com'
  var appUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Whether or not to use managed browser. When TRUE, the app will be required to be opened in Microsoft Edge. When FALSE,
    * the app will not be required to be opened in Microsoft Edge. By default, this property is set to FALSE.
    */
  var useManagedBrowser: js.UndefOr[Boolean] = js.undefined
}
object IosiPadOSWebClip {
  
  inline def apply(): IosiPadOSWebClip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosiPadOSWebClip]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IosiPadOSWebClip] (val x: Self) extends AnyVal {
    
    inline def setAppUrl(value: NullableOption[String]): Self = StObject.set(x, "appUrl", value.asInstanceOf[js.Any])
    
    inline def setAppUrlNull: Self = StObject.set(x, "appUrl", null)
    
    inline def setAppUrlUndefined: Self = StObject.set(x, "appUrl", js.undefined)
    
    inline def setUseManagedBrowser(value: Boolean): Self = StObject.set(x, "useManagedBrowser", value.asInstanceOf[js.Any])
    
    inline def setUseManagedBrowserUndefined: Self = StObject.set(x, "useManagedBrowser", js.undefined)
  }
}
