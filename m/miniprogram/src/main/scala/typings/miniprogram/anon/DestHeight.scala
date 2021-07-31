package typings.miniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestHeight extends StObject {
  
  var destHeight: js.UndefOr[Double] = js.undefined
  
  var destWidth: js.UndefOr[Double] = js.undefined
  
  var fileType: js.UndefOr[String] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var quality: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
}
object DestHeight {
  
  @scala.inline
  def apply(): DestHeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestHeight]
  }
  
  @scala.inline
  implicit class DestHeightMutableBuilder[Self <: DestHeight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestHeight(value: Double): Self = StObject.set(x, "destHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestHeightUndefined: Self = StObject.set(x, "destHeight", js.undefined)
    
    @scala.inline
    def setDestWidth(value: Double): Self = StObject.set(x, "destWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestWidthUndefined: Self = StObject.set(x, "destWidth", js.undefined)
    
    @scala.inline
    def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
