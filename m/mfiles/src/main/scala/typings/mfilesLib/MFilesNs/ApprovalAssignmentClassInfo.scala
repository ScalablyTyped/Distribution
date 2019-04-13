package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ApprovalAssignmentClassInfo")
@js.native
class ApprovalAssignmentClassInfo ()
  extends mfilesLib.IApprovalAssignmentClassInfo {
  /* CompleteClass */
  override var AnyAssigneeApproves: scala.Boolean = js.native
  /* CompleteClass */
  override var SignatureForApproval: mfilesLib.ISignatureSettings = js.native
  /* CompleteClass */
  override var SignatureForRejection: mfilesLib.ISignatureSettings = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IApprovalAssignmentClassInfo = js.native
}

@JSGlobal("MFiles.ApprovalAssignmentClassInfo")
@js.native
object ApprovalAssignmentClassInfo
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IApprovalAssignmentClassInfo]

