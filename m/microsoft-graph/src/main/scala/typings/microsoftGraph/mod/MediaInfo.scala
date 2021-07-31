package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaInfo extends StObject {
  
  /**
    * Optional. Used to uniquely identity the resource. If passed in, the prompt uri will be cached against this resourceId
    * as a key.
    */
  var resourceId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Path to the prompt that will be played. Currently supports only Wave file (.wav) format, single-channel, 16-bit samples
    * with a 16,000 (16KHz) sampling rate.
    */
  var uri: js.UndefOr[String] = js.undefined
}
object MediaInfo {
  
  @scala.inline
  def apply(): MediaInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaInfo]
  }
  
  @scala.inline
  implicit class MediaInfoMutableBuilder[Self <: MediaInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceId(value: NullableOption[String]): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdNull: Self = StObject.set(x, "resourceId", null)
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
