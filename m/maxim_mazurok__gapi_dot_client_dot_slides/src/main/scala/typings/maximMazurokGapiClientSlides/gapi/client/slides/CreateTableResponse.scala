package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTableResponse extends StObject {
  
  /** The object ID of the created table. */
  var objectId: js.UndefOr[String] = js.undefined
}
object CreateTableResponse {
  
  inline def apply(): CreateTableResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTableResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateTableResponse] (val x: Self) extends AnyVal {
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
