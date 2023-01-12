package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClassGroups extends StObject {
  
  def Clone(): IClassGroups
  
  val Count: Double
  
  def Item(Index: Double): IClassGroup
}
object IClassGroups {
  
  inline def apply(Clone: () => IClassGroups, Count: Double, Item: Double => IClassGroup): IClassGroups = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IClassGroups]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IClassGroups] (val x: Self) extends AnyVal {
    
    inline def setClone(value: () => IClassGroups): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IClassGroup): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
