package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod.Global.Sdk.Mdq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CascadeConfiguration extends js.Object {
  var Assign: CascadeType
  var Delete: CascadeType
  var ExtensionData: CascadeType
  var Merge: CascadeType
  var Reparent: CascadeType
  var Share: CascadeType
  var Unshare: CascadeType
}

object CascadeConfiguration {
  @scala.inline
  def apply(
    Assign: CascadeType,
    Delete: CascadeType,
    ExtensionData: CascadeType,
    Merge: CascadeType,
    Reparent: CascadeType,
    Share: CascadeType,
    Unshare: CascadeType
  ): CascadeConfiguration = {
    val __obj = js.Dynamic.literal(Assign = Assign, Delete = Delete, ExtensionData = ExtensionData, Merge = Merge, Reparent = Reparent, Share = Share, Unshare = Unshare)
  
    __obj.asInstanceOf[CascadeConfiguration]
  }
}

