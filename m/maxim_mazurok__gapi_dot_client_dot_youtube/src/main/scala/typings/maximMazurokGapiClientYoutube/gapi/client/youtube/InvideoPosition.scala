package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvideoPosition extends StObject {
  
  /** Describes in which corner of the video the visual widget will appear. */
  var cornerPosition: js.UndefOr[String] = js.undefined
  
  /** Defines the position type. */
  var `type`: js.UndefOr[String] = js.undefined
}
object InvideoPosition {
  
  inline def apply(): InvideoPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvideoPosition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InvideoPosition] (val x: Self) extends AnyVal {
    
    inline def setCornerPosition(value: String): Self = StObject.set(x, "cornerPosition", value.asInstanceOf[js.Any])
    
    inline def setCornerPositionUndefined: Self = StObject.set(x, "cornerPosition", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
