package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CropProperties extends StObject {
  
  /** The clockwise rotation angle of the crop rectangle around its center, in radians. Rotation is applied after the offsets. */
  var angle: js.UndefOr[Double] = js.native
  
  /** The offset specifies how far inwards the bottom edge of the crop rectangle is from the bottom edge of the original content as a fraction of the original content's height. */
  var offsetBottom: js.UndefOr[Double] = js.native
  
  /** The offset specifies how far inwards the left edge of the crop rectangle is from the left edge of the original content as a fraction of the original content's width. */
  var offsetLeft: js.UndefOr[Double] = js.native
  
  /** The offset specifies how far inwards the right edge of the crop rectangle is from the right edge of the original content as a fraction of the original content's width. */
  var offsetRight: js.UndefOr[Double] = js.native
  
  /** The offset specifies how far inwards the top edge of the crop rectangle is from the top edge of the original content as a fraction of the original content's height. */
  var offsetTop: js.UndefOr[Double] = js.native
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
    def setOffsetBottom(value: Double): Self = StObject.set(x, "offsetBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetBottomUndefined: Self = StObject.set(x, "offsetBottom", js.undefined)
    
    @scala.inline
    def setOffsetLeft(value: Double): Self = StObject.set(x, "offsetLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetLeftUndefined: Self = StObject.set(x, "offsetLeft", js.undefined)
    
    @scala.inline
    def setOffsetRight(value: Double): Self = StObject.set(x, "offsetRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetRightUndefined: Self = StObject.set(x, "offsetRight", js.undefined)
    
    @scala.inline
    def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetTopUndefined: Self = StObject.set(x, "offsetTop", js.undefined)
  }
}
