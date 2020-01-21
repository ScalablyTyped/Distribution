package typings.officeUiFabricReact.detailsListDocumentsExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocument extends js.Object {
  var dateModified: String
  var dateModifiedValue: Double
  var fileSize: String
  var fileSizeRaw: Double
  var fileType: String
  var iconName: String
  var key: String
  var modifiedBy: String
  var name: String
  var value: String
}

object IDocument {
  @scala.inline
  def apply(
    dateModified: String,
    dateModifiedValue: Double,
    fileSize: String,
    fileSizeRaw: Double,
    fileType: String,
    iconName: String,
    key: String,
    modifiedBy: String,
    name: String,
    value: String
  ): IDocument = {
    val __obj = js.Dynamic.literal(dateModified = dateModified.asInstanceOf[js.Any], dateModifiedValue = dateModifiedValue.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], fileSizeRaw = fileSizeRaw.asInstanceOf[js.Any], fileType = fileType.asInstanceOf[js.Any], iconName = iconName.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], modifiedBy = modifiedBy.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDocument]
  }
}

