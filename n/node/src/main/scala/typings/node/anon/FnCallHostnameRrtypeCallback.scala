package typings.node.anon

import typings.node.NodeJS.ErrnoException
import typings.node.dnsMod.AnyRecord
import typings.node.dnsMod.MxRecord
import typings.node.dnsMod.NaptrRecord
import typings.node.dnsMod.SoaRecord
import typings.node.dnsMod.SrvRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallHostnameRrtypeCallback extends StObject {
  
  def apply(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  @JSName("<apply>")
  @scala.annotation.targetName("apply_SOA")
  def apply(
    hostname: String,
    rrtype: "SOA",
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ SoaRecord, Unit]
  ): Unit = js.native
  @JSName("<apply>")
  @scala.annotation.targetName("apply_NAPTR")
  def apply(
    hostname: String,
    rrtype: "NAPTR",
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[NaptrRecord], Unit]
  ): Unit = js.native
  @JSName("<apply>")
  @scala.annotation.targetName("apply_A")
  def apply(
    hostname: String,
    rrtype: "A",
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  @JSName("<apply>")
  @scala.annotation.targetName("apply_MX")
  def apply(
    hostname: String,
    rrtype: "MX",
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[MxRecord], Unit]
  ): Unit = js.native
  @JSName("<apply>")
  @scala.annotation.targetName("apply_SRV")
  def apply(
    hostname: String,
    rrtype: "SRV",
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[SrvRecord], Unit]
  ): Unit = js.native
  @JSName("<apply>")
  @scala.annotation.targetName("apply_TXT")
  def apply(
    hostname: String,
    rrtype: "TXT",
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[js.Array[String]], Unit]
  ): Unit = js.native
  @JSName("<apply>")
  @scala.annotation.targetName("apply_AAAA")
  def apply(
    hostname: String,
    rrtype: "AAAA",
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  @JSName("<apply>")
  @scala.annotation.targetName("apply_CNAME")
  def apply(
    hostname: String,
    rrtype: "CNAME",
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  @JSName("<apply>")
  @scala.annotation.targetName("apply_PTR")
  def apply(
    hostname: String,
    rrtype: "PTR",
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  @JSName("<apply>")
  @scala.annotation.targetName("apply_ANY")
  def apply(
    hostname: String,
    rrtype: "ANY",
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[AnyRecord], Unit]
  ): Unit = js.native
  @JSName("<apply>")
  @scala.annotation.targetName("apply_NS")
  def apply(
    hostname: String,
    rrtype: "NS",
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  def apply(
    hostname: String,
    rrtype: String,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* addresses */ (js.Array[AnyRecord | js.Array[String] | MxRecord | NaptrRecord | SrvRecord | String]) | SoaRecord, 
      Unit
    ]
  ): Unit = js.native
}
