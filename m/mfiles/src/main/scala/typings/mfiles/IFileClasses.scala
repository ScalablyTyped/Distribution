package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFileClasses extends StObject {
  
  def Add(Index: Double, FileClass: IFileClass): Unit
  
  def Clone(): IFileClasses
  
  val Count: Double
  
  def Item(Index: Double): IFileClass
  
  def Remove(Index: Double): Unit
}
object IFileClasses {
  
  @scala.inline
  def apply(
    Add: (Double, IFileClass) => Unit,
    Clone: () => IFileClasses,
    Count: Double,
    Item: Double => IFileClass,
    Remove: Double => Unit
  ): IFileClasses = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IFileClasses]
  }
  
  @scala.inline
  implicit class IFileClassesMutableBuilder[Self <: IFileClasses] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (Double, IFileClass) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClone(value: () => IFileClasses): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => IFileClass): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
