package typings.pixiSpineBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IIkConstraintData
  extends StObject
     with IConstraintData {
  
  /** -1 | 0 | 1 */
  var bendDirection: Double
  
  var compress: Boolean
  
  /** A percentage (0-1) */
  var mix: Double
  
  var stretch: Boolean
  
  var uniform: Boolean
}
object IIkConstraintData {
  
  inline def apply(
    bendDirection: Double,
    compress: Boolean,
    mix: Double,
    name: String,
    order: Double,
    stretch: Boolean,
    uniform: Boolean
  ): IIkConstraintData = {
    val __obj = js.Dynamic.literal(bendDirection = bendDirection.asInstanceOf[js.Any], compress = compress.asInstanceOf[js.Any], mix = mix.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], stretch = stretch.asInstanceOf[js.Any], uniform = uniform.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIkConstraintData]
  }
  
  extension [Self <: IIkConstraintData](x: Self) {
    
    inline def setBendDirection(value: Double): Self = StObject.set(x, "bendDirection", value.asInstanceOf[js.Any])
    
    inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
    
    inline def setMix(value: Double): Self = StObject.set(x, "mix", value.asInstanceOf[js.Any])
    
    inline def setStretch(value: Boolean): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
    
    inline def setUniform(value: Boolean): Self = StObject.set(x, "uniform", value.asInstanceOf[js.Any])
  }
}
