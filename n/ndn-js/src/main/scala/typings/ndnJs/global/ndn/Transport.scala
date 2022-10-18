package typings.ndnJs.global.ndn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSGlobal("ndn.Transport")
@js.native
open class Transport ()
  extends typings.ndnJs.mod.Transport
/* static members */
object Transport {
  
  @JSGlobal("ndn.Transport")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ndn.Transport.ConnectionInfo")
  @js.native
  def ConnectionInfo: typings.ndnJs.transportMod.TransportConnectionInfo = js.native
  inline def ConnectionInfo_=(x: typings.ndnJs.transportMod.TransportConnectionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConnectionInfo")(x.asInstanceOf[js.Any])
}
