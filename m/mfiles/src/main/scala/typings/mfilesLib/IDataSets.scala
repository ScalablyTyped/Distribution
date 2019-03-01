package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataSets extends js.Object {
  val Count: scala.Double
  def Clone(): IDataSets
  def Item(Index: scala.Double): IDataSet
}

object IDataSets {
  @scala.inline
  def apply(Clone: js.Function0[IDataSets], Count: scala.Double, Item: js.Function1[scala.Double, IDataSet]): IDataSets = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("Item")(Item)
    __obj.asInstanceOf[IDataSets]
  }
}

