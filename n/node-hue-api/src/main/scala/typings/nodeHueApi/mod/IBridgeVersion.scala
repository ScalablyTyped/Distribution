package typings.nodeHueApi.mod

import typings.nodeHueApi.anon.Api
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBridgeVersion extends StObject {
  
  var name: String
  
  var version: Api
}
object IBridgeVersion {
  
  inline def apply(name: String, version: Api): IBridgeVersion = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBridgeVersion]
  }
  
  extension [Self <: IBridgeVersion](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Api): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
