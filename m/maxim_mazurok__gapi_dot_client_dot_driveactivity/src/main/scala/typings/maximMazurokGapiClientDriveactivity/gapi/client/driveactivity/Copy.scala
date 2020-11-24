package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Copy extends js.Object {
  
  /** The the original object. */
  var originalObject: js.UndefOr[TargetReference] = js.native
}
object Copy {
  
  @scala.inline
  def apply(): Copy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Copy]
  }
  
  @scala.inline
  implicit class CopyOps[Self <: Copy] (val x: Self) extends AnyVal {
    
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
    def setOriginalObject(value: TargetReference): Self = this.set("originalObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalObject: Self = this.set("originalObject", js.undefined)
  }
}
