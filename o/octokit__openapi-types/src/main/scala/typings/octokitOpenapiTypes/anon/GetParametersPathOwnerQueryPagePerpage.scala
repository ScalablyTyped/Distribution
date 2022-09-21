package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathOwnerQueryPagePerpage extends StObject {
  
  var get: ParametersPathOwnerQueryPagePerpage
  
  var put: RequestBodyContentApplicationjsonNames
}
object GetParametersPathOwnerQueryPagePerpage {
  
  inline def apply(get: ParametersPathOwnerQueryPagePerpage, put: RequestBodyContentApplicationjsonNames): GetParametersPathOwnerQueryPagePerpage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathOwnerQueryPagePerpage]
  }
  
  extension [Self <: GetParametersPathOwnerQueryPagePerpage](x: Self) {
    
    inline def setGet(value: ParametersPathOwnerQueryPagePerpage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: RequestBodyContentApplicationjsonNames): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
