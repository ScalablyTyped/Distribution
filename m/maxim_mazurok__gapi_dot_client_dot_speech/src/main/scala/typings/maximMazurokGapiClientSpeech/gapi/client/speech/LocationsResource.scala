package typings.maximMazurokGapiClientSpeech.gapi.client.speech

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationsResource extends StObject {
  
  var customClasses: CustomClassesResource
  
  var phraseSets: PhraseSetsResource
}
object LocationsResource {
  
  inline def apply(customClasses: CustomClassesResource, phraseSets: PhraseSetsResource): LocationsResource = {
    val __obj = js.Dynamic.literal(customClasses = customClasses.asInstanceOf[js.Any], phraseSets = phraseSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationsResource]
  }
  
  extension [Self <: LocationsResource](x: Self) {
    
    inline def setCustomClasses(value: CustomClassesResource): Self = StObject.set(x, "customClasses", value.asInstanceOf[js.Any])
    
    inline def setPhraseSets(value: PhraseSetsResource): Self = StObject.set(x, "phraseSets", value.asInstanceOf[js.Any])
  }
}
