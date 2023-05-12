package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MacOSMicrosoftEdgeApp
  extends StObject
     with MobileApp {
  
  // The channel to install on target devices. Possible values are: dev, beta, stable, unknownFutureValue.
  var channel: js.UndefOr[MicrosoftEdgeChannel] = js.undefined
}
object MacOSMicrosoftEdgeApp {
  
  inline def apply(): MacOSMicrosoftEdgeApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MacOSMicrosoftEdgeApp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MacOSMicrosoftEdgeApp] (val x: Self) extends AnyVal {
    
    inline def setChannel(value: MicrosoftEdgeChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
  }
}
