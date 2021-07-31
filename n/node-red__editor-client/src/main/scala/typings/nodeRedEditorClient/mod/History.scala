package typings.nodeRedEditorClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait History extends StObject {
  
  def clear(): Unit
  
  def depth(): Double
  
  def list(): js.Array[HistoryEvent]
  
  def listRedo(): js.Array[HistoryEvent]
  
  def markAllDirty(): Unit
  
  def peek(): HistoryEvent
  
  def pop(): Unit
  
  def push(ev: HistoryEvent): Unit
  
  def redo(): Unit
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
  implicit class HistoryMutableBuilder[Self <: History] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDepth(value: () => Double): Self = StObject.set(x, "depth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setList(value: () => js.Array[HistoryEvent]): Self = StObject.set(x, "list", js.Any.fromFunction0(value))
    
    @scala.inline
    def setListRedo(value: () => js.Array[HistoryEvent]): Self = StObject.set(x, "listRedo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMarkAllDirty(value: () => Unit): Self = StObject.set(x, "markAllDirty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPeek(value: () => HistoryEvent): Self = StObject.set(x, "peek", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPop(value: () => Unit): Self = StObject.set(x, "pop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPush(value: HistoryEvent => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRedo(value: () => Unit): Self = StObject.set(x, "redo", js.Any.fromFunction0(value))
  }
}
