package typings.openfin

import typings.openfin.environmentMod.Environment
import typings.openfin.wireMod.PortDiscoveryConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/transport/port-discovery", JSImport.Namespace)
@js.native
object portDiscoveryMod extends js.Object {
  @js.native
  class PortDiscovery protected () extends js.Object {
    def this(config: PortDiscoveryConfig, environment: Environment) = this()
    var cleanup: js.Any = js.native
    var createDiscoveryNamedPipe: js.Any = js.native
    var createManifest: js.Any = js.native
    var environment: js.Any = js.native
    var listenDiscoveryMessage: js.Any = js.native
    var manifestLocation: js.Any = js.native
    var namedPipeName: js.Any = js.native
    var namedPipeServer: js.Any = js.native
    var pipeConnection: js.Any = js.native
    var savedConfig: js.Any = js.native
    var timeoutTimer: js.Any = js.native
    def retrievePort(): js.Promise[Double] = js.native
  }
  
}

