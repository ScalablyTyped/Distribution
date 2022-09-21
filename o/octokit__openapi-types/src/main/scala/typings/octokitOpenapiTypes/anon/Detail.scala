package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Detail extends StObject {
  
  var detail: js.UndefOr[String | Null] = js.undefined
  
  var documentation_url: js.UndefOr[String | Null] = js.undefined
  
  var message: js.UndefOr[String | Null] = js.undefined
  
  var schemas: js.UndefOr[js.Array[String]] = js.undefined
  
  var scimType: js.UndefOr[String | Null] = js.undefined
  
  var status: js.UndefOr[Double] = js.undefined
}
object Detail {
  
  inline def apply(): Detail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Detail]
  }
  
  extension [Self <: Detail](x: Self) {
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailNull: Self = StObject.set(x, "detail", null)
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setDocumentation_url(value: String): Self = StObject.set(x, "documentation_url", value.asInstanceOf[js.Any])
    
    inline def setDocumentation_urlNull: Self = StObject.set(x, "documentation_url", null)
    
    inline def setDocumentation_urlUndefined: Self = StObject.set(x, "documentation_url", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setSchemas(value: js.Array[String]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
    
    inline def setSchemasVarargs(value: String*): Self = StObject.set(x, "schemas", js.Array(value*))
    
    inline def setScimType(value: String): Self = StObject.set(x, "scimType", value.asInstanceOf[js.Any])
    
    inline def setScimTypeNull: Self = StObject.set(x, "scimType", null)
    
    inline def setScimTypeUndefined: Self = StObject.set(x, "scimType", js.undefined)
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
