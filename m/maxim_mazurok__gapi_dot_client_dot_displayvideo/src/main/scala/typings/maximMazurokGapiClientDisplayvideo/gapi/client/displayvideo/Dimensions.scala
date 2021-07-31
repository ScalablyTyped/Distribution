package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dimensions extends StObject {
  
  /** The height in pixels. */
  var heightPixels: js.UndefOr[Double] = js.undefined
  
  /** The width in pixels. */
  var widthPixels: js.UndefOr[Double] = js.undefined
}
object Dimensions {
  
  @scala.inline
  def apply(): Dimensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dimensions]
  }
  
  @scala.inline
  implicit class DimensionsMutableBuilder[Self <: Dimensions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeightPixels(value: Double): Self = StObject.set(x, "heightPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightPixelsUndefined: Self = StObject.set(x, "heightPixels", js.undefined)
    
    @scala.inline
    def setWidthPixels(value: Double): Self = StObject.set(x, "widthPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthPixelsUndefined: Self = StObject.set(x, "widthPixels", js.undefined)
  }
}
