package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOCRPages extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, OCRPage: IOCRPage): scala.Unit
  def Clone(): IOCRPages
  def Item(Index: scala.Double): IOCRPage
  def Remove(Index: scala.Double): scala.Unit
}

object IOCRPages {
  @scala.inline
  def apply(
    Add: js.Function2[scala.Double, IOCRPage, scala.Unit],
    Clone: js.Function0[IOCRPages],
    Count: scala.Double,
    Item: js.Function1[scala.Double, IOCRPage],
    Remove: js.Function1[scala.Double, scala.Unit]
  ): IOCRPages = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Add")(Add)
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("Item")(Item)
    __obj.updateDynamic("Remove")(Remove)
    __obj.asInstanceOf[IOCRPages]
  }
}

