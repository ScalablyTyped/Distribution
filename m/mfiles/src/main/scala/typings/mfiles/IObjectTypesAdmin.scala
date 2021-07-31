package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectTypesAdmin extends StObject {
  
  val Count: Double
  
  def Item(Index: Double): IObjectTypeAdmin
}
object IObjectTypesAdmin {
  
  @scala.inline
  def apply(Count: Double, Item: Double => IObjectTypeAdmin): IObjectTypesAdmin = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IObjectTypesAdmin]
  }
  
  @scala.inline
  implicit class IObjectTypesAdminMutableBuilder[Self <: IObjectTypesAdmin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => IObjectTypeAdmin): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
