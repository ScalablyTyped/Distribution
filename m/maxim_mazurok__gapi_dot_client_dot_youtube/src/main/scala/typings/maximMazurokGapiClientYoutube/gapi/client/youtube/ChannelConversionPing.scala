package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelConversionPing extends StObject {
  
  /** Defines the context of the ping. */
  var context: js.UndefOr[String] = js.undefined
  
  /**
    * The url (without the schema) that the player shall send the ping to. It's at caller's descretion to decide which schema to use (http vs https) Example of a returned url:
    * //googleads.g.doubleclick.net/pagead/ viewthroughconversion/962985656/?data=path%3DtHe_path%3Btype%3D cview%3Butuid%3DGISQtTNGYqaYl4sKxoVvKA&labe=default The caller must append
    * biscotti authentication (ms param in case of mobile, for example) to this ping.
    */
  var conversionUrl: js.UndefOr[String] = js.undefined
}
object ChannelConversionPing {
  
  inline def apply(): ChannelConversionPing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelConversionPing]
  }
  
  extension [Self <: ChannelConversionPing](x: Self) {
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setConversionUrl(value: String): Self = StObject.set(x, "conversionUrl", value.asInstanceOf[js.Any])
    
    inline def setConversionUrlUndefined: Self = StObject.set(x, "conversionUrl", js.undefined)
  }
}
