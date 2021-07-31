package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DuplicateObjectResponse extends StObject {
  
  /** The ID of the new duplicate object. */
  var objectId: js.UndefOr[String] = js.undefined
}
object DuplicateObjectResponse {
  
  @scala.inline
  def apply(): DuplicateObjectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DuplicateObjectResponse]
  }
  
  @scala.inline
  implicit class DuplicateObjectResponseMutableBuilder[Self <: DuplicateObjectResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
