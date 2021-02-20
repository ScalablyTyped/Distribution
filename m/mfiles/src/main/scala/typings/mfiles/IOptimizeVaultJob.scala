package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOptimizeVaultJob extends StObject {
  
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
  implicit class IOptimizeVaultJobMutableBuilder[Self <: IOptimizeVaultJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGarbageCollectFiles(value: Boolean): Self = StObject.set(x, "GarbageCollectFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetNumberOfSteps(value: () => Double): Self = StObject.set(x, "GetNumberOfSteps", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOneBasedIndexOfStep(value: Double => Double): Self = StObject.set(x, "GetOneBasedIndexOfStep", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetStepProgressText(value: Double => String): Self = StObject.set(x, "GetStepProgressText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (String, Boolean) => Unit): Self = StObject.set(x, "Set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setThorough(value: Boolean): Self = StObject.set(x, "Thorough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaultGUID(value: String): Self = StObject.set(x, "VaultGUID", value.asInstanceOf[js.Any])
  }
}
