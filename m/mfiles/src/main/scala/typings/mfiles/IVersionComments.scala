package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVersionComments extends StObject {
  
  val Count: Double
  
  def Item(Index: Double): IVersionComment
}
object IVersionComments {
  
  inline def apply(Count: Double, Item: Double => IVersionComment): IVersionComments = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IVersionComments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IVersionComments] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IVersionComment): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
