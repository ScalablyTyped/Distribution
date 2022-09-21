package typings.ndnJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ndn-js", "UnixTransport")
@js.native
open class UnixTransport ()
  extends typings.ndnJs.transportMod.UnixTransport
object UnixTransport {
  
  @JSImport("ndn-js", "UnixTransport.ConnectionInfo")
  @js.native
  open class ConnectionInfo protected ()
    extends typings.ndnJs.transportMod.UnixTransport.ConnectionInfo {
    def this(filePath: String) = this()
  }
}
