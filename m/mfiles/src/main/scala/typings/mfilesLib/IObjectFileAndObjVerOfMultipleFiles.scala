package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectFileAndObjVerOfMultipleFiles extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, ObjectFileAndObjVer: IObjectFileAndObjVer): scala.Unit
  def Clone(): IObjectFileAndObjVerOfMultipleFiles
  def Item(Index: scala.Double): IObjectFileAndObjVer
  def Remove(Index: scala.Double): scala.Unit
}

object IObjectFileAndObjVerOfMultipleFiles {
  @scala.inline
  def apply(
    Add: js.Function2[scala.Double, IObjectFileAndObjVer, scala.Unit],
    Clone: js.Function0[IObjectFileAndObjVerOfMultipleFiles],
    Count: scala.Double,
    Item: js.Function1[scala.Double, IObjectFileAndObjVer],
    Remove: js.Function1[scala.Double, scala.Unit]
  ): IObjectFileAndObjVerOfMultipleFiles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Add")(Add)
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("Item")(Item)
    __obj.updateDynamic("Remove")(Remove)
    __obj.asInstanceOf[IObjectFileAndObjVerOfMultipleFiles]
  }
}

