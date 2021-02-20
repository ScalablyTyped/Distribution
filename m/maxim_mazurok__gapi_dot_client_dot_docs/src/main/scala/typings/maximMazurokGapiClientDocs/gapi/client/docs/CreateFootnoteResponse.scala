package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateFootnoteResponse extends StObject {
  
  /** The ID of the created footnote. */
  var footnoteId: js.UndefOr[String] = js.native
}
object CreateFootnoteResponse {
  
  @scala.inline
  def apply(): CreateFootnoteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFootnoteResponse]
  }
  
  @scala.inline
  implicit class CreateFootnoteResponseMutableBuilder[Self <: CreateFootnoteResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFootnoteId(value: String): Self = StObject.set(x, "footnoteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnoteIdUndefined: Self = StObject.set(x, "footnoteId", js.undefined)
  }
}
