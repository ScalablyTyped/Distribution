package typings.phaser.MatterJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//  --------------------------------------------------------------
//  Interfaces
//  --------------------------------------------------------------
trait IChamfer extends StObject {
  
  var quality: js.UndefOr[Double] = js.undefined
  
  var qualityMax: js.UndefOr[Double] = js.undefined
  
  var qualityMin: js.UndefOr[Double] = js.undefined
  
  var radius: js.UndefOr[Double | js.Array[Double]] = js.undefined
}
object IChamfer {
  
  @scala.inline
  def apply(): IChamfer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChamfer]
  }
  
  @scala.inline
  implicit class IChamferMutableBuilder[Self <: IChamfer] (val x: Self) extends AnyVal {
    
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
