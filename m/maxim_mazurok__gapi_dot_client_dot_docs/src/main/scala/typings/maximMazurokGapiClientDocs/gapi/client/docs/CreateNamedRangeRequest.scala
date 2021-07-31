package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNamedRangeRequest extends StObject {
  
  /** The name of the NamedRange. Names do not need to be unique. Names must be at least 1 character and no more than 256 characters, measured in UTF-16 code units. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The range to apply the name to. */
  var range: js.UndefOr[Range] = js.undefined
}
object CreateNamedRangeRequest {
  
  @scala.inline
  def apply(): CreateNamedRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNamedRangeRequest]
  }
  
  @scala.inline
  implicit class CreateNamedRangeRequestMutableBuilder[Self <: CreateNamedRangeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
