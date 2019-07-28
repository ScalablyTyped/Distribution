package typings.node.dnsMod

import typings.node.Anon_Address
import typings.node.Anon_AddressFamily
import typings.node.Anon_AddressFamilyArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("dns", "lookup")
@js.native
object lookupNs extends js.Object {
  def __promisify__(hostname: java.lang.String): js.Promise[Anon_AddressFamily] = js.native
  def __promisify__(hostname: java.lang.String, options: Double): js.Promise[Anon_AddressFamily] = js.native
  def __promisify__(hostname: java.lang.String, options: LookupAllOptions): js.Promise[Anon_Address] = js.native
  def __promisify__(hostname: java.lang.String, options: LookupOneOptions): js.Promise[Anon_AddressFamily] = js.native
  def __promisify__(hostname: java.lang.String, options: LookupOptions): js.Promise[Anon_AddressFamilyArray] = js.native
}

