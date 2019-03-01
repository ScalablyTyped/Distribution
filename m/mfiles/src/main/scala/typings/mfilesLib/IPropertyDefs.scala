package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyDefs extends js.Object {
  val Count: scala.Double
  def Clone(): IPropertyDefs
  def Item(Index: scala.Double): IPropertyDef
}

object IPropertyDefs {
  @scala.inline
  def apply(
    Clone: js.Function0[IPropertyDefs],
    Count: scala.Double,
    Item: js.Function1[scala.Double, IPropertyDef]
  ): IPropertyDefs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("Item")(Item)
    __obj.asInstanceOf[IPropertyDefs]
  }
}

