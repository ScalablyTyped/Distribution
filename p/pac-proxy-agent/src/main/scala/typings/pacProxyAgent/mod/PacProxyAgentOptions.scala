package typings.pacProxyAgent.mod

import typings.degenerator.mod.CompileOptions
import typings.httpProxyAgent.mod.BaseHttpProxyAgentOptions
import typings.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.socksProxyAgent.mod.BaseSocksProxyAgentOptions because var conflicts: host, port. Inlined 
- typings.httpsProxyAgent.mod.BaseHttpsProxyAgentOptions because var conflicts: host, path, port, secureProxy. Inlined headers
- typings.agentBase.mod.AgentOptions because var conflicts: timeout. Inlined  */ @js.native
trait PacProxyAgentOptions
  extends CompileOptions
     with BaseHttpProxyAgentOptions {
  
  var fallbackToDirect: js.UndefOr[Boolean] = js.native
  
  var headers: js.UndefOr[OutgoingHttpHeaders] = js.native
  
  var uri: js.UndefOr[String] = js.native
}
object PacProxyAgentOptions {
  
  @scala.inline
  def apply(): PacProxyAgentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PacProxyAgentOptions]
  }
  
  @scala.inline
  implicit class PacProxyAgentOptionsOps[Self <: PacProxyAgentOptions] (val x: Self) extends AnyVal {
    
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
    def setFallbackToDirect(value: Boolean): Self = this.set("fallbackToDirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackToDirect: Self = this.set("fallbackToDirect", js.undefined)
    
    @scala.inline
    def setHeaders(value: OutgoingHttpHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
}
