package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOptimizeVaultJob extends js.Object {
  
  var GarbageCollectFiles: Boolean = js.native
  
  def GetNumberOfSteps(): Double = js.native
  
  def GetOneBasedIndexOfStep(CurrentStep: Double): Double = js.native
  
  def GetStepProgressText(CurrentStep: Double): String = js.native
  
  def Set(GuidVault: String, Thorough: Boolean): Unit = js.native
  
  val Thorough: Boolean = js.native
  
  val VaultGUID: String = js.native
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
    val __obj = js.Dynamic.literal(GarbageCollectFiles = GarbageCollectFiles.asInstanceOf[js.Any], GetNumberOfSteps = js.Any.fromFunction0(GetNumberOfSteps), GetOneBasedIndexOfStep = js.Any.fromFunction1(GetOneBasedIndexOfStep), GetStepProgressText = js.Any.fromFunction1(GetStepProgressText), Set = js.Any.fromFunction2(Set), Thorough = Thorough.asInstanceOf[js.Any], VaultGUID = VaultGUID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptimizeVaultJob]
  }
  
  @scala.inline
  implicit class IOptimizeVaultJobOps[Self <: IOptimizeVaultJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGarbageCollectFiles(value: Boolean): Self = this.set("GarbageCollectFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetNumberOfSteps(value: () => Double): Self = this.set("GetNumberOfSteps", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOneBasedIndexOfStep(value: Double => Double): Self = this.set("GetOneBasedIndexOfStep", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetStepProgressText(value: Double => String): Self = this.set("GetStepProgressText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (String, Boolean) => Unit): Self = this.set("Set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setThorough(value: Boolean): Self = this.set("Thorough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaultGUID(value: String): Self = this.set("VaultGUID", value.asInstanceOf[js.Any])
  }
}
