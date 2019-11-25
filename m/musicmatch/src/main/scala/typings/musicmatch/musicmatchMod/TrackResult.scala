package typings.musicmatch.musicmatchMod

import typings.musicmatch.Anon_Albumid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackResult extends js.Object {
  var track: Anon_Albumid
}

object TrackResult {
  @scala.inline
  def apply(track: Anon_Albumid): TrackResult = {
    val __obj = js.Dynamic.literal(track = track.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TrackResult]
  }
}

