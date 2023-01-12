package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bias extends StObject {
  
  var bias: Double
  
  var normalBias: Double
}
object Bias {
  
  inline def apply(bias: Double, normalBias: Double): Bias = {
    val __obj = js.Dynamic.literal(bias = bias.asInstanceOf[js.Any], normalBias = normalBias.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bias]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bias] (val x: Self) extends AnyVal {
    
    inline def setBias(value: Double): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
    
    inline def setNormalBias(value: Double): Self = StObject.set(x, "normalBias", value.asInstanceOf[js.Any])
  }
}
