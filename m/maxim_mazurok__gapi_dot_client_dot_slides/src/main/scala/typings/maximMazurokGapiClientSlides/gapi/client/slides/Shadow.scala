package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shadow extends StObject {
  
  /** The alignment point of the shadow, that sets the origin for translate, scale and skew of the shadow. This property is read-only. */
  var alignment: js.UndefOr[String] = js.undefined
  
  /** The alpha of the shadow's color, from 0.0 to 1.0. */
  var alpha: js.UndefOr[Double] = js.undefined
  
  /** The radius of the shadow blur. The larger the radius, the more diffuse the shadow becomes. */
  var blurRadius: js.UndefOr[Dimension] = js.undefined
  
  /** The shadow color value. */
  var color: js.UndefOr[OpaqueColor] = js.undefined
  
  /**
    * The shadow property state. Updating the shadow on a page element will implicitly update this field to `RENDERED`, unless another value is specified in the same request. To have no
    * shadow on a page element, set this field to `NOT_RENDERED`. In this case, any other shadow fields set in the same request will be ignored.
    */
  var propertyState: js.UndefOr[String] = js.undefined
  
  /** Whether the shadow should rotate with the shape. This property is read-only. */
  var rotateWithShape: js.UndefOr[Boolean] = js.undefined
  
  /** Transform that encodes the translate, scale, and skew of the shadow, relative to the alignment position. */
  var transform: js.UndefOr[AffineTransform] = js.undefined
  
  /** The type of the shadow. This property is read-only. */
  var `type`: js.UndefOr[String] = js.undefined
}
object Shadow {
  
  @scala.inline
  def apply(): Shadow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shadow]
  }
  
  @scala.inline
  implicit class ShadowMutableBuilder[Self <: Shadow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignment(value: String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    @scala.inline
    def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    @scala.inline
    def setBlurRadius(value: Dimension): Self = StObject.set(x, "blurRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlurRadiusUndefined: Self = StObject.set(x, "blurRadius", js.undefined)
    
    @scala.inline
    def setColor(value: OpaqueColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setPropertyState(value: String): Self = StObject.set(x, "propertyState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyStateUndefined: Self = StObject.set(x, "propertyState", js.undefined)
    
    @scala.inline
    def setRotateWithShape(value: Boolean): Self = StObject.set(x, "rotateWithShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateWithShapeUndefined: Self = StObject.set(x, "rotateWithShape", js.undefined)
    
    @scala.inline
    def setTransform(value: AffineTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
