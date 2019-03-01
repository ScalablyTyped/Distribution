package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClassGroups extends js.Object {
  val Count: scala.Double
  def Clone(): IClassGroups
  def Item(Index: scala.Double): IClassGroup
}

object IClassGroups {
  @scala.inline
  def apply(
    Clone: js.Function0[IClassGroups],
    Count: scala.Double,
    Item: js.Function1[scala.Double, IClassGroup]
  ): IClassGroups = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("Item")(Item)
    __obj.asInstanceOf[IClassGroups]
  }
}

