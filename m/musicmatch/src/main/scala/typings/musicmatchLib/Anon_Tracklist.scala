package typings
package musicmatchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Tracklist extends js.Object {
  var track_list: js.Array[musicmatchLib.musicmatchMod.TrackResult]
}

object Anon_Tracklist {
  @scala.inline
  def apply(track_list: js.Array[musicmatchLib.musicmatchMod.TrackResult]): Anon_Tracklist = {
    val __obj = js.Dynamic.literal(track_list = track_list)
  
    __obj.asInstanceOf[Anon_Tracklist]
  }
}

