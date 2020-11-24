package typings.musicmatch.mod

import typings.musicmatch.musicmatchStrings.dfxp
import typings.musicmatch.musicmatchStrings.lrc
import typings.musicmatch.musicmatchStrings.stledu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrackSubtitleParams extends js.Object {
  
  var f_subtitle_length: js.UndefOr[Double] = js.native
  
  var f_subtitle_length_max_deviation: js.UndefOr[Double] = js.native
  
  var subtitle_format: js.UndefOr[lrc | dfxp | stledu] = js.native
  
  var track_id: js.UndefOr[Double] = js.native
  
  var track_mbid: js.UndefOr[Double] = js.native
}
object TrackSubtitleParams {
  
  @scala.inline
  def apply(): TrackSubtitleParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackSubtitleParams]
  }
  
  @scala.inline
  implicit class TrackSubtitleParamsOps[Self <: TrackSubtitleParams] (val x: Self) extends AnyVal {
    
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
    def setF_subtitle_length(value: Double): Self = this.set("f_subtitle_length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteF_subtitle_length: Self = this.set("f_subtitle_length", js.undefined)
    
    @scala.inline
    def setF_subtitle_length_max_deviation(value: Double): Self = this.set("f_subtitle_length_max_deviation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteF_subtitle_length_max_deviation: Self = this.set("f_subtitle_length_max_deviation", js.undefined)
    
    @scala.inline
    def setSubtitle_format(value: lrc | dfxp | stledu): Self = this.set("subtitle_format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitle_format: Self = this.set("subtitle_format", js.undefined)
    
    @scala.inline
    def setTrack_id(value: Double): Self = this.set("track_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrack_id: Self = this.set("track_id", js.undefined)
    
    @scala.inline
    def setTrack_mbid(value: Double): Self = this.set("track_mbid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrack_mbid: Self = this.set("track_mbid", js.undefined)
  }
}
