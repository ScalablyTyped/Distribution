package typings.plupload

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait pluploadResize extends StObject {
  
  var crop: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var preserve_headers: js.UndefOr[Boolean] = js.native
  
  var quality: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object pluploadResize {
  
  @scala.inline
  def apply(): pluploadResize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[pluploadResize]
  }
  
  @scala.inline
  implicit class pluploadResizeMutableBuilder[Self <: pluploadResize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrop(value: Boolean): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setPreserve_headers(value: Boolean): Self = StObject.set(x, "preserve_headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserve_headersUndefined: Self = StObject.set(x, "preserve_headers", js.undefined)
    
    @scala.inline
    def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
