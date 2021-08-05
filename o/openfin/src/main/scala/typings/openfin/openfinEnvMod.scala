package typings.openfin

import typings.openfin.environmentMod.Environment
import typings.openfin.frameFrameMod.EntityType
import typings.openfin.identityMod.Identity
import typings.openfin.wireMod.NewConnectConfig
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object openfinEnvMod {
  
  @JSImport("openfin/_v2/environment/openfin-env", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with OpenFinEnvironment {
    
    /* CompleteClass */
    override def createChildWindow(options: js.Any): js.Promise[js.Any] = js.native
    
    /* CompleteClass */
    override def getCurrentEntityIdentity(): Identity = js.native
    
    /* CompleteClass */
    override def getCurrentEntityType(): EntityType = js.native
    
    /* CompleteClass */
    override def getNextMessageId(): js.Any = js.native
    
    /* CompleteClass */
    override def getRandomId(): String = js.native
    
    /* CompleteClass */
    override def getWebWindow(identity: Identity): Window = js.native
    
    /* CompleteClass */
    override def isWindowExists(uuid: String, name: String): Boolean = js.native
    
    /* CompleteClass */
    override def raiseEvent(eventName: String, eventArgs: js.Any): Unit = js.native
    
    /* private */ /* CompleteClass */
    var raiseEventAsync: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var resolveUrl: js.Any = js.native
    
    /* CompleteClass */
    override def retrievePort(config: NewConnectConfig): js.Promise[Double] = js.native
    
    /* CompleteClass */
    override def writeToken(path: String, token: String): js.Promise[String] = js.native
  }
  
  trait OpenFinEnvironment
    extends StObject
       with Environment {
    
    /* private */ var raiseEventAsync: js.Any
    
    /* private */ var resolveUrl: js.Any
  }
  object OpenFinEnvironment {
    
    inline def apply(
      createChildWindow: js.Any => js.Promise[js.Any],
      getCurrentEntityIdentity: () => Identity,
      getCurrentEntityType: () => EntityType,
      getNextMessageId: () => js.Any,
      getRandomId: () => String,
      getWebWindow: Identity => Window,
      isWindowExists: (String, String) => Boolean,
      raiseEvent: (String, js.Any) => Unit,
      raiseEventAsync: js.Any,
      resolveUrl: js.Any,
      retrievePort: NewConnectConfig => js.Promise[Double],
      writeToken: (String, String) => js.Promise[String]
    ): OpenFinEnvironment = {
      val __obj = js.Dynamic.literal(createChildWindow = js.Any.fromFunction1(createChildWindow), getCurrentEntityIdentity = js.Any.fromFunction0(getCurrentEntityIdentity), getCurrentEntityType = js.Any.fromFunction0(getCurrentEntityType), getNextMessageId = js.Any.fromFunction0(getNextMessageId), getRandomId = js.Any.fromFunction0(getRandomId), getWebWindow = js.Any.fromFunction1(getWebWindow), isWindowExists = js.Any.fromFunction2(isWindowExists), raiseEvent = js.Any.fromFunction2(raiseEvent), raiseEventAsync = raiseEventAsync.asInstanceOf[js.Any], resolveUrl = resolveUrl.asInstanceOf[js.Any], retrievePort = js.Any.fromFunction1(retrievePort), writeToken = js.Any.fromFunction2(writeToken))
      __obj.asInstanceOf[OpenFinEnvironment]
    }
    
    extension [Self <: OpenFinEnvironment](x: Self) {
      
      inline def setRaiseEventAsync(value: js.Any): Self = StObject.set(x, "raiseEventAsync", value.asInstanceOf[js.Any])
      
      inline def setResolveUrl(value: js.Any): Self = StObject.set(x, "resolveUrl", value.asInstanceOf[js.Any])
    }
  }
}
