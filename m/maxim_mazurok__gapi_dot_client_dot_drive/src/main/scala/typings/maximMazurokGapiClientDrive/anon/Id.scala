package typings.maximMazurokGapiClientDrive.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Id extends StObject {
  
  /** The ID of an image file in Drive to use for the background image. */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The width of the cropped image in the closed range of 0 to 1. This value represents the width of the cropped image divided by the width of the entire image. The height is
    * computed by applying a width to height aspect ratio of 80 to 9. The resulting image must be at least 1280 pixels wide and 144 pixels high.
    */
  var width: js.UndefOr[Double] = js.native
  
  /**
    * The X coordinate of the upper left corner of the cropping area in the background image. This is a value in the closed range of 0 to 1. This value represents the horizontal
    * distance from the left side of the entire image to the left side of the cropping area divided by the width of the entire image.
    */
  var xCoordinate: js.UndefOr[Double] = js.native
  
  /**
    * The Y coordinate of the upper left corner of the cropping area in the background image. This is a value in the closed range of 0 to 1. This value represents the vertical
    * distance from the top side of the entire image to the top side of the cropping area divided by the height of the entire image.
    */
  var yCoordinate: js.UndefOr[Double] = js.native
}
object Id {
  
  @scala.inline
  def apply(): Id = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Id]
  }
  
  @scala.inline
  implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setXCoordinate(value: Double): Self = StObject.set(x, "xCoordinate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXCoordinateUndefined: Self = StObject.set(x, "xCoordinate", js.undefined)
    
    @scala.inline
    def setYCoordinate(value: Double): Self = StObject.set(x, "yCoordinate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYCoordinateUndefined: Self = StObject.set(x, "yCoordinate", js.undefined)
  }
}
