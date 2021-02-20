package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPropertyValuesForDisplay extends StObject {
  
  val Count: Double = js.native
  
  def Item(Index: Double): IPropertyValueForDisplay = js.native
}
object IPropertyValuesForDisplay {
  
  @scala.inline
  def apply(Count: Double, Item: Double => IPropertyValueForDisplay): IPropertyValuesForDisplay = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IPropertyValuesForDisplay]
  }
  
  @scala.inline
  implicit class IPropertyValuesForDisplayMutableBuilder[Self <: IPropertyValuesForDisplay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => IPropertyValueForDisplay): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
