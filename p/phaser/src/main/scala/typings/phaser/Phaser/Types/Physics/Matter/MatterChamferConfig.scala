package typings.phaser.Phaser.Types.Physics.Matter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatterChamferConfig extends js.Object {
  
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
  implicit class MatterChamferConfigOps[Self <: MatterChamferConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    
    @scala.inline
    def setQualityMax(value: Double): Self = this.set("qualityMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQualityMax: Self = this.set("qualityMax", js.undefined)
    
    @scala.inline
    def setQualityMin(value: Double): Self = this.set("qualityMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQualityMin: Self = this.set("qualityMin", js.undefined)
    
    @scala.inline
    def setRadiusVarargs(value: Double*): Self = this.set("radius", js.Array(value :_*))
    
    @scala.inline
    def setRadius(value: Double | js.Array[Double]): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
  }
}
