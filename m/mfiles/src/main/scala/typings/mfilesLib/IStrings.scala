package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStrings extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, Item: java.lang.String): scala.Unit
  def Clone(): IStrings
  def CloneFrom(Strings: IStrings): scala.Unit
  def Item(Index: scala.Double): java.lang.String
  def Join(Separator: java.lang.String): java.lang.String
  def Remove(Index: scala.Double): scala.Unit
}

object IStrings {
  @scala.inline
  def apply(
    Add: js.Function2[scala.Double, java.lang.String, scala.Unit],
    Clone: js.Function0[IStrings],
    CloneFrom: js.Function1[IStrings, scala.Unit],
    Count: scala.Double,
    Item: js.Function1[scala.Double, java.lang.String],
    Join: js.Function1[java.lang.String, java.lang.String],
    Remove: js.Function1[scala.Double, scala.Unit]
  ): IStrings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Add")(Add)
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("CloneFrom")(CloneFrom)
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("Item")(Item)
    __obj.updateDynamic("Join")(Join)
    __obj.updateDynamic("Remove")(Remove)
    __obj.asInstanceOf[IStrings]
  }
}

