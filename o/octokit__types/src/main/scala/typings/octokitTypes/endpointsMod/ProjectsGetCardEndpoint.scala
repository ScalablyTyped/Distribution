package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.inertia
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsGetCardEndpoint
  extends StObject
     with RequiredPreview[inertia] {
  
  var card_id: Double
}
object ProjectsGetCardEndpoint {
  
  inline def apply(card_id: Double, mediaType: `0`[inertia]): ProjectsGetCardEndpoint = {
    val __obj = js.Dynamic.literal(card_id = card_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsGetCardEndpoint]
  }
  
  extension [Self <: ProjectsGetCardEndpoint](x: Self) {
    
    inline def setCard_id(value: Double): Self = StObject.set(x, "card_id", value.asInstanceOf[js.Any])
  }
}
