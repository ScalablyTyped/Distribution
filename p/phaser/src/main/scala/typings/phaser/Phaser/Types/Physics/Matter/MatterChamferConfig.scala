package typings.phaser.Phaser.Types.Physics.Matter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatterChamferConfig extends StObject {
  
  /**
    * The quality of the chamfering. -1 means 'auto'.
    */
  var quality: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum quality of the chamfering. The higher this value, the more vertices are created.
    */
  var qualityMax: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum quality of the chamfering. The higher this value, the more vertices are created.
    */
  var qualityMin: js.UndefOr[Double] = js.undefined
  
  /**
    * A single number, or an array, to specify the radius for each vertex.
    */
  var radius: js.UndefOr[Double | js.Array[Double]] = js.undefined
}
object MatterChamferConfig {
  
  inline def apply(): MatterChamferConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatterChamferConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MatterChamferConfig] (val x: Self) extends AnyVal {
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityMax(value: Double): Self = StObject.set(x, "qualityMax", value.asInstanceOf[js.Any])
    
    inline def setQualityMaxUndefined: Self = StObject.set(x, "qualityMax", js.undefined)
    
    inline def setQualityMin(value: Double): Self = StObject.set(x, "qualityMin", value.asInstanceOf[js.Any])
    
    inline def setQualityMinUndefined: Self = StObject.set(x, "qualityMin", js.undefined)
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setRadius(value: Double | js.Array[Double]): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setRadiusVarargs(value: Double*): Self = StObject.set(x, "radius", js.Array(value*))
  }
}
