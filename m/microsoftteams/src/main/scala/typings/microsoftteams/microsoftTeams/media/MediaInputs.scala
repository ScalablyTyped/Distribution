package typings.microsoftteams.microsoftTeams.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Input parameter supplied to the select Media API
  */
trait MediaInputs extends StObject {
  
  /**
    * Additional properties for audio capture flows.
    */
  var audioProps: js.UndefOr[AudioProps] = js.undefined
  
  /**
    * Additional properties for customization of select media in mobile devices
    */
  var imageProps: js.UndefOr[ImageProps] = js.undefined
  
  /**
    * max limit of media allowed to be selected in one go, current max limit is 10 set by office lens.
    */
  var maxMediaCount: Double
  
  /**
    * Only one media type can be selected at a time
    */
  var mediaType: MediaType
}
object MediaInputs {
  
  inline def apply(maxMediaCount: Double, mediaType: MediaType): MediaInputs = {
    val __obj = js.Dynamic.literal(maxMediaCount = maxMediaCount.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaInputs] (val x: Self) extends AnyVal {
    
    inline def setAudioProps(value: AudioProps): Self = StObject.set(x, "audioProps", value.asInstanceOf[js.Any])
    
    inline def setAudioPropsUndefined: Self = StObject.set(x, "audioProps", js.undefined)
    
    inline def setImageProps(value: ImageProps): Self = StObject.set(x, "imageProps", value.asInstanceOf[js.Any])
    
    inline def setImagePropsUndefined: Self = StObject.set(x, "imageProps", js.undefined)
    
    inline def setMaxMediaCount(value: Double): Self = StObject.set(x, "maxMediaCount", value.asInstanceOf[js.Any])
    
    inline def setMediaType(value: MediaType): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
  }
}
