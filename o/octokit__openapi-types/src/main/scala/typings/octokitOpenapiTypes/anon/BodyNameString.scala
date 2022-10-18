package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyNameString extends StObject {
  
  /** @description The description of the project. */
  var body: js.UndefOr[String] = js.undefined
  
  /** @description The name of the project. */
  var name: String
}
object BodyNameString {
  
  inline def apply(name: String): BodyNameString = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyNameString]
  }
  
  extension [Self <: BodyNameString](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
