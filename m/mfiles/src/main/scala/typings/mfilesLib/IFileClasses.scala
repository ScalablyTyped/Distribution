package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileClasses extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, FileClass: IFileClass): scala.Unit
  def Clone(): IFileClasses
  def Item(Index: scala.Double): IFileClass
  def Remove(Index: scala.Double): scala.Unit
}

object IFileClasses {
  @scala.inline
  def apply(
    Add: js.Function2[scala.Double, IFileClass, scala.Unit],
    Clone: js.Function0[IFileClasses],
    Count: scala.Double,
    Item: js.Function1[scala.Double, IFileClass],
    Remove: js.Function1[scala.Double, scala.Unit]
  ): IFileClasses = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Add")(Add)
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("Item")(Item)
    __obj.updateDynamic("Remove")(Remove)
    __obj.asInstanceOf[IFileClasses]
  }
}

