package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFolderNameListing extends js.Object {
  val Count: scala.Double
  val MoreValues: scala.Boolean
  def Item(Index: scala.Double): ITypedValue
  def SortWithExpression(Expression: IExpression, Locale: scala.Double): scala.Unit
}

object IFolderNameListing {
  @scala.inline
  def apply(
    Count: scala.Double,
    Item: js.Function1[scala.Double, ITypedValue],
    MoreValues: scala.Boolean,
    SortWithExpression: js.Function2[IExpression, scala.Double, scala.Unit]
  ): IFolderNameListing = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("Item")(Item)
    __obj.updateDynamic("MoreValues")(MoreValues)
    __obj.updateDynamic("SortWithExpression")(SortWithExpression)
    __obj.asInstanceOf[IFolderNameListing]
  }
}

