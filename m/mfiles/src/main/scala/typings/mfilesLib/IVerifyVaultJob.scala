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

