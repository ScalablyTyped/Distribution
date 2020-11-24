package typings.musicmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlbumParams extends js.Object {
  
  var album_id: Double = js.native
}
object AlbumParams {
  
  @scala.inline
  def apply(album_id: Double): AlbumParams = {
    val __obj = js.Dynamic.literal(album_id = album_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlbumParams]
  }
  
  @scala.inline
  implicit class AlbumParamsOps[Self <: AlbumParams] (val x: Self) extends AnyVal {
    
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
    def setAlbum_id(value: Double): Self = this.set("album_id", value.asInstanceOf[js.Any])
  }
}
