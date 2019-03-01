package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectClasses extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, ObjectClass: IObjectClass): scala.Unit
  def Clone(): IObjectClasses
  def Item(Index: scala.Double): IObjectClass
  def Remove(Index: scala.Double): scala.Unit
}

object IObjectClasses {
  @scala.inline
  def apply(
    Add: js.Function2[scala.Double, IObjectClass, scala.Unit],
    Clone: js.Function0[IObjectClasses],
    Count: scala.Double,
    Item: js.Function1[scala.Double, IObjectClass],
    Remove: js.Function1[scala.Double, scala.Unit]
  ): IObjectClasses = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Add")(Add)
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("Item")(Item)
    __obj.updateDynamic("Remove")(Remove)
    __obj.asInstanceOf[IObjectClasses]
  }
}

