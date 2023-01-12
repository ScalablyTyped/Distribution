package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IViews extends StObject {
  
  val Count: Double
  
  def Item(Index: Double): IView
}
object IViews {
  
  inline def apply(Count: Double, Item: Double => IView): IViews = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IViews]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IViews] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IView): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
