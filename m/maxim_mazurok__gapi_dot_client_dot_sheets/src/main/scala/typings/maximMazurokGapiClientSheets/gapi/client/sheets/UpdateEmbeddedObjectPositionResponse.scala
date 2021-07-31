package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEmbeddedObjectPositionResponse extends StObject {
  
  /** The new position of the embedded object. */
  var position: js.UndefOr[EmbeddedObjectPosition] = js.undefined
}
object UpdateEmbeddedObjectPositionResponse {
  
  @scala.inline
  def apply(): UpdateEmbeddedObjectPositionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEmbeddedObjectPositionResponse]
  }
  
  @scala.inline
  implicit class UpdateEmbeddedObjectPositionResponseMutableBuilder[Self <: UpdateEmbeddedObjectPositionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: EmbeddedObjectPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
