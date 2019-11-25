package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVerifyVaultJob extends js.Object {
  val FixErrors: Boolean
  val VaultGUID: String
  val VerifyFileContents: Boolean
  def Clone(): IVerifyVaultJob
  def GetNumberOfSteps(): Double
  def GetOneBasedIndexOfStep(CurrentStep: Double): Double
  def GetStepProgressText(CurrentStep: Double): String
  def Set(GuidVault: String, FixErrors: Boolean, VerifyFileContents: Boolean): Unit
}

object IVerifyVaultJob {
  @scala.inline
  def apply(
    Clone: () => IVerifyVaultJob,
    FixErrors: Boolean,
    GetNumberOfSteps: () => Double,
    GetOneBasedIndexOfStep: Double => Double,
    GetStepProgressText: Double => String,
    Set: (String, Boolean, Boolean) => Unit,
    VaultGUID: String,
    VerifyFileContents: Boolean
  ): IVerifyVaultJob = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), FixErrors = FixErrors.asInstanceOf[js.Any], GetNumberOfSteps = js.Any.fromFunction0(GetNumberOfSteps), GetOneBasedIndexOfStep = js.Any.fromFunction1(GetOneBasedIndexOfStep), GetStepProgressText = js.Any.fromFunction1(GetStepProgressText), Set = js.Any.fromFunction3(Set), VaultGUID = VaultGUID.asInstanceOf[js.Any], VerifyFileContents = VerifyFileContents.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IVerifyVaultJob]
  }
}

