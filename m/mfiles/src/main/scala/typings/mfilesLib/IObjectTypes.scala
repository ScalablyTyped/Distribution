package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectTypes extends js.Object {
  val Count: scala.Double
  def Clone(): IObjectTypes
  def Item(Index: scala.Double): IObjectType
}

object IObjectTypes {
  @scala.inline
  def apply(
    Clone: js.Function0[IObjectTypes],
    Count: scala.Double,
    Item: js.Function1[scala.Double, IObjectType]
  ): IObjectTypes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("Item")(Item)
    __obj.asInstanceOf[IObjectTypes]
  }
}

