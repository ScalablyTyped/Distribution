package typings.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.ILicenseStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.LicenseStatus")
@js.native
class LicenseStatus () extends ILicenseStatus {
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
  /* CompleteClass */
  override def ClearLicenseCode(): Unit = js.native
}

@JSGlobal("MFiles.LicenseStatus")
@js.native
object LicenseStatus extends Instantiable0[ILicenseStatus]

