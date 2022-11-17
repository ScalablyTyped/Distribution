package typings.node.anon

import typings.node.dnsMod.AnyRecord
import typings.node.dnsMod.CaaRecord
import typings.node.dnsMod.MxRecord
import typings.node.dnsMod.NaptrRecord
import typings.node.dnsMod.SoaRecord
import typings.node.dnsMod.SrvRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallHostnameRrtype extends StObject {
  
  def apply(hostname: String): js.Promise[js.Array[String]] = js.native
  @JSName("<apply>")
  @scala.annotation.targetName("apply_SRV")
  def apply(hostname: String, rrtype: "SRV"): js.Promise[js.Array[SrvRecord]] = js.native
  @JSName("<apply>")
  @scala.annotation.targetName("apply_PTR")
  def apply(hostname: String, rrtype: "PTR"): js.Promise[js.Array[String]] = js.native
  @JSName("<apply>")
  @scala.annotation.targetName("apply_MX")
  def apply(hostname: String, rrtype: "MX"): js.Promise[js.Array[MxRecord]] = js.native
  @JSName("<apply>")
  @scala.annotation.targetName("apply_SOA")
  def apply(hostname: String, rrtype: "SOA"): js.Promise[SoaRecord] = js.native
  @JSName("<apply>")
  @scala.annotation.targetName("apply_A")
  def apply(hostname: String, rrtype: "A"): js.Promise[js.Array[String]] = js.native
  @JSName("<apply>")
  @scala.annotation.targetName("apply_CAA")
  def apply(hostname: String, rrtype: "CAA"): js.Promise[js.Array[CaaRecord]] = js.native
  @JSName("<apply>")
  @scala.annotation.targetName("apply_CNAME")
  def apply(hostname: String, rrtype: "CNAME"): js.Promise[js.Array[String]] = js.native
  @JSName("<apply>")
  @scala.annotation.targetName("apply_ANY")
  def apply(hostname: String, rrtype: "ANY"): js.Promise[js.Array[AnyRecord]] = js.native
  @JSName("<apply>")
  @scala.annotation.targetName("apply_NAPTR")
  def apply(hostname: String, rrtype: "NAPTR"): js.Promise[js.Array[NaptrRecord]] = js.native
  @JSName("<apply>")
  @scala.annotation.targetName("apply_TXT")
  def apply(hostname: String, rrtype: "TXT"): js.Promise[js.Array[js.Array[String]]] = js.native
  @JSName("<apply>")
  @scala.annotation.targetName("apply_NS")
  def apply(hostname: String, rrtype: "NS"): js.Promise[js.Array[String]] = js.native
  @JSName("<apply>")
  @scala.annotation.targetName("apply_AAAA")
  def apply(hostname: String, rrtype: "AAAA"): js.Promise[js.Array[String]] = js.native
  def apply(hostname: String, rrtype: String): js.Promise[
    (js.Array[AnyRecord | js.Array[String] | MxRecord | NaptrRecord | SrvRecord | String]) | SoaRecord
  ] = js.native
}
