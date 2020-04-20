package typings.powerappsComponentFramework.ComponentFramework.PropertyHelper

import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.PrivilegeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Entity metadata security privileges.
		 */
trait SecurityPrivilegeMetadata extends js.Object {
  var CanBeBasic: Boolean
  var CanBeDeep: Boolean
  var CanBeEntityReference: Boolean
  var CanBeGlobal: Boolean
  var CanBeLocal: Boolean
  var CanBeParentEntityReference: Boolean
  var Name: String
  var PrivilegeId: String
  var PrivilegeType: typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.PrivilegeType
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
}

