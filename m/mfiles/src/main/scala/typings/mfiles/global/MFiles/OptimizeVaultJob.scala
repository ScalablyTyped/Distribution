package typings.mfiles.global.MFiles

import typings.mfiles.IOptimizeVaultJob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.OptimizeVaultJob")
@js.native
class OptimizeVaultJob ()
  extends StObject
     with IOptimizeVaultJob {
  
  /* CompleteClass */
  var GarbageCollectFiles: Boolean = js.native
  
  /* CompleteClass */
  override def GetNumberOfSteps(): Double = js.native
  
  /* CompleteClass */
  override def GetOneBasedIndexOfStep(CurrentStep: Double): Double = js.native
  
  /* CompleteClass */
  override def GetStepProgressText(CurrentStep: Double): String = js.native
  
  /* CompleteClass */
  override def Set(GuidVault: String, Thorough: Boolean): Unit = js.native
  
  /* CompleteClass */
  override val Thorough: Boolean = js.native
  
  /* CompleteClass */
  override val VaultGUID: String = js.native
}
