package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVerifyVaultJob extends js.Object {
  val FixErrors: scala.Boolean
  val VaultGUID: java.lang.String
  val VerifyFileContents: scala.Boolean
  def Clone(): IVerifyVaultJob
  def GetNumberOfSteps(): scala.Double
  def GetOneBasedIndexOfStep(CurrentStep: scala.Double): scala.Double
  def GetStepProgressText(CurrentStep: scala.Double): java.lang.String
  def Set(GuidVault: java.lang.String, FixErrors: scala.Boolean, VerifyFileContents: scala.Boolean): scala.Unit
}

object IVerifyVaultJob {
  @scala.inline
  def apply(
    Clone: () => IVerifyVaultJob,
    FixErrors: scala.Boolean,
    GetNumberOfSteps: () => scala.Double,
    GetOneBasedIndexOfStep: scala.Double => scala.Double,
    GetStepProgressText: scala.Double => java.lang.String,
    Set: (java.lang.String, scala.Boolean, scala.Boolean) => scala.Unit,
    VaultGUID: java.lang.String,
    VerifyFileContents: scala.Boolean
  ): IVerifyVaultJob = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), FixErrors = FixErrors, GetNumberOfSteps = js.Any.fromFunction0(GetNumberOfSteps), GetOneBasedIndexOfStep = js.Any.fromFunction1(GetOneBasedIndexOfStep), GetStepProgressText = js.Any.fromFunction1(GetStepProgressText), Set = js.Any.fromFunction3(Set), VaultGUID = VaultGUID, VerifyFileContents = VerifyFileContents)
  
    __obj.asInstanceOf[IVerifyVaultJob]
  }
}

