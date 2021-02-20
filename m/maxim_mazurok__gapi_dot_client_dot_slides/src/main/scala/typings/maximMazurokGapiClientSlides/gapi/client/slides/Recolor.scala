package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Recolor extends StObject {
  
  /**
    * The name of the recolor effect. The name is determined from the `recolor_stops` by matching the gradient against the colors in the page's current color scheme. This property is
    * read-only.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The recolor effect is represented by a gradient, which is a list of color stops. The colors in the gradient will replace the corresponding colors at the same position in the color
    * palette and apply to the image. This property is read-only.
    */
  var recolorStops: js.UndefOr[js.Array[ColorStop]] = js.native
}
object Recolor {
  
  @scala.inline
  def apply(): Recolor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Recolor]
  }
  
  @scala.inline
  implicit class RecolorMutableBuilder[Self <: Recolor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRecolorStops(value: js.Array[ColorStop]): Self = StObject.set(x, "recolorStops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecolorStopsUndefined: Self = StObject.set(x, "recolorStops", js.undefined)
    
    @scala.inline
    def setRecolorStopsVarargs(value: ColorStop*): Self = StObject.set(x, "recolorStops", js.Array(value :_*))
  }
}
