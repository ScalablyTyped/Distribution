package typings.openapiTypes.mod.OpenAPIV2

import typings.openapiTypes.openapiTypesStrings.basic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecuritySchemeBasic
  extends StObject
     with SecuritySchemeObjectBase
     with SecuritySchemeObject {
  
  @JSName("type")
  var type_SecuritySchemeBasic: basic
}
object SecuritySchemeBasic {
  
  inline def apply(): SecuritySchemeBasic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("basic")
    __obj.asInstanceOf[SecuritySchemeBasic]
  }
  
  extension [Self <: SecuritySchemeBasic](x: Self) {
    
    inline def setType(value: basic): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
