package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFolderDefs extends StObject {
  
  def Add(Index: Double, FolderDef: IFolderDef): Unit = js.native
  
  def Clone(): IFolderDefs = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): IFolderDef = js.native
  
  def Remove(Index: Double): Unit = js.native
}
object IFolderDefs {
  
  @scala.inline
  def apply(
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
  implicit class IFolderDefsMutableBuilder[Self <: IFolderDefs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (Double, IFolderDef) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClone(value: () => IFolderDefs): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => IFolderDef): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
