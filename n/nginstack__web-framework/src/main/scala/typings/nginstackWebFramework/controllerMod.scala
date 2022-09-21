package typings.nginstackWebFramework

import typings.nginstackWebFramework.anon.Message
import typings.nginstackWebFramework.locationMod.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controllerMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/messaging/Controller", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Controller
  @JSImport("@nginstack/web-framework/lib/messaging/Controller", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInstance(): Controller = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[Controller]
  
  @js.native
  trait Controller extends StObject {
    
    def createUniqueId(location: Location): String = js.native
    
    def getComponent(id: String): Any = js.native
    
    def getOutgoingMessages(): js.Array[Message] = js.native
    
    def handleIncomingMessages(messages: js.Array[Message]): Unit = js.native
    
    def initSlaveComponent(ownerId: String, componentName: String, masterId: String, props: Any): String = js.native
    def initSlaveComponent(ownerId: String, componentName: String, masterId: Null, props: Any): String = js.native
    def initSlaveComponent(ownerId: Null, componentName: String, masterId: String, props: Any): String = js.native
    def initSlaveComponent(ownerId: Null, componentName: String, masterId: Null, props: Any): String = js.native
    
    /* private */ var lastUniqueId_ : Any = js.native
    
    /* private */ var locationFromId_ : Any = js.native
    
    /* private */ var outgoingMessages_ : Any = js.native
    
    /* private */ var pubsub_ : Any = js.native
    
    def registerComponent(component: Any): Unit = js.native
    
    def sendMessage(targetId: String, message: Any): Unit = js.native
    
    def unregisterComponent(component: Any): Unit = js.native
  }
}
