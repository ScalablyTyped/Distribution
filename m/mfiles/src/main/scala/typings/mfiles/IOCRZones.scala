package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOCRZones extends StObject {
  
  def Add(Index: Double, OCRZone: IOCRZone): Unit = js.native
  
  def Clone(): IOCRZones = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): IOCRZone = js.native
  
  def Remove(Index: Double): Unit = js.native
}
object IOCRZones {
  
  @scala.inline
  def apply(
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
  implicit class IOCRZonesMutableBuilder[Self <: IOCRZones] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (Double, IOCRZone) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClone(value: () => IOCRZones): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => IOCRZone): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
