package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShortcutMappingInfo extends js.Object {
  var ObjectTypeGUID: String = js.native
  var ObjectTypeID: Double = js.native
  var ObjectTypeName: String = js.native
  var ObjectTypeSemanticAliases: ISemanticAliases = js.native
}

object IShortcutMappingInfo {
  @scala.inline
  def apply(
    ObjectTypeGUID: String,
    ObjectTypeID: Double,
    ObjectTypeName: String,
    ObjectTypeSemanticAliases: ISemanticAliases
  ): IShortcutMappingInfo = {
    val __obj = js.Dynamic.literal(ObjectTypeGUID = ObjectTypeGUID.asInstanceOf[js.Any], ObjectTypeID = ObjectTypeID.asInstanceOf[js.Any], ObjectTypeName = ObjectTypeName.asInstanceOf[js.Any], ObjectTypeSemanticAliases = ObjectTypeSemanticAliases.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShortcutMappingInfo]
  }
  @scala.inline
  implicit class IShortcutMappingInfoOps[Self <: IShortcutMappingInfo] (val x: Self) extends AnyVal {
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
    def setObjectTypeGUID(value: String): Self = this.set("ObjectTypeGUID", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectTypeID(value: Double): Self = this.set("ObjectTypeID", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectTypeName(value: String): Self = this.set("ObjectTypeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectTypeSemanticAliases(value: ISemanticAliases): Self = this.set("ObjectTypeSemanticAliases", value.asInstanceOf[js.Any])
  }
  
}

