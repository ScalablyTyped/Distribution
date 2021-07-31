package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTableResponse extends StObject {
  
  /** The object ID of the created table. */
  var objectId: js.UndefOr[String] = js.undefined
}
object CreateTableResponse {
  
  @scala.inline
  def apply(): CreateTableResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTableResponse]
  }
  
  @scala.inline
  implicit class CreateTableResponseMutableBuilder[Self <: CreateTableResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
