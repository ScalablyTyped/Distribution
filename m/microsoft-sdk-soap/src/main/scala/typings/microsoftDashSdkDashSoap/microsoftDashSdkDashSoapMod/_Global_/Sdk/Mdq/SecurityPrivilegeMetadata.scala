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
  var CanBeBasic: scala.Boolean
  var CanBeDeep: scala.Boolean
  var CanBeEntityReference: scala.Boolean
  var CanBeGlobal: scala.Boolean
  var CanBeLocal: scala.Boolean
  var CanBeParentEntityReference: scala.Boolean
  var ExtensionData: scala.Boolean
  var Name: java.lang.String
  var PrivilegeId: java.lang.String
  var PrivilegeType: Append | AppendTo | Assign | Create | Delete | None | Read | Share | Write
}

object SecurityPrivilegeMetadata {
  @scala.inline
  def apply(
    CanBeBasic: scala.Boolean,
    CanBeDeep: scala.Boolean,
    CanBeEntityReference: scala.Boolean,
    CanBeGlobal: scala.Boolean,
    CanBeLocal: scala.Boolean,
    CanBeParentEntityReference: scala.Boolean,
    ExtensionData: scala.Boolean,
    Name: java.lang.String,
    PrivilegeId: java.lang.String,
    PrivilegeType: Append | AppendTo | Assign | Create | Delete | None | Read | Share | Write
  ): SecurityPrivilegeMetadata = {
    val __obj = js.Dynamic.literal(CanBeBasic = CanBeBasic.asInstanceOf[js.Any], CanBeDeep = CanBeDeep.asInstanceOf[js.Any], CanBeEntityReference = CanBeEntityReference.asInstanceOf[js.Any], CanBeGlobal = CanBeGlobal.asInstanceOf[js.Any], CanBeLocal = CanBeLocal.asInstanceOf[js.Any], CanBeParentEntityReference = CanBeParentEntityReference.asInstanceOf[js.Any], ExtensionData = ExtensionData.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PrivilegeId = PrivilegeId.asInstanceOf[js.Any], PrivilegeType = PrivilegeType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SecurityPrivilegeMetadata]
  }
}

