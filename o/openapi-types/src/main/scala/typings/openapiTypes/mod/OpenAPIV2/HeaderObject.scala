package typings.openapiTypes.mod.OpenAPIV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeaderObject
  extends StObject
     with ItemsObject {
  
  var description: js.UndefOr[String] = js.undefined
}
object HeaderObject {
  
  inline def apply(`type`: String): HeaderObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeaderObject] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
