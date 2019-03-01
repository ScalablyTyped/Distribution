package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOCRZones extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, OCRZone: IOCRZone): scala.Unit
  def Clone(): IOCRZones
  def Item(Index: scala.Double): IOCRZone
  def Remove(Index: scala.Double): scala.Unit
}

object IOCRZones {
  @scala.inline
  def apply(
    Add: js.Function2[scala.Double, IOCRZone, scala.Unit],
    Clone: js.Function0[IOCRZones],
    Count: scala.Double,
    Item: js.Function1[scala.Double, IOCRZone],
    Remove: js.Function1[scala.Double, scala.Unit]
  ): IOCRZones = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Add")(Add)
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("Item")(Item)
    __obj.updateDynamic("Remove")(Remove)
    __obj.asInstanceOf[IOCRZones]
  }
}

