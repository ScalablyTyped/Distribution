package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_A extends js.Object {
  def apply(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(hostname: java.lang.String, rrtype: java.lang.String): js.Promise[
    (js.Array[
      nodeLib.dnsMod.AnyRecord | js.Array[java.lang.String] | nodeLib.dnsMod.MxRecord | nodeLib.dnsMod.NaptrRecord | nodeLib.dnsMod.SrvRecord | java.lang.String
    ]) | nodeLib.dnsMod.SoaRecord
  ] = js.native
  def apply(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.A): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.AAAA): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.ANY): js.Promise[js.Array[nodeLib.dnsMod.AnyRecord]] = js.native
  def apply(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.CNAME): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.MX): js.Promise[js.Array[nodeLib.dnsMod.MxRecord]] = js.native
  def apply(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.NAPTR): js.Promise[js.Array[nodeLib.dnsMod.NaptrRecord]] = js.native
  def apply(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.NS): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.PTR): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.SOA): js.Promise[nodeLib.dnsMod.SoaRecord] = js.native
  def apply(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.SRV): js.Promise[js.Array[nodeLib.dnsMod.SrvRecord]] = js.native
  def apply(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.TXT): js.Promise[js.Array[js.Array[java.lang.String]]] = js.native
}

