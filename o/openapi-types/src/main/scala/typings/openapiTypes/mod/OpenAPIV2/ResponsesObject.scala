package typings.openapiTypes.mod.OpenAPIV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponsesObject
  extends /* index */ StringDictionary[Response | js.Any] {
  
  var default: js.UndefOr[Response] = js.native
}
object ResponsesObject {
  
  @scala.inline
  def apply(): ResponsesObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponsesObject]
  }
  
  @scala.inline
  implicit class ResponsesObjectMutableBuilder[Self <: ResponsesObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: Response): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
  }
}
