package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConductCode extends StObject {
  
  var getAllCodesOfConduct: `1022`
  
  var getConductCode: `1023`
}
object GetConductCode {
  
  inline def apply(getAllCodesOfConduct: `1022`, getConductCode: `1023`): GetConductCode = {
    val __obj = js.Dynamic.literal(getAllCodesOfConduct = getAllCodesOfConduct.asInstanceOf[js.Any], getConductCode = getConductCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConductCode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetConductCode] (val x: Self) extends AnyVal {
    
    inline def setGetAllCodesOfConduct(value: `1022`): Self = StObject.set(x, "getAllCodesOfConduct", value.asInstanceOf[js.Any])
    
    inline def setGetConductCode(value: `1023`): Self = StObject.set(x, "getConductCode", value.asInstanceOf[js.Any])
  }
}
