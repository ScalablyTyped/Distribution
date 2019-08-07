package typings.node.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("dns", "lookup")
@js.native
object lookupNs extends js.Object {
  def __promisify__(hostname: java.lang.String): js.Promise[LookupAddress] = js.native
  def __promisify__(hostname: java.lang.String, options: Double): js.Promise[LookupAddress] = js.native
  def __promisify__(hostname: java.lang.String, options: LookupAllOptions): js.Promise[js.Array[LookupAddress]] = js.native
  def __promisify__(hostname: java.lang.String, options: LookupOneOptions): js.Promise[LookupAddress] = js.native
  def __promisify__(hostname: java.lang.String, options: LookupOptions): js.Promise[LookupAddress | js.Array[LookupAddress]] = js.native
}

