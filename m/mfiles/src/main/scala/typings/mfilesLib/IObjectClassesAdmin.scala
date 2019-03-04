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
    Add: js.Function2[scala.Double, IObjectClassAdmin, scala.Unit],
    Count: scala.Double,
    Item: js.Function1[scala.Double, IObjectClassAdmin],
    Remove: js.Function1[scala.Double, scala.Unit]
  ): IObjectClassesAdmin = {
    val __obj = js.Dynamic.literal(Add = Add, Count = Count, Item = Item, Remove = Remove)
  
    __obj.asInstanceOf[IObjectClassesAdmin]
  }
}

