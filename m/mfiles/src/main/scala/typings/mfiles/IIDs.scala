package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IIDs extends StObject {
  
  def Add(Index: Double, ID: Double): Unit = js.native
  
  def Clone(): IIDs = js.native
  
  val Count: Double = js.native
  
  def IndexOf(ID: Double): Double = js.native
  
  def Item(Index: Double): Double = js.native
  
  def Remove(Index: Double): Unit = js.native
  
  def RemoveAll(ID: Double): Double = js.native
}
object IIDs {
  
  @scala.inline
  def apply(
    Add: (Double, Double) => Unit,
    Clone: () => IIDs,
    Count: Double,
    IndexOf: Double => Double,
    Item: Double => Double,
    Remove: Double => Unit,
    RemoveAll: Double => Double
  ): IIDs = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], IndexOf = js.Any.fromFunction1(IndexOf), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove), RemoveAll = js.Any.fromFunction1(RemoveAll))
    __obj.asInstanceOf[IIDs]
  }
  
  @scala.inline
  implicit class IIDsMutableBuilder[Self <: IIDs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (Double, Double) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClone(value: () => IIDs): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexOf(value: Double => Double): Self = StObject.set(x, "IndexOf", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItem(value: Double => Double): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveAll(value: Double => Double): Self = StObject.set(x, "RemoveAll", js.Any.fromFunction1(value))
  }
}
