package typings.mfiles

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectFile extends js.Object {
  val ChangeTimeUtc: Date
  val CreationTimeUtc: Date
  val Extension: String
  val FileGUID: String
  val FileVer: IFileVer
  val ID: Double
  val LastAccessTimeUtc: Date
  val LastWriteTimeUtc: Date
  val LogicalSize: Double
  val LogicalSize_32bit: Double
  val Title: String
  val Version: Double
  def GetNameForFileSystem(): String
  def ToJSON(): String
}

object IObjectFile {
  @scala.inline
  def apply(
    ChangeTimeUtc: Date,
    CreationTimeUtc: Date,
    Extension: String,
    FileGUID: String,
    FileVer: IFileVer,
    GetNameForFileSystem: () => String,
    ID: Double,
    LastAccessTimeUtc: Date,
    LastWriteTimeUtc: Date,
    LogicalSize: Double,
    LogicalSize_32bit: Double,
    Title: String,
    ToJSON: () => String,
    Version: Double
  ): IObjectFile = {
    val __obj = js.Dynamic.literal(ChangeTimeUtc = ChangeTimeUtc.asInstanceOf[js.Any], CreationTimeUtc = CreationTimeUtc.asInstanceOf[js.Any], Extension = Extension.asInstanceOf[js.Any], FileGUID = FileGUID.asInstanceOf[js.Any], FileVer = FileVer.asInstanceOf[js.Any], GetNameForFileSystem = js.Any.fromFunction0(GetNameForFileSystem), ID = ID.asInstanceOf[js.Any], LastAccessTimeUtc = LastAccessTimeUtc.asInstanceOf[js.Any], LastWriteTimeUtc = LastWriteTimeUtc.asInstanceOf[js.Any], LogicalSize = LogicalSize.asInstanceOf[js.Any], LogicalSize_32bit = LogicalSize_32bit.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], ToJSON = js.Any.fromFunction0(ToJSON), Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectFile]
  }
}

