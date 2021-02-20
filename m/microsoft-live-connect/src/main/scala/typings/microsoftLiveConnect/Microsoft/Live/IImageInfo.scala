package typings.microsoftLiveConnect.Microsoft.Live

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about an image.
  */
@js.native
trait IImageInfo extends StObject {
  
  /**
    * The height, in pixels, of this image of this particular size.
    */
  var height: Double = js.native
  
  /**
    * The width, in pixels, of this image of this particular size.
    */
  var source: String = js.native
  
  /**
    * The type of this image of this particular size. Valid values are:
    * full (maximum size: 2048 x 2048 pixels)
    * - normal (maximum size 800 x 800 pixels)
    * - album (maximum size 176 x 176 pixels)
    * - small (maximum size 96 x 96 pixels)
    */
  var `type`: String = js.native
  
  /**
    * The width, in pixels, of this image of this particular size.
    */
  var width: Double = js.native
}
object IImageInfo {
  
  @scala.inline
  def apply(height: Double, source: String, `type`: String, width: Double): IImageInfo = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IImageInfo]
  }
  
  @scala.inline
  implicit class IImageInfoMutableBuilder[Self <: IImageInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
