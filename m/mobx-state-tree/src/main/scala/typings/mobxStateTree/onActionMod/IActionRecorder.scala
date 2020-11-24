package typings.mobxStateTree.onActionMod

import typings.mobxStateTree.nodeUtilsMod.IAnyStateTreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IActionRecorder extends js.Object {
  
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
  implicit class IActionRecorderOps[Self <: IActionRecorder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActionsVarargs(value: ISerializedActionCall*): Self = this.set("actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: js.Array[ISerializedActionCall]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecording(value: Boolean): Self = this.set("recording", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplay(value: IAnyStateTreeNode => Unit): Self = this.set("replay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResume(value: () => Unit): Self = this.set("resume", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
  }
}
