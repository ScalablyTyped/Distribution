package typings
package nodeLib.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("dns", "resolve6")
@js.native
object resolve6Ns extends js.Object {
  def `__promisify__`(hostname: java.lang.String): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def `__promisify__`(hostname: java.lang.String, options: nodeLib.dnsMod.ResolveOptions): stdLib.Promise[js.Array[java.lang.String] | js.Array[nodeLib.dnsMod.RecordWithTtl]] = js.native
  def `__promisify__`(hostname: java.lang.String, options: nodeLib.dnsMod.ResolveWithTtlOptions): stdLib.Promise[js.Array[nodeLib.dnsMod.RecordWithTtl]] = js.native
}

