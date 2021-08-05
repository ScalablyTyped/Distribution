package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectTypeTargetsForBrowsing extends StObject {
  
  def Add(Index: Double, ObjectTypeTargetForBrowsing: IObjectTypeTargetForBrowsing): Unit
  
  def Clone(): IObjectTypeTargetsForBrowsing
  
  val Count: Double
  
  def Item(Index: Double): IObjectTypeTargetForBrowsing
  
  def Remove(Index: Double): Unit
}
object IObjectTypeTargetsForBrowsing {
  
  inline def apply(
    Add: (Double, IObjectTypeTargetForBrowsing) => Unit,
    Clone: () => IObjectTypeTargetsForBrowsing,
    Count: Double,
    Item: Double => IObjectTypeTargetForBrowsing,
    Remove: Double => Unit
  ): IObjectTypeTargetsForBrowsing = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IObjectTypeTargetsForBrowsing]
  }
  
  extension [Self <: IObjectTypeTargetsForBrowsing](x: Self) {
    
    inline def setAdd(value: (Double, IObjectTypeTargetForBrowsing) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    inline def setClone(value: () => IObjectTypeTargetsForBrowsing): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IObjectTypeTargetForBrowsing): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
