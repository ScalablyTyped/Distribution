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
  
  inline def apply(): MediaInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaInfo] (val x: Self) extends AnyVal {
    
    inline def setResourceId(value: NullableOption[String]): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdNull: Self = StObject.set(x, "resourceId", null)
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
