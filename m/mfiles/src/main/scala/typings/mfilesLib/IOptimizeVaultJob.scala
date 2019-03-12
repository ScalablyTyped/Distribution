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

object IOptimizeVaultJob {
  @scala.inline
  def apply(
    GarbageCollectFiles: scala.Boolean,
    GetNumberOfSteps: () => scala.Double,
    GetOneBasedIndexOfStep: scala.Double => scala.Double,
    GetStepProgressText: scala.Double => java.lang.String,
    Set: (java.lang.String, scala.Boolean) => scala.Unit,
    Thorough: scala.Boolean,
    VaultGUID: java.lang.String
  ): IOptimizeVaultJob = {
    val __obj = js.Dynamic.literal(GarbageCollectFiles = GarbageCollectFiles, GetNumberOfSteps = js.Any.fromFunction0(GetNumberOfSteps), GetOneBasedIndexOfStep = js.Any.fromFunction1(GetOneBasedIndexOfStep), GetStepProgressText = js.Any.fromFunction1(GetStepProgressText), Set = js.Any.fromFunction2(Set), Thorough = Thorough, VaultGUID = VaultGUID)
  
    __obj.asInstanceOf[IOptimizeVaultJob]
  }
}

