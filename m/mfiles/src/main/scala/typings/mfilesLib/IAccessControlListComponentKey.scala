package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccessControlListComponentKey extends js.Object {
  var ItemID: scala.Double
  var PropertyDefID: mfilesLib.MFilesNs.MFBuiltInPropertyDef | scala.Double
  def Clone(): IAccessControlListComponentKey
}

object IAccessControlListComponentKey {
  @scala.inline
  def apply(
    Clone: js.Function0[IAccessControlListComponentKey],
    ItemID: scala.Double,
    PropertyDefID: mfilesLib.MFilesNs.MFBuiltInPropertyDef | scala.Double
  ): IAccessControlListComponentKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("ItemID")(ItemID)
    __obj.updateDynamic("PropertyDefID")(PropertyDefID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccessControlListComponentKey]
  }
}

