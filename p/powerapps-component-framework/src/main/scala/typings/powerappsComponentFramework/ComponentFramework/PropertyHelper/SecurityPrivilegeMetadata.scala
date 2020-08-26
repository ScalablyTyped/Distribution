package typings.powerappsComponentFramework.ComponentFramework.PropertyHelper

import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.PrivilegeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Entity metadata security privileges.
  */
@js.native
trait SecurityPrivilegeMetadata extends js.Object {
  var CanBeBasic: Boolean = js.native
  var CanBeDeep: Boolean = js.native
  var CanBeEntityReference: Boolean = js.native
  var CanBeGlobal: Boolean = js.native
  var CanBeLocal: Boolean = js.native
  var CanBeParentEntityReference: Boolean = js.native
  var Name: String = js.native
  var PrivilegeId: String = js.native
  var PrivilegeType: typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.PrivilegeType = js.native
}

object SecurityPrivilegeMetadata {
  @scala.inline
  def apply(
    CanBeBasic: Boolean,
    CanBeDeep: Boolean,
    CanBeEntityReference: Boolean,
    CanBeGlobal: Boolean,
    CanBeLocal: Boolean,
    CanBeParentEntityReference: Boolean,
    Name: String,
    PrivilegeId: String,
    PrivilegeType: PrivilegeType
  ): SecurityPrivilegeMetadata = {
    val __obj = js.Dynamic.literal(CanBeBasic = CanBeBasic.asInstanceOf[js.Any], CanBeDeep = CanBeDeep.asInstanceOf[js.Any], CanBeEntityReference = CanBeEntityReference.asInstanceOf[js.Any], CanBeGlobal = CanBeGlobal.asInstanceOf[js.Any], CanBeLocal = CanBeLocal.asInstanceOf[js.Any], CanBeParentEntityReference = CanBeParentEntityReference.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PrivilegeId = PrivilegeId.asInstanceOf[js.Any], PrivilegeType = PrivilegeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityPrivilegeMetadata]
  }
  @scala.inline
  implicit class SecurityPrivilegeMetadataOps[Self <: SecurityPrivilegeMetadata] (val x: Self) extends AnyVal {
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
    def setCanBeBasic(value: Boolean): Self = this.set("CanBeBasic", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanBeDeep(value: Boolean): Self = this.set("CanBeDeep", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanBeEntityReference(value: Boolean): Self = this.set("CanBeEntityReference", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanBeGlobal(value: Boolean): Self = this.set("CanBeGlobal", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanBeLocal(value: Boolean): Self = this.set("CanBeLocal", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanBeParentEntityReference(value: Boolean): Self = this.set("CanBeParentEntityReference", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivilegeId(value: String): Self = this.set("PrivilegeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivilegeType(value: PrivilegeType): Self = this.set("PrivilegeType", value.asInstanceOf[js.Any])
  }
  
}

