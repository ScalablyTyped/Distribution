package typings.microsoftSdkSoap.mod._Global_.Sdk.Mdq

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
    val __obj = js.Dynamic.literal(Assign = Assign.asInstanceOf[js.Any], Delete = Delete.asInstanceOf[js.Any], ExtensionData = ExtensionData.asInstanceOf[js.Any], Merge = Merge.asInstanceOf[js.Any], Reparent = Reparent.asInstanceOf[js.Any], Share = Share.asInstanceOf[js.Any], Unshare = Unshare.asInstanceOf[js.Any])
    __obj.asInstanceOf[CascadeConfiguration]
  }
}

