package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICollection extends StObject {
  
  def Clear(): Unit
  
  val Count: Double
  
  val Events: IEvents
  
  def Find(item: Any): Double
  
  def GetAt(pos: Double): Any
  
  def MoveTo(pos: Double, newPos: Double): Unit
  
  def NewTo(pos: Double, replace: Boolean): Any
  
  def PutTo(pos: Double, replace: Boolean, item: Any): Unit
  
  def RemoveAt(pos: Double): Unit
}
object ICollection {
  
  inline def apply(
    Clear: () => Unit,
    Count: Double,
    Events: IEvents,
    Find: Any => Double,
    GetAt: Double => Any,
    MoveTo: (Double, Double) => Unit,
    NewTo: (Double, Boolean) => Any,
    PutTo: (Double, Boolean, Any) => Unit,
    RemoveAt: Double => Unit
  ): ICollection = {
    val __obj = js.Dynamic.literal(Clear = js.Any.fromFunction0(Clear), Count = Count.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], Find = js.Any.fromFunction1(Find), GetAt = js.Any.fromFunction1(GetAt), MoveTo = js.Any.fromFunction2(MoveTo), NewTo = js.Any.fromFunction2(NewTo), PutTo = js.Any.fromFunction3(PutTo), RemoveAt = js.Any.fromFunction1(RemoveAt))
    __obj.asInstanceOf[ICollection]
  }
  
  extension [Self <: ICollection](x: Self) {
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "Clear", js.Any.fromFunction0(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: IEvents): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setFind(value: Any => Double): Self = StObject.set(x, "Find", js.Any.fromFunction1(value))
    
    inline def setGetAt(value: Double => Any): Self = StObject.set(x, "GetAt", js.Any.fromFunction1(value))
    
    inline def setMoveTo(value: (Double, Double) => Unit): Self = StObject.set(x, "MoveTo", js.Any.fromFunction2(value))
    
    inline def setNewTo(value: (Double, Boolean) => Any): Self = StObject.set(x, "NewTo", js.Any.fromFunction2(value))
    
    inline def setPutTo(value: (Double, Boolean, Any) => Unit): Self = StObject.set(x, "PutTo", js.Any.fromFunction3(value))
    
    inline def setRemoveAt(value: Double => Unit): Self = StObject.set(x, "RemoveAt", js.Any.fromFunction1(value))
  }
}
