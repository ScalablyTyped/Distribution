package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelConversionPings extends StObject {
  
  /** Pings that the app shall fire (authenticated by biscotti cookie). Each ping has a context, in which the app must fire the ping, and a url identifying the ping. */
  var pings: js.UndefOr[js.Array[ChannelConversionPing]] = js.undefined
}
object ChannelConversionPings {
  
  inline def apply(): ChannelConversionPings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelConversionPings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelConversionPings] (val x: Self) extends AnyVal {
    
    inline def setPings(value: js.Array[ChannelConversionPing]): Self = StObject.set(x, "pings", value.asInstanceOf[js.Any])
    
    inline def setPingsUndefined: Self = StObject.set(x, "pings", js.undefined)
    
    inline def setPingsVarargs(value: ChannelConversionPing*): Self = StObject.set(x, "pings", js.Array(value*))
  }
}
