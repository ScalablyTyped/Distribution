package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChecksCreateParamsOutputImages extends StObject {
  
  var alt: String
  
  var caption: js.UndefOr[String] = js.undefined
  
  var image_url: String
}
object ChecksCreateParamsOutputImages {
  
  @scala.inline
  def apply(alt: String, image_url: String): ChecksCreateParamsOutputImages = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], image_url = image_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksCreateParamsOutputImages]
  }
  
  @scala.inline
  implicit class ChecksCreateParamsOutputImagesMutableBuilder[Self <: ChecksCreateParamsOutputImages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    @scala.inline
    def setImage_url(value: String): Self = StObject.set(x, "image_url", value.asInstanceOf[js.Any])
  }
}
