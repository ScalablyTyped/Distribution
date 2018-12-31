package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IApprovalAssignmentClassInfo extends js.Object {
  var AnyAssigneeApproves: scala.Boolean
  var SignatureForApproval: ISignatureSettings
  var SignatureForRejection: ISignatureSettings
  def Clone(): IApprovalAssignmentClassInfo
}

