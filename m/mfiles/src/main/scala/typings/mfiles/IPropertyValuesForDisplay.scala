package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPropertyValuesForDisplay extends StObject {
  
  val Count: Double
  
  def Item(Index: Double): IPropertyValueForDisplay
}
object IPropertyValuesForDisplay {
  
  inline def apply(Count: Double, Item: Double => IPropertyValueForDisplay): IPropertyValuesForDisplay = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IPropertyValuesForDisplay]
  }
  
  extension [Self <: IPropertyValuesForDisplay](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IPropertyValueForDisplay): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
