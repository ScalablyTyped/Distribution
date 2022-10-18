package typings.ndnJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("ndn-js", "Transport")
@js.native
open class Transport ()
  extends typings.ndnJs.transportMod.Transport
/* static members */
object Transport {
  
  @JSImport("ndn-js", "Transport")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ndn-js", "Transport.ConnectionInfo")
  @js.native
  def ConnectionInfo: typings.ndnJs.transportMod.TransportConnectionInfo = js.native
  inline def ConnectionInfo_=(x: typings.ndnJs.transportMod.TransportConnectionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConnectionInfo")(x.asInstanceOf[js.Any])
}
