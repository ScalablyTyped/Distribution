package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDefaultProperties extends StObject {
  
  def Add(Index: Double, DefaultProperty: IDefaultProperty): Unit = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): IDefaultProperty = js.native
  
  def Remove(Index: Double): Unit = js.native
}
object IDefaultProperties {
  
  @scala.inline
  def apply(
    Add: (Double, IDefaultProperty) => Unit,
    Count: Double,
    Item: Double => IDefaultProperty,
    Remove: Double => Unit
  ): IDefaultProperties = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IDefaultProperties]
  }
  
  @scala.inline
  implicit class IDefaultPropertiesMutableBuilder[Self <: IDefaultProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (Double, IDefaultProperty) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => IDefaultProperty): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
