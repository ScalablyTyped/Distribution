package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectClassesAdmin extends js.Object {
  val Count: Double
  def Add(Index: Double, ObjectClassAdmin: IObjectClassAdmin): Unit
  def Item(Index: Double): IObjectClassAdmin
  def Remove(Index: Double): Unit
}

object IObjectClassesAdmin {
  @scala.inline
  def apply(
    Add: (Double, IObjectClassAdmin) => Unit,
    Count: Double,
    Item: Double => IObjectClassAdmin,
    Remove: Double => Unit
  ): IObjectClassesAdmin = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Count = Count, Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IObjectClassesAdmin]
  }
}

