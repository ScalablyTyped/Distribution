package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScheduledJobTriggers extends StObject {
  
  def Add(Index: Double, ScheduledJobTrigger: IScheduledJobTrigger): Unit = js.native
  
  def Clone(): IScheduledJobTriggers = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): IScheduledJobTrigger = js.native
  
  def Remove(Index: Double): Unit = js.native
}
object IScheduledJobTriggers {
  
  @scala.inline
  def apply(
    Add: (Double, IScheduledJobTrigger) => Unit,
    Clone: () => IScheduledJobTriggers,
    Count: Double,
    Item: Double => IScheduledJobTrigger,
    Remove: Double => Unit
  ): IScheduledJobTriggers = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IScheduledJobTriggers]
  }
  
  @scala.inline
  implicit class IScheduledJobTriggersMutableBuilder[Self <: IScheduledJobTriggers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (Double, IScheduledJobTrigger) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClone(value: () => IScheduledJobTriggers): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => IScheduledJobTrigger): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
