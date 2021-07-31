package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStrings extends StObject {
  
  def Add(Index: Double, Item: String): Unit
  
  def Clone(): IStrings
  
  def CloneFrom(Strings: IStrings): Unit
  
  val Count: Double
  
  def Item(Index: Double): String
  
  def Join(Separator: String): String
  
  def Remove(Index: Double): Unit
}
object IStrings {
  
  @scala.inline
  def apply(
    Add: (Double, String) => Unit,
    Clone: () => IStrings,
    CloneFrom: IStrings => Unit,
    Count: Double,
    Item: Double => String,
    Join: String => String,
    Remove: Double => Unit
  ): IStrings = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Join = js.Any.fromFunction1(Join), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IStrings]
  }
  
  @scala.inline
  implicit class IStringsMutableBuilder[Self <: IStrings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (Double, String) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClone(value: () => IStrings): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCloneFrom(value: IStrings => Unit): Self = StObject.set(x, "CloneFrom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => String): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setJoin(value: String => String): Self = StObject.set(x, "Join", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
