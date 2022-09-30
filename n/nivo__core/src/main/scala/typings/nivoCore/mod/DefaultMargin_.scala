package typings.nivoCore.mod

import typings.nivoCore.nivoCoreInts.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultMargin_ extends StObject {
  
  var bottom: `0`
  
  var left: `0`
  
  var right: `0`
  
  var top: `0`
}
object DefaultMargin_ {
  
  inline def apply(): DefaultMargin_ = {
    val __obj = js.Dynamic.literal(bottom = 0, left = 0, right = 0, top = 0)
    __obj.asInstanceOf[DefaultMargin_]
  }
  
  extension [Self <: DefaultMargin_](x: Self) {
    
    inline def setBottom(value: `0`): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: `0`): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: `0`): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: `0`): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
