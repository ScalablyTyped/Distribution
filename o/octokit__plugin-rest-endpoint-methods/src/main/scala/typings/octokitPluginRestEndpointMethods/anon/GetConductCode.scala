package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConductCode extends StObject {
  
  var getAllCodesOfConduct: `976`
  
  var getConductCode: `977`
}
object GetConductCode {
  
  inline def apply(getAllCodesOfConduct: `976`, getConductCode: `977`): GetConductCode = {
    val __obj = js.Dynamic.literal(getAllCodesOfConduct = getAllCodesOfConduct.asInstanceOf[js.Any], getConductCode = getConductCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConductCode]
  }
  
  extension [Self <: GetConductCode](x: Self) {
    
    inline def setGetAllCodesOfConduct(value: `976`): Self = StObject.set(x, "getAllCodesOfConduct", value.asInstanceOf[js.Any])
    
    inline def setGetConductCode(value: `977`): Self = StObject.set(x, "getConductCode", value.asInstanceOf[js.Any])
  }
}
