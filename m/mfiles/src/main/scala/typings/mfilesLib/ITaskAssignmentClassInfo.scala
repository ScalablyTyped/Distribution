package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITaskAssignmentClassInfo extends js.Object {
  var AnyAssigneeCompletes: scala.Boolean
  var SignatureForCompletion: ISignatureSettings
  def Clone(): ITaskAssignmentClassInfo
}

object ITaskAssignmentClassInfo {
  @scala.inline
  def apply(
    AnyAssigneeCompletes: scala.Boolean,
    Clone: () => ITaskAssignmentClassInfo,
    SignatureForCompletion: ISignatureSettings
  ): ITaskAssignmentClassInfo = {
    val __obj = js.Dynamic.literal(AnyAssigneeCompletes = AnyAssigneeCompletes, Clone = js.Any.fromFunction0(Clone), SignatureForCompletion = SignatureForCompletion)
  
    __obj.asInstanceOf[ITaskAssignmentClassInfo]
  }
}

