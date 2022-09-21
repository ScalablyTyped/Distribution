package typings.ndnJs.global.ndn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ndn.UnixTransport")
@js.native
open class UnixTransport ()
  extends typings.ndnJs.mod.UnixTransport
object UnixTransport {
  
  @JSGlobal("ndn.UnixTransport.ConnectionInfo")
  @js.native
  open class ConnectionInfo protected ()
    extends typings.ndnJs.mod.UnixTransport.ConnectionInfo {
    def this(filePath: String) = this()
  }
}
