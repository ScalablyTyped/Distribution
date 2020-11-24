package typings.musicmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtistAlbumsParams
  extends ArtistParams
     with Pageable {
  
  var g_album_name: js.UndefOr[TBoolean] = js.native
  
  var s_release_date: js.UndefOr[TSort] = js.native
}
object ArtistAlbumsParams {
  
  @scala.inline
  def apply(): ArtistAlbumsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtistAlbumsParams]
  }
  
  @scala.inline
  implicit class ArtistAlbumsParamsOps[Self <: ArtistAlbumsParams] (val x: Self) extends AnyVal {
    
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
    def setG_album_name(value: TBoolean): Self = this.set("g_album_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteG_album_name: Self = this.set("g_album_name", js.undefined)
    
    @scala.inline
    def setS_release_date(value: TSort): Self = this.set("s_release_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS_release_date: Self = this.set("s_release_date", js.undefined)
  }
}
