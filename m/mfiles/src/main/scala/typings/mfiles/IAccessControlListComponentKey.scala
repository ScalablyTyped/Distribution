package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInPropertyDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAccessControlListComponentKey extends js.Object {
  var ItemID: Double = js.native
  var PropertyDefID: MFBuiltInPropertyDef | Double = js.native
  def Clone(): IAccessControlListComponentKey = js.native
}

object IAccessControlListComponentKey {
  @scala.inline
  def apply(
    Clone: () => IAccessControlListComponentKey,
    ItemID: Double,
    PropertyDefID: MFBuiltInPropertyDef | Double
  ): IAccessControlListComponentKey = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ItemID = ItemID.asInstanceOf[js.Any], PropertyDefID = PropertyDefID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccessControlListComponentKey]
  }
  @scala.inline
  implicit class IAccessControlListComponentKeyOps[Self <: IAccessControlListComponentKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClone(value: () => IAccessControlListComponentKey): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setItemID(value: Double): Self = this.set("ItemID", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropertyDefID(value: MFBuiltInPropertyDef | Double): Self = this.set("PropertyDefID", value.asInstanceOf[js.Any])
  }
  
}

