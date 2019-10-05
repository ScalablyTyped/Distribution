package typings.mdns.mdnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mdns", "createBrowser")
@js.native
object createBrowser extends js.Object {
  def apply(serviceType: ServiceType): Browser = js.native
  def apply(serviceType: ServiceType, options: BrowserOptions): Browser = js.native
}

