package typings.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IOptimizeVaultJob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.OptimizeVaultJob")
@js.native
class OptimizeVaultJob () extends IOptimizeVaultJob {
  /* CompleteClass */
  override var GarbageCollectFiles: Boolean = js.native
  /* CompleteClass */
  override val Thorough: Boolean = js.native
  /* CompleteClass */
  override val VaultGUID: String = js.native
  /* CompleteClass */
  override def GetNumberOfSteps(): Double = js.native
  /* CompleteClass */
  override def GetOneBasedIndexOfStep(CurrentStep: Double): Double = js.native
  /* CompleteClass */
  override def GetStepProgressText(CurrentStep: Double): String = js.native
  /* CompleteClass */
  override def Set(GuidVault: String, Thorough: Boolean): Unit = js.native
}

@JSGlobal("MFiles.OptimizeVaultJob")
@js.native
object OptimizeVaultJob extends Instantiable0[IOptimizeVaultJob]

