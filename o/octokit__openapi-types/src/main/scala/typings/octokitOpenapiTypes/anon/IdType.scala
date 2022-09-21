package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Team
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdType extends StObject {
  
  /**
    * @description The id of the user or team who can review the deployment
    * @example 4532992
    */
  var id: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.User | Team] = js.undefined
}
object IdType {
  
  inline def apply(): IdType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdType]
  }
  
  extension [Self <: IdType](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setType(value: typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.User | Team): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
