package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Totalms extends StObject {
  
  var total_ms: Double
}
object Totalms {
  
  inline def apply(total_ms: Double): Totalms = {
    val __obj = js.Dynamic.literal(total_ms = total_ms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Totalms]
  }
  
  extension [Self <: Totalms](x: Self) {
    
    inline def setTotal_ms(value: Double): Self = StObject.set(x, "total_ms", value.asInstanceOf[js.Any])
  }
}
