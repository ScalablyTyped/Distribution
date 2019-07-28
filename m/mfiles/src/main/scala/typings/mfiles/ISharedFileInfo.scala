package typings.mfiles

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISharedFileInfo extends js.Object {
  val ChangeTimeUtc: Date
  val Extension: String
  val LogicalSize: Double
  val LogicalSize_32bit: Double
  val Title: String
  def Clone(): ISharedFileInfo
}

object ISharedFileInfo {
  @scala.inline
  def apply(
    ChangeTimeUtc: Date,
    Clone: () => ISharedFileInfo,
    Extension: String,
    LogicalSize: Double,
    LogicalSize_32bit: Double,
    Title: String
  ): ISharedFileInfo = {
    val __obj = js.Dynamic.literal(ChangeTimeUtc = ChangeTimeUtc, Clone = js.Any.fromFunction0(Clone), Extension = Extension, LogicalSize = LogicalSize, LogicalSize_32bit = LogicalSize_32bit, Title = Title)
  
    __obj.asInstanceOf[ISharedFileInfo]
  }
}

