package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFooterResponse extends StObject {
  
  /** The ID of the created footer. */
  var footerId: js.UndefOr[String] = js.undefined
}
object CreateFooterResponse {
  
  @scala.inline
  def apply(): CreateFooterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFooterResponse]
  }
  
  @scala.inline
  implicit class CreateFooterResponseMutableBuilder[Self <: CreateFooterResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFooterId(value: String): Self = StObject.set(x, "footerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterIdUndefined: Self = StObject.set(x, "footerId", js.undefined)
  }
}
