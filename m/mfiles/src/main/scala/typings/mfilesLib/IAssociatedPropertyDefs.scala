package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAssociatedPropertyDefs extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, AssociatedPropertyDef: IAssociatedPropertyDef): scala.Unit
  def Clone(): IAssociatedPropertyDefs
  def Item(Index: scala.Double): IAssociatedPropertyDef
  def Remove(Index: scala.Double): scala.Unit
}

object IAssociatedPropertyDefs {
  @scala.inline
  def apply(
    Add: js.Function2[scala.Double, IAssociatedPropertyDef, scala.Unit],
    Clone: js.Function0[IAssociatedPropertyDefs],
    Count: scala.Double,
    Item: js.Function1[scala.Double, IAssociatedPropertyDef],
    Remove: js.Function1[scala.Double, scala.Unit]
  ): IAssociatedPropertyDefs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Add")(Add)
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("Item")(Item)
    __obj.updateDynamic("Remove")(Remove)
    __obj.asInstanceOf[IAssociatedPropertyDefs]
  }
}

