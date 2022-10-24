package typings.mongodb.mod

import typings.node.dnsMod.SrvRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "HostAddress")
@js.native
open class HostAddress protected () extends StObject {
  def this(hostString: String) = this()
  
  var host: js.UndefOr[String] = js.native
  
  def inspect(): String = js.native
  
  var isIPv6: Boolean = js.native
  
  var port: js.UndefOr[scala.Double] = js.native
  
  var socketPath: js.UndefOr[String] = js.native
}
/* static members */
object HostAddress {
  
  @JSImport("mongodb", "HostAddress")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromHostPort(host: String, port: scala.Double): HostAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHostPort")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[HostAddress]
  
  inline def fromSrvRecord(param0: SrvRecord): HostAddress = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSrvRecord")(param0.asInstanceOf[js.Any]).asInstanceOf[HostAddress]
  
  inline def fromString(s: String): HostAddress = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(s.asInstanceOf[js.Any]).asInstanceOf[HostAddress]
}
