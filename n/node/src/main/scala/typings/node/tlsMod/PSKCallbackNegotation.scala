package typings.node.tlsMod

import typings.node.NodeJS.TypedArray
import typings.std.DataView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PSKCallbackNegotation extends StObject {
  
  var identitty: String = js.native
  
  var psk: DataView | TypedArray = js.native
}
object PSKCallbackNegotation {
  
  @scala.inline
  def apply(identitty: String, psk: DataView | TypedArray): PSKCallbackNegotation = {
    val __obj = js.Dynamic.literal(identitty = identitty.asInstanceOf[js.Any], psk = psk.asInstanceOf[js.Any])
    __obj.asInstanceOf[PSKCallbackNegotation]
  }
  
  @scala.inline
  implicit class PSKCallbackNegotationMutableBuilder[Self <: PSKCallbackNegotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentitty(value: String): Self = StObject.set(x, "identitty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPsk(value: DataView | TypedArray): Self = StObject.set(x, "psk", value.asInstanceOf[js.Any])
  }
}
