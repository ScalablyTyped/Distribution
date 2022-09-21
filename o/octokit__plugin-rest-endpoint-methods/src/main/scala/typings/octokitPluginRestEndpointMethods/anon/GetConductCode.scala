package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConductCode extends StObject {
  
  var getAllCodesOfConduct: `960`
  
  var getConductCode: `961`
}
object GetConductCode {
  
  inline def apply(getAllCodesOfConduct: `960`, getConductCode: `961`): GetConductCode = {
    val __obj = js.Dynamic.literal(getAllCodesOfConduct = getAllCodesOfConduct.asInstanceOf[js.Any], getConductCode = getConductCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConductCode]
  }
  
  extension [Self <: GetConductCode](x: Self) {
    
    inline def setGetAllCodesOfConduct(value: `960`): Self = StObject.set(x, "getAllCodesOfConduct", value.asInstanceOf[js.Any])
    
    inline def setGetConductCode(value: `961`): Self = StObject.set(x, "getConductCode", value.asInstanceOf[js.Any])
  }
}
