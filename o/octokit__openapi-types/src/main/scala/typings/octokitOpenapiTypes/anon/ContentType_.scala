package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentType_ extends StObject {
  
  /** @example 279 */
  var `Content-Length`: js.UndefOr[String] = js.undefined
  
  var `Content-Type`: String
  
  var `X-CommonMarker-Version`: String
}
object ContentType_ {
  
  inline def apply(`Content-Type`: String, `X-CommonMarker-Version`: String): ContentType_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Content-Type")(`Content-Type`.asInstanceOf[js.Any])
    __obj.updateDynamic("X-CommonMarker-Version")(`X-CommonMarker-Version`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentType_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentType_] (val x: Self) extends AnyVal {
    
    inline def `setContent-Length`(value: String): Self = StObject.set(x, "Content-Length", value.asInstanceOf[js.Any])
    
    inline def `setContent-LengthUndefined`: Self = StObject.set(x, "Content-Length", js.undefined)
    
    inline def `setContent-Type`(value: String): Self = StObject.set(x, "Content-Type", value.asInstanceOf[js.Any])
    
    inline def `setX-CommonMarker-Version`(value: String): Self = StObject.set(x, "X-CommonMarker-Version", value.asInstanceOf[js.Any])
  }
}
