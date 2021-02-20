package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageProperties extends StObject {
  
  /** If present, dominant colors completed successfully. */
  var dominantColors: js.UndefOr[DominantColorsAnnotation] = js.native
}
object ImageProperties {
  
  @scala.inline
  def apply(): ImageProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageProperties]
  }
  
  @scala.inline
  implicit class ImagePropertiesMutableBuilder[Self <: ImageProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDominantColors(value: DominantColorsAnnotation): Self = StObject.set(x, "dominantColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDominantColorsUndefined: Self = StObject.set(x, "dominantColors", js.undefined)
  }
}
