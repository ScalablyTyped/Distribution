package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAccessControlListComponentKeys extends StObject {
  
  def Clone(): IAccessControlListComponentKeys
  
  val Count: Double
  
  def Item(Index: Double): IAccessControlListComponentKey
}
object IAccessControlListComponentKeys {
  
  inline def apply(
    Clone: () => IAccessControlListComponentKeys,
    Count: Double,
    Item: Double => IAccessControlListComponentKey
  ): IAccessControlListComponentKeys = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IAccessControlListComponentKeys]
  }
  
  extension [Self <: IAccessControlListComponentKeys](x: Self) {
    
    inline def setClone(value: () => IAccessControlListComponentKeys): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IAccessControlListComponentKey): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
