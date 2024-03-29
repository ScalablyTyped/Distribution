package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUserGroupsAdmin extends StObject {
  
  val Count: Double
  
  def Item(Index: Double): IUserGroupAdmin
}
object IUserGroupsAdmin {
  
  inline def apply(Count: Double, Item: Double => IUserGroupAdmin): IUserGroupsAdmin = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IUserGroupsAdmin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IUserGroupsAdmin] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IUserGroupAdmin): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
