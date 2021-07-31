package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThumbnailDetails extends StObject {
  
  /** The default image for this resource. */
  var default: js.UndefOr[Thumbnail] = js.undefined
  
  /** The high quality image for this resource. */
  var high: js.UndefOr[Thumbnail] = js.undefined
  
  /** The maximum resolution quality image for this resource. */
  var maxres: js.UndefOr[Thumbnail] = js.undefined
  
  /** The medium quality image for this resource. */
  var medium: js.UndefOr[Thumbnail] = js.undefined
  
  /** The standard quality image for this resource. */
  var standard: js.UndefOr[Thumbnail] = js.undefined
}
object ThumbnailDetails {
  
  @scala.inline
  def apply(): ThumbnailDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThumbnailDetails]
  }
  
  @scala.inline
  implicit class ThumbnailDetailsMutableBuilder[Self <: ThumbnailDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: Thumbnail): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setHigh(value: Thumbnail): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
    
    @scala.inline
    def setMaxres(value: Thumbnail): Self = StObject.set(x, "maxres", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxresUndefined: Self = StObject.set(x, "maxres", js.undefined)
    
    @scala.inline
    def setMedium(value: Thumbnail): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
    
    @scala.inline
    def setStandard(value: Thumbnail): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardUndefined: Self = StObject.set(x, "standard", js.undefined)
  }
}
