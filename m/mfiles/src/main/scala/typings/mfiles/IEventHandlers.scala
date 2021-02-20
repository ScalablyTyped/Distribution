package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEventHandlers extends StObject {
  
  def Add(Index: Double, EventHandler: IEventHandler): Unit = js.native
  
  def Clone(): IEventHandlers = js.native
  
  val Count: Double = js.native
  
  def GetIndexByGUID(EventHandlerGUID: String): Double = js.native
  
  def Item(Index: Double): IEventHandler = js.native
  
  def Remove(Index: Double): Unit = js.native
}
object IEventHandlers {
  
  @scala.inline
  def apply(
    Add: (Double, IEventHandler) => Unit,
    Clone: () => IEventHandlers,
    Count: Double,
    GetIndexByGUID: String => Double,
    Item: Double => IEventHandler,
    Remove: Double => Unit
  ): IEventHandlers = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], GetIndexByGUID = js.Any.fromFunction1(GetIndexByGUID), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IEventHandlers]
  }
  
  @scala.inline
  implicit class IEventHandlersMutableBuilder[Self <: IEventHandlers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (Double, IEventHandler) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClone(value: () => IEventHandlers): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetIndexByGUID(value: String => Double): Self = StObject.set(x, "GetIndexByGUID", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItem(value: Double => IEventHandler): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
