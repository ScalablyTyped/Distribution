package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUserAccounts extends StObject {
  
  val Count: Double
  
  def Item(Index: Double): IUserAccount
}
object IUserAccounts {
  
  inline def apply(Count: Double, Item: Double => IUserAccount): IUserAccounts = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IUserAccounts]
  }
  
  extension [Self <: IUserAccounts](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IUserAccount): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
