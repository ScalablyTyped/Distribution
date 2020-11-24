package typings.maximMazurokGapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shadow extends js.Object {
  
  /** The alignment point of the shadow, that sets the origin for translate, scale and skew of the shadow. This property is read-only. */
  var alignment: js.UndefOr[String] = js.native
  
  /** The alpha of the shadow's color, from 0.0 to 1.0. */
  var alpha: js.UndefOr[Double] = js.native
  
  /** The radius of the shadow blur. The larger the radius, the more diffuse the shadow becomes. */
  var blurRadius: js.UndefOr[Dimension] = js.native
  
  /** The shadow color value. */
  var color: js.UndefOr[OpaqueColor] = js.native
  
  /**
    * The shadow property state. Updating the shadow on a page element will implicitly update this field to `RENDERED`, unless another value is specified in the same request. To have no
    * shadow on a page element, set this field to `NOT_RENDERED`. In this case, any other shadow fields set in the same request will be ignored.
    */
  var propertyState: js.UndefOr[String] = js.native
  
  /** Whether the shadow should rotate with the shape. This property is read-only. */
  var rotateWithShape: js.UndefOr[Boolean] = js.native
  
  /** Transform that encodes the translate, scale, and skew of the shadow, relative to the alignment position. */
  var transform: js.UndefOr[AffineTransform] = js.native
  
  /** The type of the shadow. This property is read-only. */
  var `type`: js.UndefOr[String] = js.native
}
object Shadow {
  
  @scala.inline
  def apply(): Shadow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shadow]
  }
  
  @scala.inline
  implicit class ShadowOps[Self <: Shadow] (val x: Self) extends AnyVal {
    
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
    def setAlignment(value: String): Self = this.set("alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    
    @scala.inline
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    
    @scala.inline
    def setBlurRadius(value: Dimension): Self = this.set("blurRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlurRadius: Self = this.set("blurRadius", js.undefined)
    
    @scala.inline
    def setColor(value: OpaqueColor): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setPropertyState(value: String): Self = this.set("propertyState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropertyState: Self = this.set("propertyState", js.undefined)
    
    @scala.inline
    def setRotateWithShape(value: Boolean): Self = this.set("rotateWithShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotateWithShape: Self = this.set("rotateWithShape", js.undefined)
    
    @scala.inline
    def setTransform(value: AffineTransform): Self = this.set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
