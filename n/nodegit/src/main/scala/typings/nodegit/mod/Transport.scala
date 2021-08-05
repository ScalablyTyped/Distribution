package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Transport")
@js.native
class Transport ()
  extends typings.nodegit.transportMod.Transport
/* static members */
object Transport {
  
  @JSImport("nodegit", "Transport")
  @js.native
  val ^ : js.Any = js.native
  
  inline def sshWithPaths(owner: typings.nodegit.remoteMod.Remote, payload: String): js.Promise[typings.nodegit.transportMod.Transport] = (^.asInstanceOf[js.Dynamic].applyDynamic("sshWithPaths")(owner.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.transportMod.Transport]]
  inline def sshWithPaths(owner: typings.nodegit.remoteMod.Remote, payload: js.Array[String]): js.Promise[typings.nodegit.transportMod.Transport] = (^.asInstanceOf[js.Dynamic].applyDynamic("sshWithPaths")(owner.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.transportMod.Transport]]
  inline def sshWithPaths(owner: typings.nodegit.remoteMod.Remote, payload: typings.nodegit.strArrayMod.Strarray): js.Promise[typings.nodegit.transportMod.Transport] = (^.asInstanceOf[js.Dynamic].applyDynamic("sshWithPaths")(owner.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.transportMod.Transport]]
  
  inline def unregister(prefix: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(prefix.asInstanceOf[js.Any]).asInstanceOf[Double]
}
