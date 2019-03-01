package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIndirectPropertyID extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, IndirectPropertyIDLevel: IIndirectPropertyIDLevel): scala.Unit
  def Clone(): IIndirectPropertyID
  def EqualTo(IndirectPropertyID: IIndirectPropertyID): scala.Boolean
  def Item(Index: scala.Double): IIndirectPropertyIDLevel
  def Remove(Index: scala.Double): scala.Unit
  def ToJSON(): java.lang.String
}

object IIndirectPropertyID {
  @scala.inline
  def apply(
    Add: js.Function2[scala.Double, IIndirectPropertyIDLevel, scala.Unit],
    Clone: js.Function0[IIndirectPropertyID],
    Count: scala.Double,
    EqualTo: js.Function1[IIndirectPropertyID, scala.Boolean],
    Item: js.Function1[scala.Double, IIndirectPropertyIDLevel],
    Remove: js.Function1[scala.Double, scala.Unit],
    ToJSON: js.Function0[java.lang.String]
  ): IIndirectPropertyID = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Add")(Add)
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("EqualTo")(EqualTo)
    __obj.updateDynamic("Item")(Item)
    __obj.updateDynamic("Remove")(Remove)
    __obj.updateDynamic("ToJSON")(ToJSON)
    __obj.asInstanceOf[IIndirectPropertyID]
  }
}

