package typings.openfin

import typings.node.childProcessMod.ChildProcess
import typings.openfin.wireMod.ConfigWithRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object winLaunchMod {
  
  @JSImport("openfin/_v2/launcher/win-launch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(config: ConfigWithRuntime, manifestLocation: String, namedPipeName: String): js.Promise[ChildProcess] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any], manifestLocation.asInstanceOf[js.Any], namedPipeName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ChildProcess]]
}
