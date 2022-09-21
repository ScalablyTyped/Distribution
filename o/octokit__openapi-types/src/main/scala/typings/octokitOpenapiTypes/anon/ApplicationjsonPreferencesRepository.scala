package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonPreferencesRepository extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: PreferencesRepository
}
object ApplicationjsonPreferencesRepository {
  
  inline def apply(applicationSlashjson: PreferencesRepository): ApplicationjsonPreferencesRepository = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonPreferencesRepository]
  }
  
  extension [Self <: ApplicationjsonPreferencesRepository](x: Self) {
    
    inline def setApplicationSlashjson(value: PreferencesRepository): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
