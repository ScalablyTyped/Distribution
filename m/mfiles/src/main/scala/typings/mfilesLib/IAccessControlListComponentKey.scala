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
    Clone: () => IAccessControlListComponentKey,
    ItemID: scala.Double,
    PropertyDefID: mfilesLib.MFilesNs.MFBuiltInPropertyDef | scala.Double
  ): IAccessControlListComponentKey = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ItemID = ItemID, PropertyDefID = PropertyDefID.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IAccessControlListComponentKey]
  }
}

