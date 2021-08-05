package typings.minappEnv.wx

import typings.minappEnv.anon.CallFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WX_ extends StObject {
  
  var cloud: CallFunction
}
object WX_ {
  
  inline def apply(cloud: CallFunction): WX_ = {
    val __obj = js.Dynamic.literal(cloud = cloud.asInstanceOf[js.Any])
    __obj.asInstanceOf[WX_]
  }
  
  extension [Self <: WX_](x: Self) {
    
    inline def setCloud(value: CallFunction): Self = StObject.set(x, "cloud", value.asInstanceOf[js.Any])
  }
}
