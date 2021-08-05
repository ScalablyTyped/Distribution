package typings.overwatchApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Endorsement extends StObject {
  
  var rate: Double
  
  var value: Double
}
object Endorsement {
  
  inline def apply(rate: Double, value: Double): Endorsement = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endorsement]
  }
  
  extension [Self <: Endorsement](x: Self) {
    
    inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
