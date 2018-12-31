package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShellItems extends js.Object {
  val Count: scala.Double
  val Folders: IFolderDefs
  val ObjectFiles: IObjectFileAndObjVerOfMultipleFiles
  val ObjectVersions: IObjectVersions
  val ObjectVersionsAndProperties: IObjectVersionAndPropertiesOfMultipleObjects
  def GetObjectVersionsCount(): scala.Double
}

