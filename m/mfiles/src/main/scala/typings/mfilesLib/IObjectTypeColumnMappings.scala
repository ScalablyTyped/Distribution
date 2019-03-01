package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectTypeColumnMappings extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, ObjectTypeColumnMapping: IObjectTypeColumnMapping): scala.Unit
  def Clone(): IObjectTypeColumnMappings
  def Item(Index: scala.Double): IObjectTypeColumnMapping
  def Remove(Index: scala.Double): scala.Unit
}

object IObjectTypeColumnMappings {
  @scala.inline
  def apply(
    Add: js.Function2[scala.Double, IObjectTypeColumnMapping, scala.Unit],
    Clone: js.Function0[IObjectTypeColumnMappings],
    Count: scala.Double,
    Item: js.Function1[scala.Double, IObjectTypeColumnMapping],
    Remove: js.Function1[scala.Double, scala.Unit]
  ): IObjectTypeColumnMappings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Add")(Add)
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("Item")(Item)
    __obj.updateDynamic("Remove")(Remove)
    __obj.asInstanceOf[IObjectTypeColumnMappings]
  }
}

