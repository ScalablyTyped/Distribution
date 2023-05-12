package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonApplicationjsonsarif extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Resultscount
  
  @JSName("application/json+sarif")
  var applicationSlashjsonPlussignsarif: StringDictionary[Any]
}
object ApplicationjsonApplicationjsonsarif {
  
  inline def apply(applicationSlashjson: Resultscount, applicationSlashjsonPlussignsarif: StringDictionary[Any]): ApplicationjsonApplicationjsonsarif = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.updateDynamic("application/json+sarif")(applicationSlashjsonPlussignsarif.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonApplicationjsonsarif]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonApplicationjsonsarif] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Resultscount): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonPlussignsarif(value: StringDictionary[Any]): Self = StObject.set(x, "application/json+sarif", value.asInstanceOf[js.Any])
  }
}
