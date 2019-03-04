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
    Clone: js.Function0[IStringData],
    StringDataType: mfilesLib.MFilesNs.MFStringDataType
  ): IStringData = {
    val __obj = js.Dynamic.literal(AsString = AsString, Clone = Clone, StringDataType = StringDataType)
  
    __obj.asInstanceOf[IStringData]
  }
}

