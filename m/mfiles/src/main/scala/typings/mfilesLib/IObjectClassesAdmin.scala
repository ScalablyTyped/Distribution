package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectClassesAdmin extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, ObjectClassAdmin: IObjectClassAdmin): scala.Unit
  def Item(Index: scala.Double): IObjectClassAdmin
  def Remove(Index: scala.Double): scala.Unit
}

object IObjectClassesAdmin {
  @scala.inline
  def apply(
    Add: (scala.Double, IObjectClassAdmin) => scala.Unit,
    Count: scala.Double,
    Item: scala.Double => IObjectClassAdmin,
    Remove: scala.Double => scala.Unit
  ): IObjectClassesAdmin = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Count = Count, Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IObjectClassesAdmin]
  }
}

