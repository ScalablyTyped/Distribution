package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `217` extends StObject {
  
  /**
    * @description Body of the project
    * @example This project represents the sprint of the first week in January
    */
  var body: js.UndefOr[String | Null] = js.undefined
  
  /**
    * @description Name of the project
    * @example Week One Sprint
    */
  var name: String
}
object `217` {
  
  inline def apply(name: String): `217` = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`217`]
  }
  
  extension [Self <: `217`](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
