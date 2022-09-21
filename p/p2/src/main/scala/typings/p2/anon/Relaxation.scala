package typings.p2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Relaxation extends StObject {
  
  var relaxation: js.UndefOr[Double] = js.undefined
  
  var stiffness: js.UndefOr[Double] = js.undefined
}
object Relaxation {
  
  inline def apply(): Relaxation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Relaxation]
  }
  
  extension [Self <: Relaxation](x: Self) {
    
    inline def setRelaxation(value: Double): Self = StObject.set(x, "relaxation", value.asInstanceOf[js.Any])
    
    inline def setRelaxationUndefined: Self = StObject.set(x, "relaxation", js.undefined)
    
    inline def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
    
    inline def setStiffnessUndefined: Self = StObject.set(x, "stiffness", js.undefined)
  }
}
