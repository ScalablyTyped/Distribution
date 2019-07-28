package typings.mz.dnsMod

import typings.mz.mzStrings.A
import typings.mz.mzStrings.AAAA
import typings.mz.mzStrings.ANY
import typings.mz.mzStrings.CNAME
import typings.mz.mzStrings.MX
import typings.mz.mzStrings.NAPTR
import typings.mz.mzStrings.NS
import typings.mz.mzStrings.PTR
import typings.mz.mzStrings.SOA
import typings.mz.mzStrings.SRV
import typings.mz.mzStrings.TXT
import typings.node.dnsMod.AnyRecord
import typings.node.dnsMod.MxRecord
import typings.node.dnsMod.NaptrRecord
import typings.node.dnsMod.SoaRecord
import typings.node.dnsMod.SrvRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("mz/dns", "resolve")
@js.native
object resolveNs extends js.Object {
  def __promisify__(hostname: String): js.Promise[js.Array[String]] = js.native
  def __promisify__(hostname: String, rrtype: String): js.Promise[
    (js.Array[AnyRecord | js.Array[String] | MxRecord | NaptrRecord | SrvRecord | String]) | SoaRecord
  ] = js.native
  @JSName("__promisify__")
  def __promisify___A(hostname: String, rrtype: A): js.Promise[js.Array[String]] = js.native
  @JSName("__promisify__")
  def __promisify___AAAA(hostname: String, rrtype: AAAA): js.Promise[js.Array[String]] = js.native
  @JSName("__promisify__")
  def __promisify___ANY(hostname: String, rrtype: ANY): js.Promise[js.Array[AnyRecord]] = js.native
  @JSName("__promisify__")
  def __promisify___CNAME(hostname: String, rrtype: CNAME): js.Promise[js.Array[String]] = js.native
  @JSName("__promisify__")
  def __promisify___MX(hostname: String, rrtype: MX): js.Promise[js.Array[MxRecord]] = js.native
  @JSName("__promisify__")
  def __promisify___NAPTR(hostname: String, rrtype: NAPTR): js.Promise[js.Array[NaptrRecord]] = js.native
  @JSName("__promisify__")
  def __promisify___NS(hostname: String, rrtype: NS): js.Promise[js.Array[String]] = js.native
  @JSName("__promisify__")
  def __promisify___PTR(hostname: String, rrtype: PTR): js.Promise[js.Array[String]] = js.native
  @JSName("__promisify__")
  def __promisify___SOA(hostname: String, rrtype: SOA): js.Promise[SoaRecord] = js.native
  @JSName("__promisify__")
  def __promisify___SRV(hostname: String, rrtype: SRV): js.Promise[js.Array[SrvRecord]] = js.native
  @JSName("__promisify__")
  def __promisify___TXT(hostname: String, rrtype: TXT): js.Promise[js.Array[js.Array[String]]] = js.native
}

