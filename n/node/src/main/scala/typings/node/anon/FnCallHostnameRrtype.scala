package typings.node.anon

import typings.node.dnsMod.AnyRecord
import typings.node.dnsMod.CaaRecord
import typings.node.dnsMod.MxRecord
import typings.node.dnsMod.NaptrRecord
import typings.node.dnsMod.SoaRecord
import typings.node.dnsMod.SrvRecord
import typings.node.nodeStrings.A
import typings.node.nodeStrings.AAAA
import typings.node.nodeStrings.ANY
import typings.node.nodeStrings.CAA
import typings.node.nodeStrings.CNAME
import typings.node.nodeStrings.MX
import typings.node.nodeStrings.NAPTR
import typings.node.nodeStrings.NS
import typings.node.nodeStrings.PTR
import typings.node.nodeStrings.SOA
import typings.node.nodeStrings.SRV
import typings.node.nodeStrings.TXT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallHostnameRrtype extends StObject {
  
  def apply(hostname: String): js.Promise[js.Array[String]] = js.native
  def apply(hostname: String, rrtype: String): js.Promise[
    (js.Array[AnyRecord | js.Array[String] | MxRecord | NaptrRecord | SrvRecord | String]) | SoaRecord
  ] = js.native
  def apply(hostname: String, rrtype: A): js.Promise[js.Array[String]] = js.native
  def apply(hostname: String, rrtype: AAAA): js.Promise[js.Array[String]] = js.native
  def apply(hostname: String, rrtype: ANY): js.Promise[js.Array[AnyRecord]] = js.native
  def apply(hostname: String, rrtype: CAA): js.Promise[js.Array[CaaRecord]] = js.native
  def apply(hostname: String, rrtype: CNAME): js.Promise[js.Array[String]] = js.native
  def apply(hostname: String, rrtype: MX): js.Promise[js.Array[MxRecord]] = js.native
  def apply(hostname: String, rrtype: NAPTR): js.Promise[js.Array[NaptrRecord]] = js.native
  def apply(hostname: String, rrtype: NS): js.Promise[js.Array[String]] = js.native
  def apply(hostname: String, rrtype: PTR): js.Promise[js.Array[String]] = js.native
  def apply(hostname: String, rrtype: SOA): js.Promise[SoaRecord] = js.native
  def apply(hostname: String, rrtype: SRV): js.Promise[js.Array[SrvRecord]] = js.native
  def apply(hostname: String, rrtype: TXT): js.Promise[js.Array[js.Array[String]]] = js.native
}
