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

object openfinEnvMod {
  
  @JSImport("openfin/_v2/environment/openfin-env", JSImport.Default)
  @js.native
  class default () extends OpenFinEnvironment
  
  @js.native
  trait OpenFinEnvironment extends Environment {
    
    var raiseEventAsync: js.Any = js.native
    
    var resolveUrl: js.Any = js.native
  }
  object OpenFinEnvironment {
    
    @scala.inline
    def apply(
      createChildWindow: js.Any => js.Promise[_],
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
    
    @scala.inline
    implicit class OpenFinEnvironmentMutableBuilder[Self <: OpenFinEnvironment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRaiseEventAsync(value: js.Any): Self = StObject.set(x, "raiseEventAsync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveUrl(value: js.Any): Self = StObject.set(x, "resolveUrl", value.asInstanceOf[js.Any])
    }
  }
}
