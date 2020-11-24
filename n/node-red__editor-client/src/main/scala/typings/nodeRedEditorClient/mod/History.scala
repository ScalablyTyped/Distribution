package typings.nodeRedEditorClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait History extends js.Object {
  
  def clear(): Unit = js.native
  
  def depth(): Double = js.native
  
  def list(): js.Array[HistoryEvent] = js.native
  
  def listRedo(): js.Array[HistoryEvent] = js.native
  
  def markAllDirty(): Unit = js.native
  
  def peek(): HistoryEvent = js.native
  
  def pop(): Unit = js.native
  
  def push(ev: HistoryEvent): Unit = js.native
  
  def redo(): Unit = js.native
}
object History {
  
  @scala.inline
  def apply(
    clear: () => Unit,
    depth: () => Double,
    list: () => js.Array[HistoryEvent],
    listRedo: () => js.Array[HistoryEvent],
    markAllDirty: () => Unit,
    peek: () => HistoryEvent,
    pop: () => Unit,
    push: HistoryEvent => Unit,
    redo: () => Unit
  ): History = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), depth = js.Any.fromFunction0(depth), list = js.Any.fromFunction0(list), listRedo = js.Any.fromFunction0(listRedo), markAllDirty = js.Any.fromFunction0(markAllDirty), peek = js.Any.fromFunction0(peek), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), redo = js.Any.fromFunction0(redo))
    __obj.asInstanceOf[History]
  }
  
  @scala.inline
  implicit class HistoryOps[Self <: History] (val x: Self) extends AnyVal {
    
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
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDepth(value: () => Double): Self = this.set("depth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setList(value: () => js.Array[HistoryEvent]): Self = this.set("list", js.Any.fromFunction0(value))
    
    @scala.inline
    def setListRedo(value: () => js.Array[HistoryEvent]): Self = this.set("listRedo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMarkAllDirty(value: () => Unit): Self = this.set("markAllDirty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPeek(value: () => HistoryEvent): Self = this.set("peek", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPop(value: () => Unit): Self = this.set("pop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPush(value: HistoryEvent => Unit): Self = this.set("push", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRedo(value: () => Unit): Self = this.set("redo", js.Any.fromFunction0(value))
  }
}
