package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectTypes extends StObject {
  
  def Clone(): IObjectTypes
  
  val Count: Double
  
  def Item(Index: Double): IObjectType
}
object IObjectTypes {
  
  inline def apply(Clone: () => IObjectTypes, Count: Double, Item: Double => IObjectType): IObjectTypes = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IObjectTypes]
  }
  
  extension [Self <: IObjectTypes](x: Self) {
    
    inline def setClone(value: () => IObjectTypes): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IObjectType): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
