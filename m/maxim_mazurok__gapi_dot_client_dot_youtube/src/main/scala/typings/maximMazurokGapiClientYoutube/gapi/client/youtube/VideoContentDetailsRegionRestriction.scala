package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoContentDetailsRegionRestriction extends StObject {
  
  /**
    * A list of region codes that identify countries where the video is viewable. If this property is present and a country is not listed in its value, then the video is blocked from
    * appearing in that country. If this property is present and contains an empty list, the video is blocked in all countries.
    */
  var allowed: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A list of region codes that identify countries where the video is blocked. If this property is present and a country is not listed in its value, then the video is viewable in that
    * country. If this property is present and contains an empty list, the video is viewable in all countries.
    */
  var blocked: js.UndefOr[js.Array[String]] = js.undefined
}
object VideoContentDetailsRegionRestriction {
  
  inline def apply(): VideoContentDetailsRegionRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoContentDetailsRegionRestriction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoContentDetailsRegionRestriction] (val x: Self) extends AnyVal {
    
    inline def setAllowed(value: js.Array[String]): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
    
    inline def setAllowedUndefined: Self = StObject.set(x, "allowed", js.undefined)
    
    inline def setAllowedVarargs(value: String*): Self = StObject.set(x, "allowed", js.Array(value*))
    
    inline def setBlocked(value: js.Array[String]): Self = StObject.set(x, "blocked", value.asInstanceOf[js.Any])
    
    inline def setBlockedUndefined: Self = StObject.set(x, "blocked", js.undefined)
    
    inline def setBlockedVarargs(value: String*): Self = StObject.set(x, "blocked", js.Array(value*))
  }
}
