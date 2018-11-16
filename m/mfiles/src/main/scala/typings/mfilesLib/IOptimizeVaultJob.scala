package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IOptimizeVaultJob extends js.Object {
  var GarbageCollectFiles: scala.Boolean
  val Thorough: scala.Boolean
  val VaultGUID: java.lang.String
  def GetNumberOfSteps(): scala.Double
  def GetOneBasedIndexOfStep(CurrentStep: scala.Double): scala.Double
  def GetStepProgressText(CurrentStep: scala.Double): java.lang.String
  def Set(GuidVault: java.lang.String, Thorough: scala.Boolean): scala.Unit
}

