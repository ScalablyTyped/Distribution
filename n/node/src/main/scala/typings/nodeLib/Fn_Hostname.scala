package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Hostname extends js.Object {
  def apply(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(hostname: java.lang.String, options: nodeLib.dnsMod.ResolveOptions): js.Promise[js.Array[nodeLib.dnsMod.RecordWithTtl | java.lang.String]] = js.native
  def apply(hostname: java.lang.String, options: nodeLib.dnsMod.ResolveWithTtlOptions): js.Promise[js.Array[nodeLib.dnsMod.RecordWithTtl]] = js.native
}

