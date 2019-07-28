package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectClasses extends js.Object {
  val Count: Double
  def Add(Index: Double, ObjectClass: IObjectClass): Unit
  def Clone(): IObjectClasses
  def Item(Index: Double): IObjectClass
  def Remove(Index: Double): Unit
}

object IObjectClasses {
  @scala.inline
  def apply(
    Add: (Double, IObjectClass) => Unit,
    Clone: () => IObjectClasses,
    Count: Double,
    Item: Double => IObjectClass,
    Remove: Double => Unit
  ): IObjectClasses = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count, Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IObjectClasses]
  }
}

