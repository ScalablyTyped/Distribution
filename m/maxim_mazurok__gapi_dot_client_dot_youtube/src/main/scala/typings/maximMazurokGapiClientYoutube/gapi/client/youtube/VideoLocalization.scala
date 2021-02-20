package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoLocalization extends StObject {
  
  /** Localized version of the video's description. */
  var description: js.UndefOr[String] = js.native
  
  /** Localized version of the video's title. */
  var title: js.UndefOr[String] = js.native
}
object VideoLocalization {
  
  @scala.inline
  def apply(): VideoLocalization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoLocalization]
  }
  
  @scala.inline
  implicit class VideoLocalizationMutableBuilder[Self <: VideoLocalization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
