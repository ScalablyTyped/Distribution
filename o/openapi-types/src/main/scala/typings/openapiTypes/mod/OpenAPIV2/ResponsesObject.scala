package typings.openapiTypes.mod.OpenAPIV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponsesObject
  extends StObject
     with /* index */ StringDictionary[js.UndefOr[Response]] {
  
  var default: js.UndefOr[Response] = js.undefined
}
object ResponsesObject {
  
  inline def apply(): ResponsesObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponsesObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponsesObject] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: Response): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
  }
}
