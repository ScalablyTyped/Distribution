package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Windows10NetworkProxyServer extends StObject {
  
  // Address to the proxy server. Specify an address in the format &amp;lt;server&amp;gt;[:&amp;lt;port&amp;gt;]
  var address: js.UndefOr[String] = js.native
  
  /**
    * Addresses that should not use the proxy server. The system will not use the proxy server for addresses beginning with
    * what is specified in this node.
    */
  var exceptions: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  // Specifies whether the proxy server should be used for local (intranet) addresses.
  var useForLocalAddresses: js.UndefOr[Boolean] = js.native
}
object Windows10NetworkProxyServer {
  
  @scala.inline
  def apply(): Windows10NetworkProxyServer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Windows10NetworkProxyServer]
  }
  
  @scala.inline
  implicit class Windows10NetworkProxyServerMutableBuilder[Self <: Windows10NetworkProxyServer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setExceptions(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "exceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptionsNull: Self = StObject.set(x, "exceptions", null)
    
    @scala.inline
    def setExceptionsUndefined: Self = StObject.set(x, "exceptions", js.undefined)
    
    @scala.inline
    def setExceptionsVarargs(value: String*): Self = StObject.set(x, "exceptions", js.Array(value :_*))
    
    @scala.inline
    def setUseForLocalAddresses(value: Boolean): Self = StObject.set(x, "useForLocalAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseForLocalAddressesUndefined: Self = StObject.set(x, "useForLocalAddresses", js.undefined)
  }
}
