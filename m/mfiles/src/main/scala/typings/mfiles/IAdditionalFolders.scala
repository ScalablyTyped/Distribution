package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAdditionalFolders extends StObject {
  
  def Add(Index: Double, AdditionalFolder: IAdditionalFolder): Unit
  
  def Clone(): IAdditionalFolders
  
  val Count: Double
  
  def Item(Index: Double): IAdditionalFolder
  
  def Remove(Index: Double): Unit
}
object IAdditionalFolders {
  
  inline def apply(
    Add: (Double, IAdditionalFolder) => Unit,
    Clone: () => IAdditionalFolders,
    Count: Double,
    Item: Double => IAdditionalFolder,
    Remove: Double => Unit
  ): IAdditionalFolders = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IAdditionalFolders]
  }
  
  extension [Self <: IAdditionalFolders](x: Self) {
    
    inline def setAdd(value: (Double, IAdditionalFolder) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    inline def setClone(value: () => IAdditionalFolders): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IAdditionalFolder): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
