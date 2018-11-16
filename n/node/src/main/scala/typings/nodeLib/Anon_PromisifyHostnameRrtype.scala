package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_PromisifyHostnameRrtype extends js.Object {
  def `__promisify__`(hostname: java.lang.String): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def `__promisify__`(hostname: java.lang.String, rrtype: java.lang.String): stdLib.Promise[
    js.Array[java.lang.String] | js.Array[nodeLib.dnsMod.MxRecord] | js.Array[nodeLib.dnsMod.NaptrRecord] | nodeLib.dnsMod.SoaRecord | js.Array[nodeLib.dnsMod.SrvRecord] | js.Array[js.Array[java.lang.String]] | js.Array[nodeLib.dnsMod.AnyRecord]
  ] = js.native
  @JSName("__promisify__")
  def __promisify___A(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.A): stdLib.Promise[js.Array[java.lang.String]] = js.native
  @JSName("__promisify__")
  def __promisify___AAAA(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.AAAA): stdLib.Promise[js.Array[java.lang.String]] = js.native
  @JSName("__promisify__")
  def __promisify___ANY(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.ANY): stdLib.Promise[js.Array[nodeLib.dnsMod.AnyRecord]] = js.native
  @JSName("__promisify__")
  def __promisify___CNAME(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.CNAME): stdLib.Promise[js.Array[java.lang.String]] = js.native
  @JSName("__promisify__")
  def __promisify___MX(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.MX): stdLib.Promise[js.Array[nodeLib.dnsMod.MxRecord]] = js.native
  @JSName("__promisify__")
  def __promisify___NAPTR(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.NAPTR): stdLib.Promise[js.Array[nodeLib.dnsMod.NaptrRecord]] = js.native
  @JSName("__promisify__")
  def __promisify___NS(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.NS): stdLib.Promise[js.Array[java.lang.String]] = js.native
  @JSName("__promisify__")
  def __promisify___PTR(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.PTR): stdLib.Promise[js.Array[java.lang.String]] = js.native
  @JSName("__promisify__")
  def __promisify___SOA(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.SOA): stdLib.Promise[nodeLib.dnsMod.SoaRecord] = js.native
  @JSName("__promisify__")
  def __promisify___SRV(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.SRV): stdLib.Promise[js.Array[nodeLib.dnsMod.SrvRecord]] = js.native
  @JSName("__promisify__")
  def __promisify___TXT(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.TXT): stdLib.Promise[js.Array[js.Array[java.lang.String]]] = js.native
}

