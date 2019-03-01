package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectVersionAndPropertiesOfMultipleObjects extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, ObjectVersionAndProperties: IObjectVersionAndProperties): scala.Unit
  def Clone(): IObjectVersionAndPropertiesOfMultipleObjects
  def Item(Index: scala.Double): IObjectVersionAndProperties
  def Remove(Index: scala.Double): scala.Unit
}

object IObjectVersionAndPropertiesOfMultipleObjects {
  @scala.inline
  def apply(
    Add: js.Function2[scala.Double, IObjectVersionAndProperties, scala.Unit],
    Clone: js.Function0[IObjectVersionAndPropertiesOfMultipleObjects],
    Count: scala.Double,
    Item: js.Function1[scala.Double, IObjectVersionAndProperties],
    Remove: js.Function1[scala.Double, scala.Unit]
  ): IObjectVersionAndPropertiesOfMultipleObjects = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Add")(Add)
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("Item")(Item)
    __obj.updateDynamic("Remove")(Remove)
    __obj.asInstanceOf[IObjectVersionAndPropertiesOfMultipleObjects]
  }
}

