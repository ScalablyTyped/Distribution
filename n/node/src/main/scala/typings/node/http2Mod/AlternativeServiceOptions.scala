package typings.node.http2Mod

import typings.node.nodeUrlMod.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlternativeServiceOptions extends StObject {
  
  var origin: Double | String | URL
}
object AlternativeServiceOptions {
  
  inline def apply(origin: Double | String | URL): AlternativeServiceOptions = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlternativeServiceOptions]
  }
  
  extension [Self <: AlternativeServiceOptions](x: Self) {
    
    inline def setOrigin(value: Double | String | URL): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
  }
}
