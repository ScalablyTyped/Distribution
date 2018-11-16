package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_PromisifyHostnameOptions extends js.Object {
  def `__promisify__`(hostname: java.lang.String): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def `__promisify__`(hostname: java.lang.String, options: nodeLib.dnsMod.ResolveOptions): stdLib.Promise[js.Array[java.lang.String] | js.Array[nodeLib.dnsMod.RecordWithTtl]] = js.native
  def `__promisify__`(hostname: java.lang.String, options: nodeLib.dnsMod.ResolveWithTtlOptions): stdLib.Promise[js.Array[nodeLib.dnsMod.RecordWithTtl]] = js.native
}

