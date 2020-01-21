package typings.microsoftSdkSoap.mod._Global_.Sdk.Mdq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalizedLabel extends js.Object {
  var HasChanged: Boolean
  var IsManaged: Boolean
  var Label: String
  var LangaugeCode: Double
  var MetadataId: String
}

object LocalizedLabel {
  @scala.inline
  def apply(HasChanged: Boolean, IsManaged: Boolean, Label: String, LangaugeCode: Double, MetadataId: String): LocalizedLabel = {
    val __obj = js.Dynamic.literal(HasChanged = HasChanged.asInstanceOf[js.Any], IsManaged = IsManaged.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], LangaugeCode = LangaugeCode.asInstanceOf[js.Any], MetadataId = MetadataId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LocalizedLabel]
  }
}

