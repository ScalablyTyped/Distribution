package typings.mobxStateTree

import typings.mobxStateTree.distCoreActionContextMod.IActionContext
import typings.mobxStateTree.distCoreNodeNodeUtilsMod.IAnyStateTreeNode
import typings.mobxStateTree.distUtilsMod.IDisposer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMiddlewaresOnActionMod {
  
  @JSImport("mobx-state-tree/dist/middlewares/on-action", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyAction(target: IAnyStateTreeNode, actions: js.Array[ISerializedActionCall]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyAction")(target.asInstanceOf[js.Any], actions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def applyAction(target: IAnyStateTreeNode, actions: ISerializedActionCall): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyAction")(target.asInstanceOf[js.Any], actions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def onAction(target: IAnyStateTreeNode, listener: js.Function1[/* call */ ISerializedActionCall, Unit]): IDisposer = (^.asInstanceOf[js.Dynamic].applyDynamic("onAction")(target.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[IDisposer]
  inline def onAction(
    target: IAnyStateTreeNode,
    listener: js.Function1[/* call */ ISerializedActionCall, Unit],
    attachAfter: Boolean
  ): IDisposer = (^.asInstanceOf[js.Dynamic].applyDynamic("onAction")(target.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], attachAfter.asInstanceOf[js.Any])).asInstanceOf[IDisposer]
  
  inline def recordActions(subject: IAnyStateTreeNode): IActionRecorder = ^.asInstanceOf[js.Dynamic].applyDynamic("recordActions")(subject.asInstanceOf[js.Any]).asInstanceOf[IActionRecorder]
  inline def recordActions(
    subject: IAnyStateTreeNode,
    filter: js.Function2[
      /* action */ ISerializedActionCall, 
      /* actionContext */ js.UndefOr[IActionContext], 
      Boolean
    ]
  ): IActionRecorder = (^.asInstanceOf[js.Dynamic].applyDynamic("recordActions")(subject.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[IActionRecorder]
  
  trait IActionRecorder extends StObject {
    
    var actions: js.Array[ISerializedActionCall]
    
    val recording: Boolean
    
    def replay(target: IAnyStateTreeNode): Unit
    
    def resume(): Unit
    
    def stop(): Unit
  }
  object IActionRecorder {
    
    inline def apply(
      actions: js.Array[ISerializedActionCall],
      recording: Boolean,
      replay: IAnyStateTreeNode => Unit,
      resume: () => Unit,
      stop: () => Unit
    ): IActionRecorder = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], recording = recording.asInstanceOf[js.Any], replay = js.Any.fromFunction1(replay), resume = js.Any.fromFunction0(resume), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[IActionRecorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IActionRecorder] (val x: Self) extends AnyVal {
      
      inline def setActions(value: js.Array[ISerializedActionCall]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsVarargs(value: ISerializedActionCall*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setRecording(value: Boolean): Self = StObject.set(x, "recording", value.asInstanceOf[js.Any])
      
      inline def setReplay(value: IAnyStateTreeNode => Unit): Self = StObject.set(x, "replay", js.Any.fromFunction1(value))
      
      inline def setResume(value: () => Unit): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
  
  trait ISerializedActionCall extends StObject {
    
    var args: js.UndefOr[js.Array[Any]] = js.undefined
    
    var name: String
    
    var path: js.UndefOr[String] = js.undefined
  }
  object ISerializedActionCall {
    
    inline def apply(name: String): ISerializedActionCall = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISerializedActionCall]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISerializedActionCall] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
}
