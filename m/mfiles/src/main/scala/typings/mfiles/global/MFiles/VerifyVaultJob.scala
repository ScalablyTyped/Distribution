package typings.mfiles.global.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IVerifyVaultJob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VerifyVaultJob")
@js.native
class VerifyVaultJob () extends IVerifyVaultJob {
  /* CompleteClass */
  override val FixErrors: Boolean = js.native
  /* CompleteClass */
  override val VaultGUID: String = js.native
  /* CompleteClass */
  override val VerifyFileContents: Boolean = js.native
  /* CompleteClass */
  override def Clone(): IVerifyVaultJob = js.native
  /* CompleteClass */
  override def GetNumberOfSteps(): Double = js.native
  /* CompleteClass */
  override def GetOneBasedIndexOfStep(CurrentStep: Double): Double = js.native
  /* CompleteClass */
  override def GetStepProgressText(CurrentStep: Double): String = js.native
  /* CompleteClass */
  override def Set(GuidVault: String, FixErrors: Boolean, VerifyFileContents: Boolean): Unit = js.native
}

@JSGlobal("MFiles.VerifyVaultJob")
@js.native
object VerifyVaultJob extends Instantiable0[IVerifyVaultJob]

