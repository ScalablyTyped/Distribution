package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AffineTransform extends StObject {
  
  /** The X coordinate scaling element. */
  var scaleX: js.UndefOr[Double] = js.native
  
  /** The Y coordinate scaling element. */
  var scaleY: js.UndefOr[Double] = js.native
  
  /** The X coordinate shearing element. */
  var shearX: js.UndefOr[Double] = js.native
  
  /** The Y coordinate shearing element. */
  var shearY: js.UndefOr[Double] = js.native
  
  /** The X coordinate translation element. */
  var translateX: js.UndefOr[Double] = js.native
  
  /** The Y coordinate translation element. */
  var translateY: js.UndefOr[Double] = js.native
  
  /** The units for translate elements. */
  var unit: js.UndefOr[String] = js.native
}
object AffineTransform {
  
  @scala.inline
  def apply(): AffineTransform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AffineTransform]
  }
  
  @scala.inline
  implicit class AffineTransformMutableBuilder[Self <: AffineTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
    
    @scala.inline
    def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
    
    @scala.inline
    def setShearX(value: Double): Self = StObject.set(x, "shearX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShearXUndefined: Self = StObject.set(x, "shearX", js.undefined)
    
    @scala.inline
    def setShearY(value: Double): Self = StObject.set(x, "shearY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShearYUndefined: Self = StObject.set(x, "shearY", js.undefined)
    
    @scala.inline
    def setTranslateX(value: Double): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateXUndefined: Self = StObject.set(x, "translateX", js.undefined)
    
    @scala.inline
    def setTranslateY(value: Double): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateYUndefined: Self = StObject.set(x, "translateY", js.undefined)
    
    @scala.inline
    def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
