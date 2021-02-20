package typings.openfin

import typings.openfin.environmentMod.Environment
import typings.openfin.frameFrameMod.EntityType
import typings.openfin.identityMod.Identity
import typings.openfin.wireMod.NewConnectConfig
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeEnvMod {
  
  @JSImport("openfin/_v2/environment/node-env", JSImport.Default)
  @js.native
  class default () extends NodeEnvironment
  
  @js.native
  trait NodeEnvironment extends Environment {
    
    var messageCounter: js.Any = js.native
  }
  object NodeEnvironment {
    
    @scala.inline
    def apply(
      createChildWindow: js.Any => js.Promise[_],
      getCurrentEntityIdentity: () => Identity,
      getCurrentEntityType: () => EntityType,
      getNextMessageId: () => js.Any,
      getRandomId: () => String,
      getWebWindow: Identity => Window,
      isWindowExists: (String, String) => Boolean,
      messageCounter: js.Any,
      raiseEvent: (String, js.Any) => Unit,
      retrievePort: NewConnectConfig => js.Promise[Double],
      writeToken: (String, String) => js.Promise[String]
    ): NodeEnvironment = {
      val __obj = js.Dynamic.literal(createChildWindow = js.Any.fromFunction1(createChildWindow), getCurrentEntityIdentity = js.Any.fromFunction0(getCurrentEntityIdentity), getCurrentEntityType = js.Any.fromFunction0(getCurrentEntityType), getNextMessageId = js.Any.fromFunction0(getNextMessageId), getRandomId = js.Any.fromFunction0(getRandomId), getWebWindow = js.Any.fromFunction1(getWebWindow), isWindowExists = js.Any.fromFunction2(isWindowExists), messageCounter = messageCounter.asInstanceOf[js.Any], raiseEvent = js.Any.fromFunction2(raiseEvent), retrievePort = js.Any.fromFunction1(retrievePort), writeToken = js.Any.fromFunction2(writeToken))
      __obj.asInstanceOf[NodeEnvironment]
    }
    
    @scala.inline
    implicit class NodeEnvironmentMutableBuilder[Self <: NodeEnvironment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessageCounter(value: js.Any): Self = StObject.set(x, "messageCounter", value.asInstanceOf[js.Any])
    }
  }
}
