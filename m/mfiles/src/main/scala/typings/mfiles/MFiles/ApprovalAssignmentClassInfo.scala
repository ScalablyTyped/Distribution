package typings.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IApprovalAssignmentClassInfo
import typings.mfiles.ISignatureSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ApprovalAssignmentClassInfo")
@js.native
class ApprovalAssignmentClassInfo () extends IApprovalAssignmentClassInfo {
  /* CompleteClass */
  override var AnyAssigneeApproves: Boolean = js.native
  /* CompleteClass */
  override var SignatureForApproval: ISignatureSettings = js.native
  /* CompleteClass */
  override var SignatureForRejection: ISignatureSettings = js.native
  /* CompleteClass */
  override def Clone(): IApprovalAssignmentClassInfo = js.native
}

@JSGlobal("MFiles.ApprovalAssignmentClassInfo")
@js.native
object ApprovalAssignmentClassInfo extends Instantiable0[IApprovalAssignmentClassInfo]

