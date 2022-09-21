package typings.microsoftteams.microsoftTeams.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Input for view images API
  */
// tslint:disable-next-line:interface-name
trait ImageUri extends StObject {
  
  var `type`: ImageUriType
  
  var value: String
}
object ImageUri {
  
  inline def apply(`type`: ImageUriType, value: String): ImageUri = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageUri]
  }
  
  extension [Self <: ImageUri](x: Self) {
    
    inline def setType(value: ImageUriType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
