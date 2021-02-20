package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CropProperties extends StObject {
  
  /** The rotation angle of the crop window around its center, in radians. Rotation angle is applied after the offset. */
  var angle: js.UndefOr[Double] = js.native
  
  /** The offset specifies the bottom edge of the crop rectangle that is located above the original bounding rectangle bottom edge, relative to the object's original height. */
  var bottomOffset: js.UndefOr[Double] = js.native
  
  /** The offset specifies the left edge of the crop rectangle that is located to the right of the original bounding rectangle left edge, relative to the object's original width. */
  var leftOffset: js.UndefOr[Double] = js.native
  
  /** The offset specifies the right edge of the crop rectangle that is located to the left of the original bounding rectangle right edge, relative to the object's original width. */
  var rightOffset: js.UndefOr[Double] = js.native
  
  /** The offset specifies the top edge of the crop rectangle that is located below the original bounding rectangle top edge, relative to the object's original height. */
  var topOffset: js.UndefOr[Double] = js.native
}
object CropProperties {
  
  @scala.inline
  def apply(): CropProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CropProperties]
  }
  
  @scala.inline
  implicit class CropPropertiesMutableBuilder[Self <: CropProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    @scala.inline
    def setBottomOffset(value: Double): Self = StObject.set(x, "bottomOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomOffsetUndefined: Self = StObject.set(x, "bottomOffset", js.undefined)
    
    @scala.inline
    def setLeftOffset(value: Double): Self = StObject.set(x, "leftOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftOffsetUndefined: Self = StObject.set(x, "leftOffset", js.undefined)
    
    @scala.inline
    def setRightOffset(value: Double): Self = StObject.set(x, "rightOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightOffsetUndefined: Self = StObject.set(x, "rightOffset", js.undefined)
    
    @scala.inline
    def setTopOffset(value: Double): Self = StObject.set(x, "topOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopOffsetUndefined: Self = StObject.set(x, "topOffset", js.undefined)
  }
}
