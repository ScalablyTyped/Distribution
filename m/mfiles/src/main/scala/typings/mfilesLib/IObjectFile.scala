package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectFile extends js.Object {
  val ChangeTimeUtc: stdLib.Date
  val CreationTimeUtc: stdLib.Date
  val Extension: java.lang.String
  val FileGUID: java.lang.String
  val FileVer: IFileVer
  val ID: scala.Double
  val LastAccessTimeUtc: stdLib.Date
  val LastWriteTimeUtc: stdLib.Date
  val LogicalSize: scala.Double
  val LogicalSize_32bit: scala.Double
  val Title: java.lang.String
  val Version: scala.Double
  def GetNameForFileSystem(): java.lang.String
  def ToJSON(): java.lang.String
}

object IObjectFile {
  @scala.inline
  def apply(
    ChangeTimeUtc: stdLib.Date,
    CreationTimeUtc: stdLib.Date,
    Extension: java.lang.String,
    FileGUID: java.lang.String,
    FileVer: IFileVer,
    GetNameForFileSystem: js.Function0[java.lang.String],
    ID: scala.Double,
    LastAccessTimeUtc: stdLib.Date,
    LastWriteTimeUtc: stdLib.Date,
    LogicalSize: scala.Double,
    LogicalSize_32bit: scala.Double,
    Title: java.lang.String,
    ToJSON: js.Function0[java.lang.String],
    Version: scala.Double
  ): IObjectFile = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ChangeTimeUtc")(ChangeTimeUtc)
    __obj.updateDynamic("CreationTimeUtc")(CreationTimeUtc)
    __obj.updateDynamic("Extension")(Extension)
    __obj.updateDynamic("FileGUID")(FileGUID)
    __obj.updateDynamic("FileVer")(FileVer)
    __obj.updateDynamic("GetNameForFileSystem")(GetNameForFileSystem)
    __obj.updateDynamic("ID")(ID)
    __obj.updateDynamic("LastAccessTimeUtc")(LastAccessTimeUtc)
    __obj.updateDynamic("LastWriteTimeUtc")(LastWriteTimeUtc)
    __obj.updateDynamic("LogicalSize")(LogicalSize)
    __obj.updateDynamic("LogicalSize_32bit")(LogicalSize_32bit)
    __obj.updateDynamic("Title")(Title)
    __obj.updateDynamic("ToJSON")(ToJSON)
    __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[IObjectFile]
  }
}

