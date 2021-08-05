package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFolderNameListing extends StObject {
  
  val Count: Double
  
  def Item(Index: Double): ITypedValue
  
  val MoreValues: Boolean
  
  def SortWithExpression(Expression: IExpression, Locale: Double): Unit
}
object IFolderNameListing {
  
  inline def apply(
    Count: Double,
    Item: Double => ITypedValue,
    MoreValues: Boolean,
    SortWithExpression: (IExpression, Double) => Unit
  ): IFolderNameListing = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), MoreValues = MoreValues.asInstanceOf[js.Any], SortWithExpression = js.Any.fromFunction2(SortWithExpression))
    __obj.asInstanceOf[IFolderNameListing]
  }
  
  extension [Self <: IFolderNameListing](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => ITypedValue): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setMoreValues(value: Boolean): Self = StObject.set(x, "MoreValues", value.asInstanceOf[js.Any])
    
    inline def setSortWithExpression(value: (IExpression, Double) => Unit): Self = StObject.set(x, "SortWithExpression", js.Any.fromFunction2(value))
  }
}
