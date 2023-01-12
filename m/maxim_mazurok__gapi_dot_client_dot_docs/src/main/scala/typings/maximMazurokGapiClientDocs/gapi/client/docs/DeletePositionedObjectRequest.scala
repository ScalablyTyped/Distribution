package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePositionedObjectRequest extends StObject {
  
  /** The ID of the positioned object to delete. */
  var objectId: js.UndefOr[String] = js.undefined
}
object DeletePositionedObjectRequest {
  
  inline def apply(): DeletePositionedObjectRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeletePositionedObjectRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeletePositionedObjectRequest] (val x: Self) extends AnyVal {
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
