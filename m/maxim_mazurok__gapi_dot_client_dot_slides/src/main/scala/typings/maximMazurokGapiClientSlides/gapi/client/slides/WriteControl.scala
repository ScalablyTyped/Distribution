package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WriteControl extends StObject {
  
  /**
    * The revision ID of the presentation required for the write request. If specified and the `required_revision_id` doesn't exactly match the presentation's current `revision_id`, the
    * request will not be processed and will return a 400 bad request error.
    */
  var requiredRevisionId: js.UndefOr[String] = js.native
}
object WriteControl {
  
  @scala.inline
  def apply(): WriteControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteControl]
  }
  
  @scala.inline
  implicit class WriteControlMutableBuilder[Self <: WriteControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequiredRevisionId(value: String): Self = StObject.set(x, "requiredRevisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredRevisionIdUndefined: Self = StObject.set(x, "requiredRevisionId", js.undefined)
  }
}
