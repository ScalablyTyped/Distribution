package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObjectTypeTargetsForBrowsing extends StObject {
  
  def Add(Index: Double, ObjectTypeTargetForBrowsing: IObjectTypeTargetForBrowsing): Unit = js.native
  
  def Clone(): IObjectTypeTargetsForBrowsing = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): IObjectTypeTargetForBrowsing = js.native
  
  def Remove(Index: Double): Unit = js.native
}
object IObjectTypeTargetsForBrowsing {
  
  @scala.inline
  def apply(
    Add: (Double, IObjectTypeTargetForBrowsing) => Unit,
    Clone: () => IObjectTypeTargetsForBrowsing,
    Count: Double,
    Item: Double => IObjectTypeTargetForBrowsing,
    Remove: Double => Unit
  ): IObjectTypeTargetsForBrowsing = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IObjectTypeTargetsForBrowsing]
  }
  
  @scala.inline
  implicit class IObjectTypeTargetsForBrowsingMutableBuilder[Self <: IObjectTypeTargetsForBrowsing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (Double, IObjectTypeTargetForBrowsing) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClone(value: () => IObjectTypeTargetsForBrowsing): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => IObjectTypeTargetForBrowsing): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
