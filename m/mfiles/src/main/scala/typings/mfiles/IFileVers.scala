package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFileVers extends StObject {
  
  def Add(Index: Double, FileVer: IFileVer): Unit
  
  def Clone(): IFileVers
  
  val Count: Double
  
  def Item(Index: Double): IFileVer
  
  def Remove(Index: Double): Unit
}
object IFileVers {
  
  inline def apply(
    Add: (Double, IFileVer) => Unit,
    Clone: () => IFileVers,
    Count: Double,
    Item: Double => IFileVer,
    Remove: Double => Unit
  ): IFileVers = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IFileVers]
  }
  
  extension [Self <: IFileVers](x: Self) {
    
    inline def setAdd(value: (Double, IFileVer) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    inline def setClone(value: () => IFileVers): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IFileVer): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
