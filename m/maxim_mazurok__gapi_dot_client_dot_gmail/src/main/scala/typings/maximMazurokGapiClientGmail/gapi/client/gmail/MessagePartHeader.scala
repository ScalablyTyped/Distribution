package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagePartHeader extends StObject {
  
  /** The name of the header before the `:` separator. For example, `To`. */
  var name: js.UndefOr[String] = js.native
  
  /** The value of the header after the `:` separator. For example, `someuser@example.com`. */
  var value: js.UndefOr[String] = js.native
}
object MessagePartHeader {
  
  @scala.inline
  def apply(): MessagePartHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagePartHeader]
  }
  
  @scala.inline
  implicit class MessagePartHeaderMutableBuilder[Self <: MessagePartHeader] (val x: Self) extends AnyVal {
    
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
