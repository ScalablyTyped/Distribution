package typings.musicmatch.mod

import typings.musicmatch.anon.Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackSearchResult extends js.Object {
  var message: Body
}

object TrackSearchResult {
  @scala.inline
  def apply(message: Body): TrackSearchResult = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackSearchResult]
  }
}

