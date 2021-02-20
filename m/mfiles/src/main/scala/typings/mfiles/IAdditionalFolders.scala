package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAdditionalFolders extends StObject {
  
  def Add(Index: Double, AdditionalFolder: IAdditionalFolder): Unit = js.native
  
  def Clone(): IAdditionalFolders = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): IAdditionalFolder = js.native
  
  def Remove(Index: Double): Unit = js.native
}
object IAdditionalFolders {
  
  @scala.inline
  def apply(
    Add: (Double, IAdditionalFolder) => Unit,
    Clone: () => IAdditionalFolders,
    Count: Double,
    Item: Double => IAdditionalFolder,
    Remove: Double => Unit
  ): IAdditionalFolders = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IAdditionalFolders]
  }
  
  @scala.inline
  implicit class IAdditionalFoldersMutableBuilder[Self <: IAdditionalFolders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (Double, IAdditionalFolder) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClone(value: () => IAdditionalFolders): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => IAdditionalFolder): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
