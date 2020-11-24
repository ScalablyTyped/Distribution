package typings.pacResolver

import typings.pacResolver.mod.FindProxyForURLCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait FnCall extends js.Object {
    
    def apply(url: String): js.Promise[String] = js.native
    def apply(url: String, callback: FindProxyForURLCallback): Unit = js.native
    def apply(url: String, host: String): js.Promise[String] = js.native
    def apply(url: String, host: String, callback: FindProxyForURLCallback): Unit = js.native
  }
}
