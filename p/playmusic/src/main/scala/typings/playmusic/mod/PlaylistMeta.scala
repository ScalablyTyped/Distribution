package typings.playmusic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaylistMeta extends js.Object {
  
  var description: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var shareState: js.UndefOr[String] = js.native
}
object PlaylistMeta {
  
  @scala.inline
  def apply(): PlaylistMeta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistMeta]
  }
  
  @scala.inline
  implicit class PlaylistMetaOps[Self <: PlaylistMeta] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setShareState(value: String): Self = this.set("shareState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShareState: Self = this.set("shareState", js.undefined)
  }
}
