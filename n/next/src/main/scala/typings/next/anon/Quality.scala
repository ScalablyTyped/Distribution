package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Quality extends StObject {
  
  var quality: Double
}
object Quality {
  
  inline def apply(quality: Double): Quality = {
    val __obj = js.Dynamic.literal(quality = quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[Quality]
  }
  
  extension [Self <: Quality](x: Self) {
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
  }
}
