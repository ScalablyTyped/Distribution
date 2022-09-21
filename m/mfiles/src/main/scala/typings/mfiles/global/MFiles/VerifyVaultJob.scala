package typings.mfiles.global.MFiles

import typings.mfiles.IVerifyVaultJob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.VerifyVaultJob")
@js.native
open class VerifyVaultJob ()
  extends StObject
     with IVerifyVaultJob {
  
  /* CompleteClass */
  override def Clone(): IVerifyVaultJob = js.native
  
  /* CompleteClass */
  override val FixErrors: Boolean = js.native
  
  /* CompleteClass */
  override def GetNumberOfSteps(): Double = js.native
  
  /* CompleteClass */
  override def GetOneBasedIndexOfStep(CurrentStep: Double): Double = js.native
  
  /* CompleteClass */
  override def GetStepProgressText(CurrentStep: Double): String = js.native
  
  /* CompleteClass */
  override def Set(GuidVault: String, FixErrors: Boolean, VerifyFileContents: Boolean): Unit = js.native
  
  /* CompleteClass */
  override val VaultGUID: String = js.native
  
  /* CompleteClass */
  override val VerifyFileContents: Boolean = js.native
}
