package typings.pixiSpineBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IIkConstraint extends StObject {
  
  /** -1 | 0 | 1 */
  var bendDirection: Double
  
  var compress: Boolean
  
  var data: IIkConstraintData
  
  /** A percentage (0-1) */
  var mix: Double
  
  var stretch: Boolean
}
object IIkConstraint {
  
  inline def apply(bendDirection: Double, compress: Boolean, data: IIkConstraintData, mix: Double, stretch: Boolean): IIkConstraint = {
    val __obj = js.Dynamic.literal(bendDirection = bendDirection.asInstanceOf[js.Any], compress = compress.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], mix = mix.asInstanceOf[js.Any], stretch = stretch.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIkConstraint]
  }
  
  extension [Self <: IIkConstraint](x: Self) {
    
    inline def setBendDirection(value: Double): Self = StObject.set(x, "bendDirection", value.asInstanceOf[js.Any])
    
    inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
    
    inline def setData(value: IIkConstraintData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMix(value: Double): Self = StObject.set(x, "mix", value.asInstanceOf[js.Any])
    
    inline def setStretch(value: Boolean): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
  }
}
