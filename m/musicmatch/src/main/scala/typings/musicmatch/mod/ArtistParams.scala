package typings.musicmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtistParams extends js.Object {
  var artist_id: js.UndefOr[Double] = js.native
  var artist_mbid: js.UndefOr[Double] = js.native
}

object ArtistParams {
  @scala.inline
  def apply(): ArtistParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtistParams]
  }
  @scala.inline
  implicit class ArtistParamsOps[Self <: ArtistParams] (val x: Self) extends AnyVal {
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
    def setArtist_id(value: Double): Self = this.set("artist_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArtist_id: Self = this.set("artist_id", js.undefined)
    @scala.inline
    def setArtist_mbid(value: Double): Self = this.set("artist_mbid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArtist_mbid: Self = this.set("artist_mbid", js.undefined)
  }
  
}

