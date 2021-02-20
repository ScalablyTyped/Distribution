package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPropertyValuesWithIconCluesOfMultipleObjects extends StObject {
  
  def Clone(): IPropertyValuesWithIconCluesOfMultipleObjects = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): IPropertyValuesWithIconClues = js.native
}
object IPropertyValuesWithIconCluesOfMultipleObjects {
  
  @scala.inline
  def apply(
    Clone: () => IPropertyValuesWithIconCluesOfMultipleObjects,
    Count: Double,
    Item: Double => IPropertyValuesWithIconClues
  ): IPropertyValuesWithIconCluesOfMultipleObjects = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IPropertyValuesWithIconCluesOfMultipleObjects]
  }
  
  @scala.inline
  implicit class IPropertyValuesWithIconCluesOfMultipleObjectsMutableBuilder[Self <: IPropertyValuesWithIconCluesOfMultipleObjects] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IPropertyValuesWithIconCluesOfMultipleObjects): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => IPropertyValuesWithIconClues): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
