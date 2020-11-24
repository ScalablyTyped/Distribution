package typings.musicmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrackParams extends js.Object {
  
  var track_id: js.UndefOr[Double] = js.native
  
  var track_mbid: js.UndefOr[Double] = js.native
}
object TrackParams {
  
  @scala.inline
  def apply(): TrackParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackParams]
  }
  
  @scala.inline
  implicit class TrackParamsOps[Self <: TrackParams] (val x: Self) extends AnyVal {
    
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
    def setTrack_id(value: Double): Self = this.set("track_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrack_id: Self = this.set("track_id", js.undefined)
    
    @scala.inline
    def setTrack_mbid(value: Double): Self = this.set("track_mbid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrack_mbid: Self = this.set("track_mbid", js.undefined)
  }
}
