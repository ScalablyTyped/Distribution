package typings.mdns.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// --- Browser ---
@js.native
trait BrowserOptions extends js.Object {
  
  var context: js.UndefOr[js.Any] = js.native
  
  var domain: js.UndefOr[js.Any] = js.native
  
  var flags: js.UndefOr[js.Any] = js.native
  
  var interfaceIndex: js.UndefOr[Double] = js.native
  
  var networkInterface: js.UndefOr[String] = js.native
  
  var resolverSequence: js.UndefOr[
    js.Array[js.Function2[/* service */ Service, /* next */ js.Function0[Unit], Boolean]]
  ] = js.native
}
object BrowserOptions {
  
  @scala.inline
  def apply(): BrowserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserOptions]
  }
  
  @scala.inline
  implicit class BrowserOptionsOps[Self <: BrowserOptions] (val x: Self) extends AnyVal {
    
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
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setDomain(value: js.Any): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setFlags(value: js.Any): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
    
    @scala.inline
    def setInterfaceIndex(value: Double): Self = this.set("interfaceIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterfaceIndex: Self = this.set("interfaceIndex", js.undefined)
    
    @scala.inline
    def setNetworkInterface(value: String): Self = this.set("networkInterface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkInterface: Self = this.set("networkInterface", js.undefined)
    
    @scala.inline
    def setResolverSequenceVarargs(value: (js.Function2[/* service */ Service, /* next */ js.Function0[Unit], Boolean])*): Self = this.set("resolverSequence", js.Array(value :_*))
    
    @scala.inline
    def setResolverSequence(value: js.Array[js.Function2[/* service */ Service, /* next */ js.Function0[Unit], Boolean]]): Self = this.set("resolverSequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolverSequence: Self = this.set("resolverSequence", js.undefined)
  }
}
