package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTTPHeader extends StObject {
  
  /** Cloud Run fully managed: not supported Cloud Run for Anthos: supported The header field name */
  var name: js.UndefOr[String] = js.native
  
  /** Cloud Run fully managed: not supported Cloud Run for Anthos: supported The header field value */
  var value: js.UndefOr[String] = js.native
}
object HTTPHeader {
  
  @scala.inline
  def apply(): HTTPHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTTPHeader]
  }
  
  @scala.inline
  implicit class HTTPHeaderMutableBuilder[Self <: HTTPHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
