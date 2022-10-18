package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMessagingComponentMod {
  
  inline def apply(owner: Component): Unit = ^.asInstanceOf[js.Dynamic].apply(owner.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/messaging/Component", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Component {
    def this(owner: Component) = this()
    
    /* private */ /* CompleteClass */
    var act_dispose_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var addResource_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var componentId_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var controller_ : Any = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def getComponentId(): String = js.native
    
    /* CompleteClass */
    override def getInstance(callback: js.Function1[/* arg0 */ this.type, Any]): Unit = js.native
    
    /* CompleteClass */
    override def getPairId(): String = js.native
    
    /* private */ /* CompleteClass */
    var handleAction_ : Any = js.native
    
    /* CompleteClass */
    override def handleMessage(message: Any): Boolean = js.native
    
    /* private */ /* CompleteClass */
    var owner_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var pairId_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var remoteCall_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var removeResource_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var resources_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var sendMessage_ : Any = js.native
  }
  @JSImport("@nginstack/web-framework/lib/messaging/Component", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Component extends StObject {
    
    /* private */ var act_dispose_ : Any
    
    /* private */ var addResource_ : Any
    
    /* private */ var componentId_ : Any
    
    /* private */ var controller_ : Any
    
    def dispose(): Unit
    
    def getComponentId(): String
    
    def getInstance(callback: js.Function1[/* arg0 */ this.type, Any]): Unit
    
    def getPairId(): String
    
    /* private */ var handleAction_ : Any
    
    def handleMessage(message: Any): Boolean
    
    /* private */ var owner_ : Any
    
    /* private */ var pairId_ : Any
    
    /* private */ var remoteCall_ : Any
    
    /* private */ var removeResource_ : Any
    
    /* private */ var resources_ : Any
    
    /* private */ var sendMessage_ : Any
  }
  object Component {
    
    inline def apply(
      act_dispose_ : Any,
      addResource_ : Any,
      componentId_ : Any,
      controller_ : Any,
      dispose: () => Unit,
      getComponentId: () => String,
      getInstance: js.Function1[Component, Any] => Unit,
      getPairId: () => String,
      handleAction_ : Any,
      handleMessage: Any => Boolean,
      owner_ : Any,
      pairId_ : Any,
      remoteCall_ : Any,
      removeResource_ : Any,
      resources_ : Any,
      sendMessage_ : Any
    ): Component = {
      val __obj = js.Dynamic.literal(act_dispose_ = act_dispose_.asInstanceOf[js.Any], addResource_ = addResource_.asInstanceOf[js.Any], componentId_ = componentId_.asInstanceOf[js.Any], controller_ = controller_.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), getComponentId = js.Any.fromFunction0(getComponentId), getInstance = js.Any.fromFunction1(getInstance), getPairId = js.Any.fromFunction0(getPairId), handleAction_ = handleAction_.asInstanceOf[js.Any], handleMessage = js.Any.fromFunction1(handleMessage), owner_ = owner_.asInstanceOf[js.Any], pairId_ = pairId_.asInstanceOf[js.Any], remoteCall_ = remoteCall_.asInstanceOf[js.Any], removeResource_ = removeResource_.asInstanceOf[js.Any], resources_ = resources_.asInstanceOf[js.Any], sendMessage_ = sendMessage_.asInstanceOf[js.Any])
      __obj.asInstanceOf[Component]
    }
    
    extension [Self <: Component](x: Self) {
      
      inline def setAct_dispose_(value: Any): Self = StObject.set(x, "act_dispose_", value.asInstanceOf[js.Any])
      
      inline def setAddResource_(value: Any): Self = StObject.set(x, "addResource_", value.asInstanceOf[js.Any])
      
      inline def setComponentId_(value: Any): Self = StObject.set(x, "componentId_", value.asInstanceOf[js.Any])
      
      inline def setController_(value: Any): Self = StObject.set(x, "controller_", value.asInstanceOf[js.Any])
      
      inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      inline def setGetComponentId(value: () => String): Self = StObject.set(x, "getComponentId", js.Any.fromFunction0(value))
      
      inline def setGetInstance(value: js.Function1[Component, Any] => Unit): Self = StObject.set(x, "getInstance", js.Any.fromFunction1(value))
      
      inline def setGetPairId(value: () => String): Self = StObject.set(x, "getPairId", js.Any.fromFunction0(value))
      
      inline def setHandleAction_(value: Any): Self = StObject.set(x, "handleAction_", value.asInstanceOf[js.Any])
      
      inline def setHandleMessage(value: Any => Boolean): Self = StObject.set(x, "handleMessage", js.Any.fromFunction1(value))
      
      inline def setOwner_(value: Any): Self = StObject.set(x, "owner_", value.asInstanceOf[js.Any])
      
      inline def setPairId_(value: Any): Self = StObject.set(x, "pairId_", value.asInstanceOf[js.Any])
      
      inline def setRemoteCall_(value: Any): Self = StObject.set(x, "remoteCall_", value.asInstanceOf[js.Any])
      
      inline def setRemoveResource_(value: Any): Self = StObject.set(x, "removeResource_", value.asInstanceOf[js.Any])
      
      inline def setResources_(value: Any): Self = StObject.set(x, "resources_", value.asInstanceOf[js.Any])
      
      inline def setSendMessage_(value: Any): Self = StObject.set(x, "sendMessage_", value.asInstanceOf[js.Any])
    }
  }
}
