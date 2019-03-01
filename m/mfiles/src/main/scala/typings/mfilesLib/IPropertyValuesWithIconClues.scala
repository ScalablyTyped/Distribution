package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyValuesWithIconClues extends js.Object {
  val IconClues: IPropertyValueIconClues
  val ObjVer: IObjVer
  val PropertyValues: IPropertyValues
  def Clone(): IPropertyValuesWithIconClues
}

object IPropertyValuesWithIconClues {
  @scala.inline
  def apply(
    Clone: js.Function0[IPropertyValuesWithIconClues],
    IconClues: IPropertyValueIconClues,
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues
  ): IPropertyValuesWithIconClues = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("IconClues")(IconClues)
    __obj.updateDynamic("ObjVer")(ObjVer)
    __obj.updateDynamic("PropertyValues")(PropertyValues)
    __obj.asInstanceOf[IPropertyValuesWithIconClues]
  }
}

