package typings.openfin

import typings.openfin.environmentMod.Environment
import typings.openfin.wireMod.PortDiscoveryConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portDiscoveryMod {
  
  @JSImport("openfin/_v2/transport/port-discovery", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with PortDiscovery {
    def this(config: PortDiscoveryConfig, environment: Environment) = this()
    
    /* private */ /* CompleteClass */
    var cleanup: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var createDiscoveryNamedPipe: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var createManifest: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var environment: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var listenDiscoveryMessage: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var manifestLocation: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var namedPipeName: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var namedPipeServer: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var pipeConnection: js.Any = js.native
    
    /* CompleteClass */
    override def retrievePort(): js.Promise[Double] = js.native
    
    /* private */ /* CompleteClass */
    var savedConfig: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var timeoutTimer: js.Any = js.native
  }
  
  trait PortDiscovery extends StObject {
    
    /* private */ var cleanup: js.Any
    
    /* private */ var createDiscoveryNamedPipe: js.Any
    
    /* private */ var createManifest: js.Any
    
    /* private */ var environment: js.Any
    
    /* private */ var listenDiscoveryMessage: js.Any
    
    /* private */ var manifestLocation: js.Any
    
    /* private */ var namedPipeName: js.Any
    
    /* private */ var namedPipeServer: js.Any
    
    /* private */ var pipeConnection: js.Any
    
    def retrievePort(): js.Promise[Double]
    
    /* private */ var savedConfig: js.Any
    
    /* private */ var timeoutTimer: js.Any
  }
  object PortDiscovery {
    
    inline def apply(
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
    
    extension [Self <: PortDiscovery](x: Self) {
      
      inline def setCleanup(value: js.Any): Self = StObject.set(x, "cleanup", value.asInstanceOf[js.Any])
      
      inline def setCreateDiscoveryNamedPipe(value: js.Any): Self = StObject.set(x, "createDiscoveryNamedPipe", value.asInstanceOf[js.Any])
      
      inline def setCreateManifest(value: js.Any): Self = StObject.set(x, "createManifest", value.asInstanceOf[js.Any])
      
      inline def setEnvironment(value: js.Any): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setListenDiscoveryMessage(value: js.Any): Self = StObject.set(x, "listenDiscoveryMessage", value.asInstanceOf[js.Any])
      
      inline def setManifestLocation(value: js.Any): Self = StObject.set(x, "manifestLocation", value.asInstanceOf[js.Any])
      
      inline def setNamedPipeName(value: js.Any): Self = StObject.set(x, "namedPipeName", value.asInstanceOf[js.Any])
      
      inline def setNamedPipeServer(value: js.Any): Self = StObject.set(x, "namedPipeServer", value.asInstanceOf[js.Any])
      
      inline def setPipeConnection(value: js.Any): Self = StObject.set(x, "pipeConnection", value.asInstanceOf[js.Any])
      
      inline def setRetrievePort(value: () => js.Promise[Double]): Self = StObject.set(x, "retrievePort", js.Any.fromFunction0(value))
      
      inline def setSavedConfig(value: js.Any): Self = StObject.set(x, "savedConfig", value.asInstanceOf[js.Any])
      
      inline def setTimeoutTimer(value: js.Any): Self = StObject.set(x, "timeoutTimer", value.asInstanceOf[js.Any])
    }
  }
}
