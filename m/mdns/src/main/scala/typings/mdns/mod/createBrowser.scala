package typings.mdns.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mdns", "createBrowser")
@js.native
object createBrowser extends js.Object {
  
  def apply(serviceType: ServiceType): Browser = js.native
  def apply(serviceType: ServiceType, options: BrowserOptions): Browser = js.native
}
