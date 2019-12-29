package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq

import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.Append
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.AppendTo
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.Assign
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.Create
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.Delete
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.None
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.Read
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.Share
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.Write
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityPrivilegeMetadata extends js.Object {
  var CanBeBasic: Boolean
  var CanBeDeep: Boolean
  var CanBeEntityReference: Boolean
  var CanBeGlobal: Boolean
  var CanBeLocal: Boolean
  var CanBeParentEntityReference: Boolean
  var ExtensionData: Boolean
  var Name: String
  var PrivilegeId: String
  var PrivilegeType: Append | AppendTo | Assign | Create | Delete | None | Read | Share | Write
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
    ExtensionData: Boolean,
    Name: String,
    PrivilegeId: String,
    PrivilegeType: Append | AppendTo | Assign | Create | Delete | None | Read | Share | Write
  ): SecurityPrivilegeMetadata = {
    val __obj = js.Dynamic.literal(CanBeBasic = CanBeBasic.asInstanceOf[js.Any], CanBeDeep = CanBeDeep.asInstanceOf[js.Any], CanBeEntityReference = CanBeEntityReference.asInstanceOf[js.Any], CanBeGlobal = CanBeGlobal.asInstanceOf[js.Any], CanBeLocal = CanBeLocal.asInstanceOf[js.Any], CanBeParentEntityReference = CanBeParentEntityReference.asInstanceOf[js.Any], ExtensionData = ExtensionData.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PrivilegeId = PrivilegeId.asInstanceOf[js.Any], PrivilegeType = PrivilegeType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SecurityPrivilegeMetadata]
  }
}

