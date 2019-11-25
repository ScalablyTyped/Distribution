package typings.mendixmodelsdk.distSdkInternalTransportInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILockWorkingCopyResponse extends js.Object {
  var merge: ILockData
  var previousMerge: ILockData | Null
}

object ILockWorkingCopyResponse {
  @scala.inline
  def apply(merge: ILockData, previousMerge: ILockData = null): ILockWorkingCopyResponse = {
    val __obj = js.Dynamic.literal(merge = merge.asInstanceOf[js.Any])
    if (previousMerge != null) __obj.updateDynamic("previousMerge")(previousMerge.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILockWorkingCopyResponse]
  }
}

