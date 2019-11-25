package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileClasses extends js.Object {
  val Count: Double
  def Add(Index: Double, FileClass: IFileClass): Unit
  def Clone(): IFileClasses
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
}

