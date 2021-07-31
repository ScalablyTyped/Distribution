package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAccessControlLists extends StObject {
  
  val Count: Double
  
  def Item(Index: Double): IAccessControlList
}
object IAccessControlLists {
  
  @scala.inline
  def apply(Count: Double, Item: Double => IAccessControlList): IAccessControlLists = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IAccessControlLists]
  }
  
  @scala.inline
  implicit class IAccessControlListsMutableBuilder[Self <: IAccessControlLists] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => IAccessControlList): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
