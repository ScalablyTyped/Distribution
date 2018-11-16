package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IMFilesVersion extends js.Object {
  var Build: scala.Double
  val Display: java.lang.String
  var Major: scala.Double
  var Minor: scala.Double
  var Patch: scala.Double
  var SoftwarePlatform: mfilesLib.MFilesNs.MFSoftwarePlatformType
  def Clone(): IMFilesVersion
  def CompareTo(RightSide: IMFilesVersion): scala.Double
}

