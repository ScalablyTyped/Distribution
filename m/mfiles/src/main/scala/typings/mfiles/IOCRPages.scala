package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOCRPages extends StObject {
  
  def Add(Index: Double, OCRPage: IOCRPage): Unit
  
  def Clone(): IOCRPages
  
  val Count: Double
  
  def Item(Index: Double): IOCRPage
  
  def Remove(Index: Double): Unit
}
object IOCRPages {
  
  inline def apply(
    Add: (Double, IOCRPage) => Unit,
    Clone: () => IOCRPages,
    Count: Double,
    Item: Double => IOCRPage,
    Remove: Double => Unit
  ): IOCRPages = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IOCRPages]
  }
  
  extension [Self <: IOCRPages](x: Self) {
    
    inline def setAdd(value: (Double, IOCRPage) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    inline def setClone(value: () => IOCRPages): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IOCRPage): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
