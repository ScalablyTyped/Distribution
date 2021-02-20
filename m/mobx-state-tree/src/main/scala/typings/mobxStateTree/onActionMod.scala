package typings.mobxStateTree

import typings.mobxStateTree.actionContextMod.IActionContext
import typings.mobxStateTree.nodeUtilsMod.IAnyStateTreeNode
import typings.mobxStateTree.utilsMod.IDisposer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onActionMod {
  
  @JSImport("mobx-state-tree/dist/middlewares/on-action", "applyAction")
  @js.native
  def applyAction(target: IAnyStateTreeNode, actions: js.Array[ISerializedActionCall]): Unit = js.native
  @JSImport("mobx-state-tree/dist/middlewares/on-action", "applyAction")
  @js.native
  def applyAction(target: IAnyStateTreeNode, actions: ISerializedActionCall): Unit = js.native
  
  @JSImport("mobx-state-tree/dist/middlewares/on-action", "onAction")
  @js.native
  def onAction(target: IAnyStateTreeNode, listener: js.Function1[/* call */ ISerializedActionCall, Unit]): IDisposer = js.native
  @JSImport("mobx-state-tree/dist/middlewares/on-action", "onAction")
  @js.native
  def onAction(
    target: IAnyStateTreeNode,
    listener: js.Function1[/* call */ ISerializedActionCall, Unit],
    attachAfter: Boolean
  ): IDisposer = js.native
  
  @JSImport("mobx-state-tree/dist/middlewares/on-action", "recordActions")
  @js.native
  def recordActions(subject: IAnyStateTreeNode): IActionRecorder = js.native
  @JSImport("mobx-state-tree/dist/middlewares/on-action", "recordActions")
  @js.native
  def recordActions(
    subject: IAnyStateTreeNode,
    filter: js.Function2[
      /* action */ ISerializedActionCall, 
      /* actionContext */ js.UndefOr[IActionContext], 
      Boolean
    ]
  ): IActionRecorder = js.native
  
  @js.native
  trait IActionRecorder extends StObject {
    
    var actions: js.Array[ISerializedActionCall] = js.native
    
    val recording: Boolean = js.native
    
    def replay(target: IAnyStateTreeNode): Unit = js.native
    
    def resume(): Unit = js.native
    
    def stop(): Unit = js.native
  }
  object IActionRecorder {
    
    @scala.inline
    def apply(
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
    implicit class IActionRecorderMutableBuilder[Self <: IActionRecorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: js.Array[ISerializedActionCall]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsVarargs(value: ISerializedActionCall*): Self = StObject.set(x, "actions", js.Array(value :_*))
      
      @scala.inline
      def setRecording(value: Boolean): Self = StObject.set(x, "recording", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplay(value: IAnyStateTreeNode => Unit): Self = StObject.set(x, "replay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResume(value: () => Unit): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ISerializedActionCall extends StObject {
    
    var args: js.UndefOr[js.Array[_]] = js.native
    
    var name: String = js.native
    
    var path: js.UndefOr[String] = js.native
  }
  object ISerializedActionCall {
    
    @scala.inline
    def apply(name: String): ISerializedActionCall = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISerializedActionCall]
    }
    
    @scala.inline
    implicit class ISerializedActionCallMutableBuilder[Self <: ISerializedActionCall] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[_]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
}
