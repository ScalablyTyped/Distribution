package typings.openfin

import typings.openfin.environmentMod.Environment
import typings.openfin.frameFrameMod.EntityType
import typings.openfin.identityMod.Identity
import typings.openfin.wireMod.NewConnectConfig
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeEnvMod {
  
  @JSImport("openfin/_v2/environment/node-env", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with NodeEnvironment {
    
    /* CompleteClass */
    override def createChildWindow(options: Any): js.Promise[Any] = js.native
    
    /* CompleteClass */
    override def getCurrentEntityIdentity(): Identity = js.native
    
    /* CompleteClass */
    override def getCurrentEntityType(): EntityType = js.native
    
    /* CompleteClass */
    override def getNextMessageId(): Any = js.native
    
    /* CompleteClass */
    override def getRandomId(): String = js.native
    
    /* CompleteClass */
    override def getWebWindow(identity: Identity): Window = js.native
    
    /* CompleteClass */
    override def isWindowExists(uuid: String, name: String): Boolean = js.native
    
    /* private */ /* CompleteClass */
    var messageCounter: Any = js.native
    
    /* CompleteClass */
    override def raiseEvent(eventName: String, eventArgs: Any): Unit = js.native
    
    /* CompleteClass */
    override def retrievePort(config: NewConnectConfig): js.Promise[Double] = js.native
    
    /* CompleteClass */
    override def writeToken(path: String, token: String): js.Promise[String] = js.native
  }
  
  trait NodeEnvironment
    extends StObject
       with Environment {
    
    /* private */ var messageCounter: Any
  }
  object NodeEnvironment {
    
    inline def apply(
      createChildWindow: Any => js.Promise[Any],
      getCurrentEntityIdentity: () => Identity,
      getCurrentEntityType: () => EntityType,
      getNextMessageId: () => Any,
      getRandomId: () => String,
      getWebWindow: Identity => Window,
      isWindowExists: (String, String) => Boolean,
      messageCounter: Any,
      raiseEvent: (String, Any) => Unit,
      retrievePort: NewConnectConfig => js.Promise[Double],
      writeToken: (String, String) => js.Promise[String]
    ): NodeEnvironment = {
      val __obj = js.Dynamic.literal(createChildWindow = js.Any.fromFunction1(createChildWindow), getCurrentEntityIdentity = js.Any.fromFunction0(getCurrentEntityIdentity), getCurrentEntityType = js.Any.fromFunction0(getCurrentEntityType), getNextMessageId = js.Any.fromFunction0(getNextMessageId), getRandomId = js.Any.fromFunction0(getRandomId), getWebWindow = js.Any.fromFunction1(getWebWindow), isWindowExists = js.Any.fromFunction2(isWindowExists), messageCounter = messageCounter.asInstanceOf[js.Any], raiseEvent = js.Any.fromFunction2(raiseEvent), retrievePort = js.Any.fromFunction1(retrievePort), writeToken = js.Any.fromFunction2(writeToken))
      __obj.asInstanceOf[NodeEnvironment]
    }
    
    extension [Self <: NodeEnvironment](x: Self) {
      
      inline def setMessageCounter(value: Any): Self = StObject.set(x, "messageCounter", value.asInstanceOf[js.Any])
    }
  }
}
