package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFolderDefs extends StObject {
  
  def Add(Index: Double, FolderDef: IFolderDef): Unit
  
  def Clone(): IFolderDefs
  
  val Count: Double
  
  def Item(Index: Double): IFolderDef
  
  def Remove(Index: Double): Unit
}
object IFolderDefs {
  
  inline def apply(
    Add: (Double, IFolderDef) => Unit,
    Clone: () => IFolderDefs,
    Count: Double,
    Item: Double => IFolderDef,
    Remove: Double => Unit
  ): IFolderDefs = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IFolderDefs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IFolderDefs] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: (Double, IFolderDef) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    inline def setClone(value: () => IFolderDefs): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IFolderDef): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
