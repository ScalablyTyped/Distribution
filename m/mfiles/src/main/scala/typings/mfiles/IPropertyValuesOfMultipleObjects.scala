package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPropertyValuesOfMultipleObjects extends StObject {
  
  def Clone(): IPropertyValuesOfMultipleObjects
  
  val Count: Double
  
  def Item(Index: Double): IPropertyValues
}
object IPropertyValuesOfMultipleObjects {
  
  @scala.inline
  def apply(Clone: () => IPropertyValuesOfMultipleObjects, Count: Double, Item: Double => IPropertyValues): IPropertyValuesOfMultipleObjects = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IPropertyValuesOfMultipleObjects]
  }
  
  @scala.inline
  implicit class IPropertyValuesOfMultipleObjectsMutableBuilder[Self <: IPropertyValuesOfMultipleObjects] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IPropertyValuesOfMultipleObjects): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => IPropertyValues): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
