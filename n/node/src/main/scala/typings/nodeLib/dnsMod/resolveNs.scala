package typings
package nodeLib.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("dns", "resolve")
@js.native
object resolveNs extends js.Object {
  def __promisify__(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def __promisify__(hostname: java.lang.String, rrtype: java.lang.String): js.Promise[
    js.Array[java.lang.String] | js.Array[nodeLib.dnsMod.MxRecord] | js.Array[nodeLib.dnsMod.NaptrRecord] | nodeLib.dnsMod.SoaRecord | js.Array[nodeLib.dnsMod.SrvRecord] | js.Array[js.Array[java.lang.String]] | js.Array[nodeLib.dnsMod.AnyRecord]
  ] = js.native
  @JSName("__promisify__")
  def __promisify___A(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.A): js.Promise[js.Array[java.lang.String]] = js.native
  @JSName("__promisify__")
  def __promisify___AAAA(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.AAAA): js.Promise[js.Array[java.lang.String]] = js.native
  @JSName("__promisify__")
  def __promisify___ANY(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.ANY): js.Promise[js.Array[nodeLib.dnsMod.AnyRecord]] = js.native
  @JSName("__promisify__")
  def __promisify___CNAME(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.CNAME): js.Promise[js.Array[java.lang.String]] = js.native
  @JSName("__promisify__")
  def __promisify___MX(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.MX): js.Promise[js.Array[nodeLib.dnsMod.MxRecord]] = js.native
  @JSName("__promisify__")
  def __promisify___NAPTR(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.NAPTR): js.Promise[js.Array[nodeLib.dnsMod.NaptrRecord]] = js.native
  @JSName("__promisify__")
  def __promisify___NS(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.NS): js.Promise[js.Array[java.lang.String]] = js.native
  @JSName("__promisify__")
  def __promisify___PTR(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.PTR): js.Promise[js.Array[java.lang.String]] = js.native
  @JSName("__promisify__")
  def __promisify___SOA(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.SOA): js.Promise[nodeLib.dnsMod.SoaRecord] = js.native
  @JSName("__promisify__")
  def __promisify___SRV(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.SRV): js.Promise[js.Array[nodeLib.dnsMod.SrvRecord]] = js.native
  @JSName("__promisify__")
  def __promisify___TXT(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.TXT): js.Promise[js.Array[js.Array[java.lang.String]]] = js.native
}

