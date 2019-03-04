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
    Clone: js.Function0[IVerifyVaultJob],
    FixErrors: scala.Boolean,
    GetNumberOfSteps: js.Function0[scala.Double],
    GetOneBasedIndexOfStep: js.Function1[scala.Double, scala.Double],
    GetStepProgressText: js.Function1[scala.Double, java.lang.String],
    Set: js.Function3[java.lang.String, scala.Boolean, scala.Boolean, scala.Unit],
    VaultGUID: java.lang.String,
    VerifyFileContents: scala.Boolean
  ): IVerifyVaultJob = {
    val __obj = js.Dynamic.literal(Clone = Clone, FixErrors = FixErrors, GetNumberOfSteps = GetNumberOfSteps, GetOneBasedIndexOfStep = GetOneBasedIndexOfStep, GetStepProgressText = GetStepProgressText, Set = Set, VaultGUID = VaultGUID, VerifyFileContents = VerifyFileContents)
  
    __obj.asInstanceOf[IVerifyVaultJob]
  }
}

