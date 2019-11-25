package typings.musicmatch.musicmatchMod

import typings.musicmatch.Anon_Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackSearchResult extends js.Object {
  var message: Anon_Body
}

object TrackSearchResult {
  @scala.inline
  def apply(message: Anon_Body): TrackSearchResult = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TrackSearchResult]
  }
}

