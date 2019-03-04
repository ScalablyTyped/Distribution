package typings
package mzLib.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("mz/dns", "lookup")
@js.native
object lookupNs extends js.Object {
  def __promisify__(hostname: java.lang.String): js.Promise[nodeLib.Anon_AddressFamily] = js.native
  def __promisify__(hostname: java.lang.String, options: nodeLib.dnsMod.LookupAllOptions): js.Promise[nodeLib.Anon_Address] = js.native
  def __promisify__(hostname: java.lang.String, options: nodeLib.dnsMod.LookupOneOptions): js.Promise[nodeLib.Anon_AddressFamily] = js.native
  def __promisify__(hostname: java.lang.String, options: nodeLib.dnsMod.LookupOptions): js.Promise[nodeLib.Anon_AddressFamilyArray] = js.native
  def __promisify__(hostname: java.lang.String, options: scala.Double): js.Promise[nodeLib.Anon_AddressFamily] = js.native
}

