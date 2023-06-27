package typings.openui5.sapUiModelOdataOdatametamodelMod

import typings.openui5.openui5Strings.GET
import typings.openui5.openui5Strings.POST
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionImport
  extends StObject
     with Annotatable {
  
  /**
    * The entity set of the function import's return value
    */
  var entitySet: js.UndefOr[String] = js.undefined
  
  /**
    * The http method to execute the function import
    */
  var httpMethod: js.UndefOr[GET | POST] = js.undefined
  
  /**
    * The function import's name
    */
  var name: String
  
  /**
    * The function import parameters
    */
  var parameter: js.UndefOr[js.Array[FunctionImportParameter]] = js.undefined
  
  /**
    * The qualified name of the function import's return type; the value is identical to the corresponding
    * XML attribute value in the service metadata document.
    */
  var returnType: js.UndefOr[String] = js.undefined
}
object FunctionImport {
  
  inline def apply(name: String): FunctionImport = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionImport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FunctionImport] (val x: Self) extends AnyVal {
    
    inline def setEntitySet(value: String): Self = StObject.set(x, "entitySet", value.asInstanceOf[js.Any])
    
    inline def setEntitySetUndefined: Self = StObject.set(x, "entitySet", js.undefined)
    
    inline def setHttpMethod(value: GET | POST): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
    
    inline def setHttpMethodUndefined: Self = StObject.set(x, "httpMethod", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParameter(value: js.Array[FunctionImportParameter]): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    inline def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
    
    inline def setParameterVarargs(value: FunctionImportParameter*): Self = StObject.set(x, "parameter", js.Array(value*))
    
    inline def setReturnType(value: String): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    inline def setReturnTypeUndefined: Self = StObject.set(x, "returnType", js.undefined)
  }
}
