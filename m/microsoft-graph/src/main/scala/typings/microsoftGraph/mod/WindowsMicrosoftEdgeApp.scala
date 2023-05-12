package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsMicrosoftEdgeApp
  extends StObject
     with MobileApp {
  
  /**
    * The channel to install on target devices. The possible values are dev, beta, and stable. By default, this property is
    * set to dev. Possible values are: dev, beta, stable, unknownFutureValue.
    */
  var channel: js.UndefOr[MicrosoftEdgeChannel] = js.undefined
  
  // The language locale to use when the Edge app displays text to the user.
  var displayLanguageLocale: js.UndefOr[NullableOption[String]] = js.undefined
}
object WindowsMicrosoftEdgeApp {
  
  inline def apply(): WindowsMicrosoftEdgeApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsMicrosoftEdgeApp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindowsMicrosoftEdgeApp] (val x: Self) extends AnyVal {
    
    inline def setChannel(value: MicrosoftEdgeChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    inline def setDisplayLanguageLocale(value: NullableOption[String]): Self = StObject.set(x, "displayLanguageLocale", value.asInstanceOf[js.Any])
    
    inline def setDisplayLanguageLocaleNull: Self = StObject.set(x, "displayLanguageLocale", null)
    
    inline def setDisplayLanguageLocaleUndefined: Self = StObject.set(x, "displayLanguageLocale", js.undefined)
  }
}
