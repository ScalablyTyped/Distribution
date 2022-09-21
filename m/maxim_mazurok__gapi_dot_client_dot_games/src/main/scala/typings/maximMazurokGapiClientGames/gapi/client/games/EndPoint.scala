package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndPoint extends StObject {
  
  /** A URL suitable for loading in a web browser for the requested endpoint. */
  var url: js.UndefOr[String] = js.undefined
}
object EndPoint {
  
  inline def apply(): EndPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndPoint]
  }
  
  extension [Self <: EndPoint](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
