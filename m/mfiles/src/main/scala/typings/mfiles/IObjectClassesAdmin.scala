package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObjectClassesAdmin extends StObject {
  
  def Add(Index: Double, ObjectClassAdmin: IObjectClassAdmin): Unit = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): IObjectClassAdmin = js.native
  
  def Remove(Index: Double): Unit = js.native
}
object IObjectClassesAdmin {
  
  @scala.inline
  def apply(
    Add: (Double, IObjectClassAdmin) => Unit,
    Count: Double,
    Item: Double => IObjectClassAdmin,
    Remove: Double => Unit
  ): IObjectClassesAdmin = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IObjectClassesAdmin]
  }
  
  @scala.inline
  implicit class IObjectClassesAdminMutableBuilder[Self <: IObjectClassesAdmin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (Double, IObjectClassAdmin) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => IObjectClassAdmin): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
