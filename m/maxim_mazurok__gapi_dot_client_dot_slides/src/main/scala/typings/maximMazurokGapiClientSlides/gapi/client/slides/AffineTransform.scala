package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AffineTransform extends StObject {
  
  /** The X coordinate scaling element. */
  var scaleX: js.UndefOr[Double] = js.undefined
  
  /** The Y coordinate scaling element. */
  var scaleY: js.UndefOr[Double] = js.undefined
  
  /** The X coordinate shearing element. */
  var shearX: js.UndefOr[Double] = js.undefined
  
  /** The Y coordinate shearing element. */
  var shearY: js.UndefOr[Double] = js.undefined
  
  /** The X coordinate translation element. */
  var translateX: js.UndefOr[Double] = js.undefined
  
  /** The Y coordinate translation element. */
  var translateY: js.UndefOr[Double] = js.undefined
  
  /** The units for translate elements. */
  var unit: js.UndefOr[String] = js.undefined
}
object AffineTransform {
  
  inline def apply(): AffineTransform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AffineTransform]
  }
  
  extension [Self <: AffineTransform](x: Self) {
    
    inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    inline def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
    
    inline def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    inline def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
    
    inline def setShearX(value: Double): Self = StObject.set(x, "shearX", value.asInstanceOf[js.Any])
    
    inline def setShearXUndefined: Self = StObject.set(x, "shearX", js.undefined)
    
    inline def setShearY(value: Double): Self = StObject.set(x, "shearY", value.asInstanceOf[js.Any])
    
    inline def setShearYUndefined: Self = StObject.set(x, "shearY", js.undefined)
    
    inline def setTranslateX(value: Double): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
    
    inline def setTranslateXUndefined: Self = StObject.set(x, "translateX", js.undefined)
    
    inline def setTranslateY(value: Double): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
    
    inline def setTranslateYUndefined: Self = StObject.set(x, "translateY", js.undefined)
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
