package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
  var LocalizedLabels: js.Array[LocalizedLabel]
  var UserLocalizedLabel: LocalizedLabel
}

object Label {
  @scala.inline
  def apply(LocalizedLabels: js.Array[LocalizedLabel], UserLocalizedLabel: LocalizedLabel): Label = {
    val __obj = js.Dynamic.literal(LocalizedLabels = LocalizedLabels, UserLocalizedLabel = UserLocalizedLabel)
  
    __obj.asInstanceOf[Label]
  }
}

