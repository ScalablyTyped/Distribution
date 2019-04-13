package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.OptimizeVaultJob")
@js.native
class OptimizeVaultJob ()
  extends mfilesLib.IOptimizeVaultJob {
  /* CompleteClass */
  override var GarbageCollectFiles: scala.Boolean = js.native
  /* CompleteClass */
  override val Thorough: scala.Boolean = js.native
  /* CompleteClass */
  override val VaultGUID: java.lang.String = js.native
  /* CompleteClass */
  override def GetNumberOfSteps(): scala.Double = js.native
  /* CompleteClass */
  override def GetOneBasedIndexOfStep(CurrentStep: scala.Double): scala.Double = js.native
  /* CompleteClass */
  override def GetStepProgressText(CurrentStep: scala.Double): java.lang.String = js.native
  /* CompleteClass */
  override def Set(GuidVault: java.lang.String, Thorough: scala.Boolean): scala.Unit = js.native
}

@JSGlobal("MFiles.OptimizeVaultJob")
@js.native
object OptimizeVaultJob
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IOptimizeVaultJob]

