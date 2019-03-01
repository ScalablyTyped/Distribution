package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIDs extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, ID: scala.Double): scala.Unit
  def Clone(): IIDs
  def IndexOf(ID: scala.Double): scala.Double
  def Item(Index: scala.Double): scala.Double
  def Remove(Index: scala.Double): scala.Unit
  def RemoveAll(ID: scala.Double): scala.Double
}

object IIDs {
  @scala.inline
  def apply(
    Add: js.Function2[scala.Double, scala.Double, scala.Unit],
    Clone: js.Function0[IIDs],
    Count: scala.Double,
    IndexOf: js.Function1[scala.Double, scala.Double],
    Item: js.Function1[scala.Double, scala.Double],
    Remove: js.Function1[scala.Double, scala.Unit],
    RemoveAll: js.Function1[scala.Double, scala.Double]
  ): IIDs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Add")(Add)
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("IndexOf")(IndexOf)
    __obj.updateDynamic("Item")(Item)
    __obj.updateDynamic("Remove")(Remove)
    __obj.updateDynamic("RemoveAll")(RemoveAll)
    __obj.asInstanceOf[IIDs]
  }
}

