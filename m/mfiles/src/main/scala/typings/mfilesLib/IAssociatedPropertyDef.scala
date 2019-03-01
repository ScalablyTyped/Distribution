package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAssociatedPropertyDef extends js.Object {
  var PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef | scala.Double
  var Required: scala.Boolean
  def Clone(): IAssociatedPropertyDef
}

object IAssociatedPropertyDef {
  @scala.inline
  def apply(
    Clone: js.Function0[IAssociatedPropertyDef],
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef | scala.Double,
    Required: scala.Boolean
  ): IAssociatedPropertyDef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("PropertyDef")(PropertyDef.asInstanceOf[js.Any])
    __obj.updateDynamic("Required")(Required)
    __obj.asInstanceOf[IAssociatedPropertyDef]
  }
}

