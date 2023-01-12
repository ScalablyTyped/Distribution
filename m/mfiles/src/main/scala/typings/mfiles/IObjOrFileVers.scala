package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjOrFileVers extends StObject {
  
  def Add(Index: Double, ObjOrFileVer: IObjOrFileVer): Unit
  
  def Clone(): IObjOrFileVers
  
  val Count: Double
  
  def Item(Index: Double): IObjOrFileVer
  
  def Remove(Index: Double): Unit
}
object IObjOrFileVers {
  
  inline def apply(
    Add: (Double, IObjOrFileVer) => Unit,
    Clone: () => IObjOrFileVers,
    Count: Double,
    Item: Double => IObjOrFileVer,
    Remove: Double => Unit
  ): IObjOrFileVers = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IObjOrFileVers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IObjOrFileVers] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: (Double, IObjOrFileVer) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    inline def setClone(value: () => IObjOrFileVers): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IObjOrFileVer): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
