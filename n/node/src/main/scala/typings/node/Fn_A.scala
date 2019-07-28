package typings.node

import typings.node.dnsMod.AnyRecord
import typings.node.dnsMod.MxRecord
import typings.node.dnsMod.NaptrRecord
import typings.node.dnsMod.SoaRecord
import typings.node.dnsMod.SrvRecord
import typings.node.nodeStrings.A
import typings.node.nodeStrings.AAAA
import typings.node.nodeStrings.ANY
import typings.node.nodeStrings.CNAME
import typings.node.nodeStrings.MX
import typings.node.nodeStrings.NAPTR
import typings.node.nodeStrings.NS
import typings.node.nodeStrings.PTR
import typings.node.nodeStrings.SOA
import typings.node.nodeStrings.SRV
import typings.node.nodeStrings.TXT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_A extends js.Object {
  def apply(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(hostname: java.lang.String, rrtype: java.lang.String): js.Promise[
    (js.Array[
      AnyRecord | js.Array[java.lang.String] | MxRecord | NaptrRecord | SrvRecord | java.lang.String
    ]) | SoaRecord
  ] = js.native
  def apply(hostname: java.lang.String, rrtype: A): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(hostname: java.lang.String, rrtype: AAAA): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(hostname: java.lang.String, rrtype: ANY): js.Promise[js.Array[AnyRecord]] = js.native
  def apply(hostname: java.lang.String, rrtype: CNAME): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(hostname: java.lang.String, rrtype: MX): js.Promise[js.Array[MxRecord]] = js.native
  def apply(hostname: java.lang.String, rrtype: NAPTR): js.Promise[js.Array[NaptrRecord]] = js.native
  def apply(hostname: java.lang.String, rrtype: NS): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(hostname: java.lang.String, rrtype: PTR): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(hostname: java.lang.String, rrtype: SOA): js.Promise[SoaRecord] = js.native
  def apply(hostname: java.lang.String, rrtype: SRV): js.Promise[js.Array[SrvRecord]] = js.native
  def apply(hostname: java.lang.String, rrtype: TXT): js.Promise[js.Array[js.Array[java.lang.String]]] = js.native
}

