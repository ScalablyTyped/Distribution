package typings.mfiles

import typings.mfiles.MFilesNs.MFBuiltInPropertyDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccessControlListComponentKey extends js.Object {
  var ItemID: Double
  var PropertyDefID: MFBuiltInPropertyDef | Double
  def Clone(): IAccessControlListComponentKey
}

object IAccessControlListComponentKey {
  @scala.inline
  def apply(
    Clone: () => IAccessControlListComponentKey,
    ItemID: Double,
    PropertyDefID: MFBuiltInPropertyDef | Double
  ): IAccessControlListComponentKey = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ItemID = ItemID, PropertyDefID = PropertyDefID.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IAccessControlListComponentKey]
  }
}

