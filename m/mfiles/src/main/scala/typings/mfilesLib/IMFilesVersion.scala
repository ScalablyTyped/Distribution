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

object IMFilesVersion {
  @scala.inline
  def apply(
    Build: scala.Double,
    Clone: js.Function0[IMFilesVersion],
    CompareTo: js.Function1[IMFilesVersion, scala.Double],
    Display: java.lang.String,
    Major: scala.Double,
    Minor: scala.Double,
    Patch: scala.Double,
    SoftwarePlatform: mfilesLib.MFilesNs.MFSoftwarePlatformType
  ): IMFilesVersion = {
    val __obj = js.Dynamic.literal(Build = Build, Clone = Clone, CompareTo = CompareTo, Display = Display, Major = Major, Minor = Minor, Patch = Patch, SoftwarePlatform = SoftwarePlatform)
  
    __obj.asInstanceOf[IMFilesVersion]
  }
}

