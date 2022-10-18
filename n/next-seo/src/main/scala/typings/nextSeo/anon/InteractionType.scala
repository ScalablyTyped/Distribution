package typings.nextSeo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractionType extends StObject {
  
  var `@type`: String
  
  var interactionType: String
  
  var userInteractionCount: Double
}
object InteractionType {
  
  inline def apply(`@type`: String, interactionType: String, userInteractionCount: Double): InteractionType = {
    val __obj = js.Dynamic.literal(interactionType = interactionType.asInstanceOf[js.Any], userInteractionCount = userInteractionCount.asInstanceOf[js.Any])
    __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionType]
  }
  
  extension [Self <: InteractionType](x: Self) {
    
    inline def `set@type`(value: String): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
    
    inline def setInteractionType(value: String): Self = StObject.set(x, "interactionType", value.asInstanceOf[js.Any])
    
    inline def setUserInteractionCount(value: Double): Self = StObject.set(x, "userInteractionCount", value.asInstanceOf[js.Any])
  }
}
