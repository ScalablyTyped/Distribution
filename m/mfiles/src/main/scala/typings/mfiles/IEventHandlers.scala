package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEventHandlers extends StObject {
  
  def Add(Index: Double, EventHandler: IEventHandler): Unit
  
  def Clone(): IEventHandlers
  
  val Count: Double
  
  def GetIndexByGUID(EventHandlerGUID: String): Double
  
  def Item(Index: Double): IEventHandler
  
  def Remove(Index: Double): Unit
}
object IEventHandlers {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: IEventHandlers] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: (Double, IEventHandler) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    inline def setClone(value: () => IEventHandlers): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setGetIndexByGUID(value: String => Double): Self = StObject.set(x, "GetIndexByGUID", js.Any.fromFunction1(value))
    
    inline def setItem(value: Double => IEventHandler): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
