package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStringData extends js.Object {
  var AsString: java.lang.String
  val StringDataType: mfilesLib.MFilesNs.MFStringDataType
  def Clone(): IStringData
}

object IStringData {
  @scala.inline
  def apply(
    AsString: java.lang.String,
    Clone: () => IStringData,
    StringDataType: mfilesLib.MFilesNs.MFStringDataType
  ): IStringData = {
    val __obj = js.Dynamic.literal(AsString = AsString, Clone = js.Any.fromFunction0(Clone), StringDataType = StringDataType)
  
    __obj.asInstanceOf[IStringData]
  }
}

