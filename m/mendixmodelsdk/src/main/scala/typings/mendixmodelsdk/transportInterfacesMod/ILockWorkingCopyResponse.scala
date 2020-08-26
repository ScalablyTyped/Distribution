package typings.mendixmodelsdk.transportInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILockWorkingCopyResponse extends js.Object {
  var merge: ILockData = js.native
  var previousMerge: ILockData | Null = js.native
}

object ILockWorkingCopyResponse {
  @scala.inline
  def apply(merge: ILockData): ILockWorkingCopyResponse = {
    val __obj = js.Dynamic.literal(merge = merge.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILockWorkingCopyResponse]
  }
  @scala.inline
  implicit class ILockWorkingCopyResponseOps[Self <: ILockWorkingCopyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMerge(value: ILockData): Self = this.set("merge", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousMerge(value: ILockData): Self = this.set("previousMerge", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousMergeNull: Self = this.set("previousMerge", null)
  }
  
}

