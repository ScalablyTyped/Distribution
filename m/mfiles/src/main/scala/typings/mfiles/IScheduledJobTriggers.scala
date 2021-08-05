package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IScheduledJobTriggers extends StObject {
  
  def Add(Index: Double, ScheduledJobTrigger: IScheduledJobTrigger): Unit
  
  def Clone(): IScheduledJobTriggers
  
  val Count: Double
  
  def Item(Index: Double): IScheduledJobTrigger
  
  def Remove(Index: Double): Unit
}
object IScheduledJobTriggers {
  
  inline def apply(
    Add: (Double, IScheduledJobTrigger) => Unit,
    Clone: () => IScheduledJobTriggers,
    Count: Double,
    Item: Double => IScheduledJobTrigger,
    Remove: Double => Unit
  ): IScheduledJobTriggers = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IScheduledJobTriggers]
  }
  
  extension [Self <: IScheduledJobTriggers](x: Self) {
    
    inline def setAdd(value: (Double, IScheduledJobTrigger) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    inline def setClone(value: () => IScheduledJobTriggers): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IScheduledJobTrigger): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
