package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjsonsarif extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Deletable
  
  @JSName("application/json+sarif")
  var applicationSlashjsonPlussignsarif: StringDictionary[Any]
}
object Applicationjsonsarif {
  
  inline def apply(applicationSlashjson: Deletable, applicationSlashjsonPlussignsarif: StringDictionary[Any]): Applicationjsonsarif = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.updateDynamic("application/json+sarif")(applicationSlashjsonPlussignsarif.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjsonsarif]
  }
  
  extension [Self <: Applicationjsonsarif](x: Self) {
    
    inline def setApplicationSlashjson(value: Deletable): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonPlussignsarif(value: StringDictionary[Any]): Self = StObject.set(x, "application/json+sarif", value.asInstanceOf[js.Any])
  }
}
