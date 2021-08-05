package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPropertyDefsAdmin extends StObject {
  
  val Count: Double
  
  def Item(Index: Double): IPropertyDefAdmin
}
object IPropertyDefsAdmin {
  
  inline def apply(Count: Double, Item: Double => IPropertyDefAdmin): IPropertyDefsAdmin = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IPropertyDefsAdmin]
  }
  
  extension [Self <: IPropertyDefsAdmin](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IPropertyDefAdmin): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
