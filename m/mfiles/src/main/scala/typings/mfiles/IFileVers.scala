package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFileVers extends StObject {
  
  def Add(Index: Double, FileVer: IFileVer): Unit = js.native
  
  def Clone(): IFileVers = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): IFileVer = js.native
  
  def Remove(Index: Double): Unit = js.native
}
object IFileVers {
  
  @scala.inline
  def apply(
    Add: (Double, IFileVer) => Unit,
    Clone: () => IFileVers,
    Count: Double,
    Item: Double => IFileVer,
    Remove: Double => Unit
  ): IFileVers = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IFileVers]
  }
  
  @scala.inline
  implicit class IFileVersMutableBuilder[Self <: IFileVers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (Double, IFileVer) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClone(value: () => IFileVers): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => IFileVer): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
