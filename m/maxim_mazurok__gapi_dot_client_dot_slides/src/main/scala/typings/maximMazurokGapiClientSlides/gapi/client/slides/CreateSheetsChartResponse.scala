package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSheetsChartResponse extends StObject {
  
  /** The object ID of the created chart. */
  var objectId: js.UndefOr[String] = js.native
}
object CreateSheetsChartResponse {
  
  @scala.inline
  def apply(): CreateSheetsChartResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSheetsChartResponse]
  }
  
  @scala.inline
  implicit class CreateSheetsChartResponseMutableBuilder[Self <: CreateSheetsChartResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
