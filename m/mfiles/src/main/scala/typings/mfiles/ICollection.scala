package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICollection extends StObject {
  
  def Clear(): Unit = js.native
  
  val Count: Double = js.native
  
  val Events: IEvents = js.native
  
  def Find(item: js.Any): Double = js.native
  
  def GetAt(pos: Double): js.Any = js.native
  
  def MoveTo(pos: Double, newPos: Double): Unit = js.native
  
  def NewTo(pos: Double, replace: Boolean): js.Any = js.native
  
  def PutTo(pos: Double, replace: Boolean, item: js.Any): Unit = js.native
  
  def RemoveAt(pos: Double): Unit = js.native
}
object ICollection {
  
  @scala.inline
  def apply(
    Clear: () => Unit,
    Count: Double,
    Events: IEvents,
    Find: js.Any => Double,
    GetAt: Double => js.Any,
    MoveTo: (Double, Double) => Unit,
    NewTo: (Double, Boolean) => js.Any,
    PutTo: (Double, Boolean, js.Any) => Unit,
    RemoveAt: Double => Unit
  ): ICollection = {
    val __obj = js.Dynamic.literal(Clear = js.Any.fromFunction0(Clear), Count = Count.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], Find = js.Any.fromFunction1(Find), GetAt = js.Any.fromFunction1(GetAt), MoveTo = js.Any.fromFunction2(MoveTo), NewTo = js.Any.fromFunction2(NewTo), PutTo = js.Any.fromFunction3(PutTo), RemoveAt = js.Any.fromFunction1(RemoveAt))
    __obj.asInstanceOf[ICollection]
  }
  
  @scala.inline
  implicit class ICollectionMutableBuilder[Self <: ICollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "Clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvents(value: IEvents): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFind(value: js.Any => Double): Self = StObject.set(x, "Find", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAt(value: Double => js.Any): Self = StObject.set(x, "GetAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMoveTo(value: (Double, Double) => Unit): Self = StObject.set(x, "MoveTo", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNewTo(value: (Double, Boolean) => js.Any): Self = StObject.set(x, "NewTo", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPutTo(value: (Double, Boolean, js.Any) => Unit): Self = StObject.set(x, "PutTo", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRemoveAt(value: Double => Unit): Self = StObject.set(x, "RemoveAt", js.Any.fromFunction1(value))
  }
}
