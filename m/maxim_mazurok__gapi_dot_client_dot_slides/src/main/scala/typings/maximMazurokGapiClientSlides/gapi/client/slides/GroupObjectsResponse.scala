package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupObjectsResponse extends StObject {
  
  /** The object ID of the created group. */
  var objectId: js.UndefOr[String] = js.undefined
}
object GroupObjectsResponse {
  
  inline def apply(): GroupObjectsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupObjectsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GroupObjectsResponse] (val x: Self) extends AnyVal {
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
