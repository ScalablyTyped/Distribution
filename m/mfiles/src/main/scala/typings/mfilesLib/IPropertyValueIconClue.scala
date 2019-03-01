package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyValueIconClue extends js.Object {
  val PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef | scala.Double
  val ValueListItem: scala.Double
  def Clone(): IPropertyValueIconClue
}

object IPropertyValueIconClue {
  @scala.inline
  def apply(
    Clone: js.Function0[IPropertyValueIconClue],
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef | scala.Double,
    ValueListItem: scala.Double
  ): IPropertyValueIconClue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("PropertyDef")(PropertyDef.asInstanceOf[js.Any])
    __obj.updateDynamic("ValueListItem")(ValueListItem)
    __obj.asInstanceOf[IPropertyValueIconClue]
  }
}

