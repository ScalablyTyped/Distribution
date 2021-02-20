package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObjectVersionAndPropertiesOfMultipleObjects extends StObject {
  
  def Add(Index: Double, ObjectVersionAndProperties: IObjectVersionAndProperties): Unit = js.native
  
  def Clone(): IObjectVersionAndPropertiesOfMultipleObjects = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): IObjectVersionAndProperties = js.native
  
  def Remove(Index: Double): Unit = js.native
}
object IObjectVersionAndPropertiesOfMultipleObjects {
  
  @scala.inline
  def apply(
    Add: (Double, IObjectVersionAndProperties) => Unit,
    Clone: () => IObjectVersionAndPropertiesOfMultipleObjects,
    Count: Double,
    Item: Double => IObjectVersionAndProperties,
    Remove: Double => Unit
  ): IObjectVersionAndPropertiesOfMultipleObjects = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IObjectVersionAndPropertiesOfMultipleObjects]
  }
  
  @scala.inline
  implicit class IObjectVersionAndPropertiesOfMultipleObjectsMutableBuilder[Self <: IObjectVersionAndPropertiesOfMultipleObjects] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (Double, IObjectVersionAndProperties) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClone(value: () => IObjectVersionAndPropertiesOfMultipleObjects): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => IObjectVersionAndProperties): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
