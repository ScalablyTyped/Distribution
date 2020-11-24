package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Move extends js.Object {
  
  /** The added parent object(s). */
  var addedParents: js.UndefOr[js.Array[TargetReference]] = js.native
  
  /** The removed parent object(s). */
  var removedParents: js.UndefOr[js.Array[TargetReference]] = js.native
}
object Move {
  
  @scala.inline
  def apply(): Move = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Move]
  }
  
  @scala.inline
  implicit class MoveOps[Self <: Move] (val x: Self) extends AnyVal {
    
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
    def setAddedParentsVarargs(value: TargetReference*): Self = this.set("addedParents", js.Array(value :_*))
    
    @scala.inline
    def setAddedParents(value: js.Array[TargetReference]): Self = this.set("addedParents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddedParents: Self = this.set("addedParents", js.undefined)
    
    @scala.inline
    def setRemovedParentsVarargs(value: TargetReference*): Self = this.set("removedParents", js.Array(value :_*))
    
    @scala.inline
    def setRemovedParents(value: js.Array[TargetReference]): Self = this.set("removedParents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemovedParents: Self = this.set("removedParents", js.undefined)
  }
}
