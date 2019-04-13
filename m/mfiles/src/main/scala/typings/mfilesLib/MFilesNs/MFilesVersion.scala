package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.MFilesVersion")
@js.native
class MFilesVersion ()
  extends mfilesLib.IMFilesVersion {
  /* CompleteClass */
  override var Build: scala.Double = js.native
  /* CompleteClass */
  override val Display: java.lang.String = js.native
  /* CompleteClass */
  override var Major: scala.Double = js.native
  /* CompleteClass */
  override var Minor: scala.Double = js.native
  /* CompleteClass */
  override var Patch: scala.Double = js.native
  /* CompleteClass */
  override var SoftwarePlatform: MFSoftwarePlatformType = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IMFilesVersion = js.native
  /* CompleteClass */
  override def CompareTo(RightSide: mfilesLib.IMFilesVersion): scala.Double = js.native
}

@JSGlobal("MFiles.MFilesVersion")
@js.native
object MFilesVersion
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IMFilesVersion]

