package typings.mfiles.global.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IMFilesVersion
import typings.mfiles.MFiles.MFSoftwarePlatformType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.MFilesVersion")
@js.native
class MFilesVersion () extends IMFilesVersion {
  /* CompleteClass */
  override var Build: Double = js.native
  /* CompleteClass */
  override val Display: String = js.native
  /* CompleteClass */
  override var Major: Double = js.native
  /* CompleteClass */
  override var Minor: Double = js.native
  /* CompleteClass */
  override var Patch: Double = js.native
  /* CompleteClass */
  override var SoftwarePlatform: MFSoftwarePlatformType = js.native
  /* CompleteClass */
  override def Clone(): IMFilesVersion = js.native
  /* CompleteClass */
  override def CompareTo(RightSide: IMFilesVersion): Double = js.native
}

@JSGlobal("MFiles.MFilesVersion")
@js.native
object MFilesVersion extends Instantiable0[IMFilesVersion]

