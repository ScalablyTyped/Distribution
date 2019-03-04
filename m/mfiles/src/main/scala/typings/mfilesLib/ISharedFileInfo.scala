package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISharedFileInfo extends js.Object {
  val ChangeTimeUtc: stdLib.Date
  val Extension: java.lang.String
  val LogicalSize: scala.Double
  val LogicalSize_32bit: scala.Double
  val Title: java.lang.String
  def Clone(): ISharedFileInfo
}

object ISharedFileInfo {
  @scala.inline
  def apply(
    ChangeTimeUtc: stdLib.Date,
    Clone: js.Function0[ISharedFileInfo],
    Extension: java.lang.String,
    LogicalSize: scala.Double,
    LogicalSize_32bit: scala.Double,
    Title: java.lang.String
  ): ISharedFileInfo = {
    val __obj = js.Dynamic.literal(ChangeTimeUtc = ChangeTimeUtc, Clone = Clone, Extension = Extension, LogicalSize = LogicalSize, LogicalSize_32bit = LogicalSize_32bit, Title = Title)
  
    __obj.asInstanceOf[ISharedFileInfo]
  }
}

