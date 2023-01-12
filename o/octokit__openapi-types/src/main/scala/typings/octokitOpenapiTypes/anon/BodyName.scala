package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyName extends StObject {
  
  /** @description The description of the project. */
  var body: js.UndefOr[String] = js.undefined
  
  /** @description The name of the project. */
  var name: String
}
object BodyName {
  
  inline def apply(name: String): BodyName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BodyName] (val x: Self) extends AnyVal {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
