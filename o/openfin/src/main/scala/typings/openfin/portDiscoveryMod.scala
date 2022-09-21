package typings.openfin

import typings.openfin.environmentMod.Environment
import typings.openfin.wireMod.PortDiscoveryConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portDiscoveryMod {
  
  @JSImport("openfin/_v2/transport/port-discovery", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with PortDiscovery {
    def this(config: PortDiscoveryConfig, environment: Environment) = this()
    
    /* private */ /* CompleteClass */
    var cleanup: Any = js.native
    
    /* private */ /* CompleteClass */
    var createDiscoveryNamedPipe: Any = js.native
    
    /* private */ /* CompleteClass */
    var createManifest: Any = js.native
    
    /* private */ /* CompleteClass */
    var environment: Any = js.native
    
    /* private */ /* CompleteClass */
    var listenDiscoveryMessage: Any = js.native
    
    /* private */ /* CompleteClass */
    var manifestLocation: Any = js.native
    
    /* private */ /* CompleteClass */
    var namedPipeName: Any = js.native
    
    /* private */ /* CompleteClass */
    var namedPipeServer: Any = js.native
    
    /* private */ /* CompleteClass */
    var pipeConnection: Any = js.native
    
    /* CompleteClass */
    override def retrievePort(): js.Promise[Double] = js.native
    
    /* private */ /* CompleteClass */
    var savedConfig: Any = js.native
    
    /* private */ /* CompleteClass */
    var timeoutTimer: Any = js.native
  }
  
  trait PortDiscovery extends StObject {
    
    /* private */ var cleanup: Any
    
    /* private */ var createDiscoveryNamedPipe: Any
    
    /* private */ var createManifest: Any
    
    /* private */ var environment: Any
    
    /* private */ var listenDiscoveryMessage: Any
    
    /* private */ var manifestLocation: Any
    
    /* private */ var namedPipeName: Any
    
    /* private */ var namedPipeServer: Any
    
    /* private */ var pipeConnection: Any
    
    def retrievePort(): js.Promise[Double]
    
    /* private */ var savedConfig: Any
    
    /* private */ var timeoutTimer: Any
  }
  object PortDiscovery {
    
    inline def apply(
      cleanup: Any,
      createDiscoveryNamedPipe: Any,
      createManifest: Any,
      environment: Any,
      listenDiscoveryMessage: Any,
      manifestLocation: Any,
      namedPipeName: Any,
      namedPipeServer: Any,
      pipeConnection: Any,
      retrievePort: () => js.Promise[Double],
      savedConfig: Any,
      timeoutTimer: Any
    ): PortDiscovery = {
      val __obj = js.Dynamic.literal(cleanup = cleanup.asInstanceOf[js.Any], createDiscoveryNamedPipe = createDiscoveryNamedPipe.asInstanceOf[js.Any], createManifest = createManifest.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], listenDiscoveryMessage = listenDiscoveryMessage.asInstanceOf[js.Any], manifestLocation = manifestLocation.asInstanceOf[js.Any], namedPipeName = namedPipeName.asInstanceOf[js.Any], namedPipeServer = namedPipeServer.asInstanceOf[js.Any], pipeConnection = pipeConnection.asInstanceOf[js.Any], retrievePort = js.Any.fromFunction0(retrievePort), savedConfig = savedConfig.asInstanceOf[js.Any], timeoutTimer = timeoutTimer.asInstanceOf[js.Any])
      __obj.asInstanceOf[PortDiscovery]
    }
    
    extension [Self <: PortDiscovery](x: Self) {
      
      inline def setCleanup(value: Any): Self = StObject.set(x, "cleanup", value.asInstanceOf[js.Any])
      
      inline def setCreateDiscoveryNamedPipe(value: Any): Self = StObject.set(x, "createDiscoveryNamedPipe", value.asInstanceOf[js.Any])
      
      inline def setCreateManifest(value: Any): Self = StObject.set(x, "createManifest", value.asInstanceOf[js.Any])
      
      inline def setEnvironment(value: Any): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setListenDiscoveryMessage(value: Any): Self = StObject.set(x, "listenDiscoveryMessage", value.asInstanceOf[js.Any])
      
      inline def setManifestLocation(value: Any): Self = StObject.set(x, "manifestLocation", value.asInstanceOf[js.Any])
      
      inline def setNamedPipeName(value: Any): Self = StObject.set(x, "namedPipeName", value.asInstanceOf[js.Any])
      
      inline def setNamedPipeServer(value: Any): Self = StObject.set(x, "namedPipeServer", value.asInstanceOf[js.Any])
      
      inline def setPipeConnection(value: Any): Self = StObject.set(x, "pipeConnection", value.asInstanceOf[js.Any])
      
      inline def setRetrievePort(value: () => js.Promise[Double]): Self = StObject.set(x, "retrievePort", js.Any.fromFunction0(value))
      
      inline def setSavedConfig(value: Any): Self = StObject.set(x, "savedConfig", value.asInstanceOf[js.Any])
      
      inline def setTimeoutTimer(value: Any): Self = StObject.set(x, "timeoutTimer", value.asInstanceOf[js.Any])
    }
  }
}
