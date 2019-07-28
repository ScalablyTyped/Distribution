package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptimizeVaultJob extends js.Object {
  var GarbageCollectFiles: Boolean
  val Thorough: Boolean
  val VaultGUID: String
  def GetNumberOfSteps(): Double
  def GetOneBasedIndexOfStep(CurrentStep: Double): Double
  def GetStepProgressText(CurrentStep: Double): String
  def Set(GuidVault: String, Thorough: Boolean): Unit
}

object IOptimizeVaultJob {
  @scala.inline
  def apply(
    GarbageCollectFiles: Boolean,
    GetNumberOfSteps: () => Double,
    GetOneBasedIndexOfStep: Double => Double,
    GetStepProgressText: Double => String,
    Set: (String, Boolean) => Unit,
    Thorough: Boolean,
    VaultGUID: String
  ): IOptimizeVaultJob = {
    val __obj = js.Dynamic.literal(GarbageCollectFiles = GarbageCollectFiles, GetNumberOfSteps = js.Any.fromFunction0(GetNumberOfSteps), GetOneBasedIndexOfStep = js.Any.fromFunction1(GetOneBasedIndexOfStep), GetStepProgressText = js.Any.fromFunction1(GetStepProgressText), Set = js.Any.fromFunction2(Set), Thorough = Thorough, VaultGUID = VaultGUID)
  
    __obj.asInstanceOf[IOptimizeVaultJob]
  }
}

