package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Windows10NetworkProxyServer extends js.Object {
  
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
  implicit class Windows10NetworkProxyServerOps[Self <: Windows10NetworkProxyServer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setExceptionsVarargs(value: String*): Self = this.set("exceptions", js.Array(value :_*))
    
    @scala.inline
    def setExceptions(value: NullableOption[js.Array[String]]): Self = this.set("exceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExceptions: Self = this.set("exceptions", js.undefined)
    
    @scala.inline
    def setExceptionsNull: Self = this.set("exceptions", null)
    
    @scala.inline
    def setUseForLocalAddresses(value: Boolean): Self = this.set("useForLocalAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseForLocalAddresses: Self = this.set("useForLocalAddresses", js.undefined)
  }
}
