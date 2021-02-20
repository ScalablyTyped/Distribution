package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObjectTypeColumnMappings extends StObject {
  
  def Add(Index: Double, ObjectTypeColumnMapping: IObjectTypeColumnMapping): Unit = js.native
  
  def Clone(): IObjectTypeColumnMappings = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): IObjectTypeColumnMapping = js.native
  
  def Remove(Index: Double): Unit = js.native
}
object IObjectTypeColumnMappings {
  
  @scala.inline
  def apply(
    Add: (Double, IObjectTypeColumnMapping) => Unit,
    Clone: () => IObjectTypeColumnMappings,
    Count: Double,
    Item: Double => IObjectTypeColumnMapping,
    Remove: Double => Unit
  ): IObjectTypeColumnMappings = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IObjectTypeColumnMappings]
  }
  
  @scala.inline
  implicit class IObjectTypeColumnMappingsMutableBuilder[Self <: IObjectTypeColumnMappings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (Double, IObjectTypeColumnMapping) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClone(value: () => IObjectTypeColumnMappings): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => IObjectTypeColumnMapping): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
