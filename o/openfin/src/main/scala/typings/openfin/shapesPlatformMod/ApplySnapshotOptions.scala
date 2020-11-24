package typings.openfin.shapesPlatformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplySnapshotOptions extends js.Object {
  
  var closeExistingWindows: js.UndefOr[Boolean] = js.native
  
  var skipOutOfBoundsCheck: js.UndefOr[Boolean] = js.native
}
object ApplySnapshotOptions {
  
  @scala.inline
  def apply(): ApplySnapshotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplySnapshotOptions]
  }
  
  @scala.inline
  implicit class ApplySnapshotOptionsOps[Self <: ApplySnapshotOptions] (val x: Self) extends AnyVal {
    
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
    def setCloseExistingWindows(value: Boolean): Self = this.set("closeExistingWindows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseExistingWindows: Self = this.set("closeExistingWindows", js.undefined)
    
    @scala.inline
    def setSkipOutOfBoundsCheck(value: Boolean): Self = this.set("skipOutOfBoundsCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipOutOfBoundsCheck: Self = this.set("skipOutOfBoundsCheck", js.undefined)
  }
}
