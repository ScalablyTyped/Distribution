package typings.pacResolver

import typings.pacResolver.mod.FindProxyForURLCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(url: String): js.Promise[String] = js.native
    def apply(url: String, callback: FindProxyForURLCallback): Unit = js.native
    def apply(url: String, host: String): js.Promise[String] = js.native
    def apply(url: String, host: String, callback: FindProxyForURLCallback): Unit = js.native
  }
}
