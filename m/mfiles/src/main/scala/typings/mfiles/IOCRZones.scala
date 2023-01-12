package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOCRZones extends StObject {
  
  def Add(Index: Double, OCRZone: IOCRZone): Unit
  
  def Clone(): IOCRZones
  
  val Count: Double
  
  def Item(Index: Double): IOCRZone
  
  def Remove(Index: Double): Unit
}
object IOCRZones {
  
  inline def apply(
    Add: (Double, IOCRZone) => Unit,
    Clone: () => IOCRZones,
    Count: Double,
    Item: Double => IOCRZone,
    Remove: Double => Unit
  ): IOCRZones = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IOCRZones]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IOCRZones] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: (Double, IOCRZone) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    inline def setClone(value: () => IOCRZones): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IOCRZone): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
