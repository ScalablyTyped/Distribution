package typings.mfiles

import typings.mfiles.MFilesNs.MFStringDataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStringData extends js.Object {
  var AsString: String
  val StringDataType: MFStringDataType
  def Clone(): IStringData
}

object IStringData {
  @scala.inline
  def apply(AsString: String, Clone: () => IStringData, StringDataType: MFStringDataType): IStringData = {
    val __obj = js.Dynamic.literal(AsString = AsString, Clone = js.Any.fromFunction0(Clone), StringDataType = StringDataType)
  
    __obj.asInstanceOf[IStringData]
  }
}

