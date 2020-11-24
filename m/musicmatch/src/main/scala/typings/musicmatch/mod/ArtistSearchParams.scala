package typings.musicmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtistSearchParams extends Pageable {
  
  var f_artist_id: js.UndefOr[Double] = js.native
  
  var f_artist_mbid: js.UndefOr[Double] = js.native
  
  var q_artist: js.UndefOr[String] = js.native
}
object ArtistSearchParams {
  
  @scala.inline
  def apply(): ArtistSearchParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtistSearchParams]
  }
  
  @scala.inline
  implicit class ArtistSearchParamsOps[Self <: ArtistSearchParams] (val x: Self) extends AnyVal {
    
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
    def setF_artist_id(value: Double): Self = this.set("f_artist_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteF_artist_id: Self = this.set("f_artist_id", js.undefined)
    
    @scala.inline
    def setF_artist_mbid(value: Double): Self = this.set("f_artist_mbid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteF_artist_mbid: Self = this.set("f_artist_mbid", js.undefined)
    
    @scala.inline
    def setQ_artist(value: String): Self = this.set("q_artist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQ_artist: Self = this.set("q_artist", js.undefined)
  }
}
