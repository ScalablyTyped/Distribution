package typings.openfin

import typings.openfin.frameFrameMod.EntityType
import typings.openfin.identityMod.Identity
import typings.openfin.wireMod.NewConnectConfig
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object environmentMod {
  
  @JSImport("openfin/_v2/environment/environment", "notImplementedEnvErrorMsg")
  @js.native
  val notImplementedEnvErrorMsg: /* "Not implemented in this environment" */ String = js.native
  
  trait Environment extends StObject {
    
    def createChildWindow(options: js.Any): js.Promise[js.Any]
    
    def getCurrentEntityIdentity(): Identity
    
    def getCurrentEntityType(): EntityType
    
    def getNextMessageId(): js.Any
    
    def getRandomId(): String
    
    def getWebWindow(identity: Identity): Window
    
    def isWindowExists(uuid: String, name: String): Boolean
    
    def raiseEvent(eventName: String, eventArgs: js.Any): Unit
    
    def retrievePort(config: NewConnectConfig): js.Promise[Double]
    
    def writeToken(path: String, token: String): js.Promise[String]
  }
  object Environment {
    
    @scala.inline
    def apply(
      createChildWindow: js.Any => js.Promise[js.Any],
      getCurrentEntityIdentity: () => Identity,
      getCurrentEntityType: () => EntityType,
      getNextMessageId: () => js.Any,
      getRandomId: () => String,
      getWebWindow: Identity => Window,
      isWindowExists: (String, String) => Boolean,
      raiseEvent: (String, js.Any) => Unit,
      retrievePort: NewConnectConfig => js.Promise[Double],
      writeToken: (String, String) => js.Promise[String]
    ): Environment = {
      val __obj = js.Dynamic.literal(createChildWindow = js.Any.fromFunction1(createChildWindow), getCurrentEntityIdentity = js.Any.fromFunction0(getCurrentEntityIdentity), getCurrentEntityType = js.Any.fromFunction0(getCurrentEntityType), getNextMessageId = js.Any.fromFunction0(getNextMessageId), getRandomId = js.Any.fromFunction0(getRandomId), getWebWindow = js.Any.fromFunction1(getWebWindow), isWindowExists = js.Any.fromFunction2(isWindowExists), raiseEvent = js.Any.fromFunction2(raiseEvent), retrievePort = js.Any.fromFunction1(retrievePort), writeToken = js.Any.fromFunction2(writeToken))
      __obj.asInstanceOf[Environment]
    }
    
    @scala.inline
    implicit class EnvironmentMutableBuilder[Self <: Environment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateChildWindow(value: js.Any => js.Promise[js.Any]): Self = StObject.set(x, "createChildWindow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetCurrentEntityIdentity(value: () => Identity): Self = StObject.set(x, "getCurrentEntityIdentity", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCurrentEntityType(value: () => EntityType): Self = StObject.set(x, "getCurrentEntityType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetNextMessageId(value: () => js.Any): Self = StObject.set(x, "getNextMessageId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRandomId(value: () => String): Self = StObject.set(x, "getRandomId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetWebWindow(value: Identity => Window): Self = StObject.set(x, "getWebWindow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsWindowExists(value: (String, String) => Boolean): Self = StObject.set(x, "isWindowExists", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRaiseEvent(value: (String, js.Any) => Unit): Self = StObject.set(x, "raiseEvent", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRetrievePort(value: NewConnectConfig => js.Promise[Double]): Self = StObject.set(x, "retrievePort", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWriteToken(value: (String, String) => js.Promise[String]): Self = StObject.set(x, "writeToken", js.Any.fromFunction2(value))
    }
  }
}
