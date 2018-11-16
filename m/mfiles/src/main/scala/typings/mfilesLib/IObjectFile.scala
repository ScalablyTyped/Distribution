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

