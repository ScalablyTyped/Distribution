package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Outline extends StObject {
  
  /** The dash style of the outline. */
  var dashStyle: js.UndefOr[String] = js.native
  
  /** The fill of the outline. */
  var outlineFill: js.UndefOr[OutlineFill] = js.native
  
  /**
    * The outline property state. Updating the outline on a page element will implicitly update this field to `RENDERED`, unless another value is specified in the same request. To have no
    * outline on a page element, set this field to `NOT_RENDERED`. In this case, any other outline fields set in the same request will be ignored.
    */
  var propertyState: js.UndefOr[String] = js.native
  
  /** The thickness of the outline. */
  var weight: js.UndefOr[Dimension] = js.native
}
object Outline {
  
  @scala.inline
  def apply(): Outline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Outline]
  }
  
  @scala.inline
  implicit class OutlineMutableBuilder[Self <: Outline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDashStyle(value: String): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    @scala.inline
    def setOutlineFill(value: OutlineFill): Self = StObject.set(x, "outlineFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineFillUndefined: Self = StObject.set(x, "outlineFill", js.undefined)
    
    @scala.inline
    def setPropertyState(value: String): Self = StObject.set(x, "propertyState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyStateUndefined: Self = StObject.set(x, "propertyState", js.undefined)
    
    @scala.inline
    def setWeight(value: Dimension): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
