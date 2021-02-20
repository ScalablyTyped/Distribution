package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISetPropertiesParamsOfMultipleObjects extends StObject {
  
  def Add(Index: Double, SetPropertiesParams: ISetPropertiesParams): Unit = js.native
  
  def Clone(): ISetPropertiesParamsOfMultipleObjects = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): ISetPropertiesParams = js.native
  
  def Remove(Index: Double): Unit = js.native
}
object ISetPropertiesParamsOfMultipleObjects {
  
  @scala.inline
  def apply(
    Add: (Double, ISetPropertiesParams) => Unit,
    Clone: () => ISetPropertiesParamsOfMultipleObjects,
    Count: Double,
    Item: Double => ISetPropertiesParams,
    Remove: Double => Unit
  ): ISetPropertiesParamsOfMultipleObjects = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[ISetPropertiesParamsOfMultipleObjects]
  }
  
  @scala.inline
  implicit class ISetPropertiesParamsOfMultipleObjectsMutableBuilder[Self <: ISetPropertiesParamsOfMultipleObjects] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (Double, ISetPropertiesParams) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClone(value: () => ISetPropertiesParamsOfMultipleObjects): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => ISetPropertiesParams): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
