package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XCommonMarkerVersionString extends StObject {
  
  var `X-CommonMarker-Version`: String
}
object XCommonMarkerVersionString {
  
  inline def apply(`X-CommonMarker-Version`: String): XCommonMarkerVersionString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("X-CommonMarker-Version")(`X-CommonMarker-Version`.asInstanceOf[js.Any])
    __obj.asInstanceOf[XCommonMarkerVersionString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XCommonMarkerVersionString] (val x: Self) extends AnyVal {
    
    inline def `setX-CommonMarker-Version`(value: String): Self = StObject.set(x, "X-CommonMarker-Version", value.asInstanceOf[js.Any])
  }
}
