package typings.phaser.Phaser.Types.Physics.Matter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatterChamferConfig extends StObject {
  
  /**
    * The quality of the chamfering. -1 means 'auto'.
    */
  var quality: js.UndefOr[Double] = js.native
  
  /**
    * The maximum quality of the chamfering. The higher this value, the more vertices are created.
    */
  var qualityMax: js.UndefOr[Double] = js.native
  
  /**
    * The minimum quality of the chamfering. The higher this value, the more vertices are created.
    */
  var qualityMin: js.UndefOr[Double] = js.native
  
  /**
    * A single number, or an array, to specify the radius for each vertex.
    */
  var radius: js.UndefOr[Double | js.Array[Double]] = js.native
}
object MatterChamferConfig {
  
  @scala.inline
  def apply(): MatterChamferConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatterChamferConfig]
  }
  
  @scala.inline
  implicit class MatterChamferConfigMutableBuilder[Self <: MatterChamferConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityMax(value: Double): Self = StObject.set(x, "qualityMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityMaxUndefined: Self = StObject.set(x, "qualityMax", js.undefined)
    
    @scala.inline
    def setQualityMin(value: Double): Self = StObject.set(x, "qualityMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityMinUndefined: Self = StObject.set(x, "qualityMin", js.undefined)
    
    @scala.inline
    def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    @scala.inline
    def setRadius(value: Double | js.Array[Double]): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setRadiusVarargs(value: Double*): Self = StObject.set(x, "radius", js.Array(value :_*))
  }
}
