package typings.mfiles.global.MFiles

import typings.mfiles.ILicenseStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.LicenseStatus")
@js.native
open class LicenseStatus ()
  extends StObject
     with ILicenseStatus {
  
  /* CompleteClass */
  override def ClearLicenseCode(): Unit = js.native
  
  /* CompleteClass */
  override val EvaluationDaysLeft: Double = js.native
  
  /* CompleteClass */
  override val EvaluationMode: Boolean = js.native
  
  /* CompleteClass */
  override val Expired: Boolean = js.native
  
  /* CompleteClass */
  override val LicenseCode: String = js.native
  
  /* CompleteClass */
  override val NumOfConcurrentUserLicenses: Double = js.native
  
  /* CompleteClass */
  override val NumOfNamedUserLicenses: Double = js.native
  
  /* CompleteClass */
  override val NumOfReadonlyLicenses: Double = js.native
  
  /* CompleteClass */
  override val SerialNumber: String = js.native
}
