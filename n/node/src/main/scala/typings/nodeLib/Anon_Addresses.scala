package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Addresses extends js.Object {
  def apply(
    hostname: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* addresses */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def apply(
    hostname: java.lang.String,
    options: nodeLib.dnsMod.ResolveOptions,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* addresses */ js.Array[java.lang.String] | js.Array[nodeLib.dnsMod.RecordWithTtl], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def apply(
    hostname: java.lang.String,
    options: nodeLib.dnsMod.ResolveWithTtlOptions,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* addresses */ js.Array[nodeLib.dnsMod.RecordWithTtl], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def `__promisify__`(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def `__promisify__`(hostname: java.lang.String, options: nodeLib.dnsMod.ResolveOptions): js.Promise[js.Array[java.lang.String] | js.Array[nodeLib.dnsMod.RecordWithTtl]] = js.native
  def `__promisify__`(hostname: java.lang.String, options: nodeLib.dnsMod.ResolveWithTtlOptions): js.Promise[js.Array[nodeLib.dnsMod.RecordWithTtl]] = js.native
}

