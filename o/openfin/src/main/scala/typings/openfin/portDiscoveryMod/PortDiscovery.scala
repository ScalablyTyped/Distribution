package typings.openfin.portDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortDiscovery extends js.Object {
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

object PortDiscovery {
  @scala.inline
  def apply(
    cleanup: js.Any,
    createDiscoveryNamedPipe: js.Any,
    createManifest: js.Any,
    environment: js.Any,
    listenDiscoveryMessage: js.Any,
    manifestLocation: js.Any,
    namedPipeName: js.Any,
    namedPipeServer: js.Any,
    pipeConnection: js.Any,
    retrievePort: () => js.Promise[Double],
    savedConfig: js.Any,
    timeoutTimer: js.Any
  ): PortDiscovery = {
    val __obj = js.Dynamic.literal(cleanup = cleanup.asInstanceOf[js.Any], createDiscoveryNamedPipe = createDiscoveryNamedPipe.asInstanceOf[js.Any], createManifest = createManifest.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], listenDiscoveryMessage = listenDiscoveryMessage.asInstanceOf[js.Any], manifestLocation = manifestLocation.asInstanceOf[js.Any], namedPipeName = namedPipeName.asInstanceOf[js.Any], namedPipeServer = namedPipeServer.asInstanceOf[js.Any], pipeConnection = pipeConnection.asInstanceOf[js.Any], retrievePort = js.Any.fromFunction0(retrievePort), savedConfig = savedConfig.asInstanceOf[js.Any], timeoutTimer = timeoutTimer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortDiscovery]
  }
  @scala.inline
  implicit class PortDiscoveryOps[Self <: PortDiscovery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCleanup(value: js.Any): Self = this.set("cleanup", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateDiscoveryNamedPipe(value: js.Any): Self = this.set("createDiscoveryNamedPipe", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateManifest(value: js.Any): Self = this.set("createManifest", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironment(value: js.Any): Self = this.set("environment", value.asInstanceOf[js.Any])
    @scala.inline
    def setListenDiscoveryMessage(value: js.Any): Self = this.set("listenDiscoveryMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setManifestLocation(value: js.Any): Self = this.set("manifestLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamedPipeName(value: js.Any): Self = this.set("namedPipeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamedPipeServer(value: js.Any): Self = this.set("namedPipeServer", value.asInstanceOf[js.Any])
    @scala.inline
    def setPipeConnection(value: js.Any): Self = this.set("pipeConnection", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetrievePort(value: () => js.Promise[Double]): Self = this.set("retrievePort", js.Any.fromFunction0(value))
    @scala.inline
    def setSavedConfig(value: js.Any): Self = this.set("savedConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeoutTimer(value: js.Any): Self = this.set("timeoutTimer", value.asInstanceOf[js.Any])
  }
  
}

