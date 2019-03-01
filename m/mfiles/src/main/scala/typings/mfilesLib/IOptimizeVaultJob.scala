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
    GetNumberOfSteps: js.Function0[scala.Double],
    GetOneBasedIndexOfStep: js.Function1[scala.Double, scala.Double],
    GetStepProgressText: js.Function1[scala.Double, java.lang.String],
    Set: js.Function2[java.lang.String, scala.Boolean, scala.Unit],
    Thorough: scala.Boolean,
    VaultGUID: java.lang.String
  ): IOptimizeVaultJob = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GarbageCollectFiles")(GarbageCollectFiles)
    __obj.updateDynamic("GetNumberOfSteps")(GetNumberOfSteps)
    __obj.updateDynamic("GetOneBasedIndexOfStep")(GetOneBasedIndexOfStep)
    __obj.updateDynamic("GetStepProgressText")(GetStepProgressText)
    __obj.updateDynamic("Set")(Set)
    __obj.updateDynamic("Thorough")(Thorough)
    __obj.updateDynamic("VaultGUID")(VaultGUID)
    __obj.asInstanceOf[IOptimizeVaultJob]
  }
}

