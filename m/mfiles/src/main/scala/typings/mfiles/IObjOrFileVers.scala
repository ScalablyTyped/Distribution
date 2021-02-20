package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObjOrFileVers extends StObject {
  
  def Add(Index: Double, ObjOrFileVer: IObjOrFileVer): Unit = js.native
  
  def Clone(): IObjOrFileVers = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): IObjOrFileVer = js.native
  
  def Remove(Index: Double): Unit = js.native
}
object IObjOrFileVers {
  
  @scala.inline
  def apply(
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
  implicit class IObjOrFileVersMutableBuilder[Self <: IObjOrFileVers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (Double, IObjOrFileVer) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClone(value: () => IObjOrFileVers): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => IObjOrFileVer): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
