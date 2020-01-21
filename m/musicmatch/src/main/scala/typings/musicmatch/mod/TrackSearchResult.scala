package typings.musicmatch.mod

import typings.musicmatch.AnonBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackSearchResult extends js.Object {
  var message: AnonBody
}

object TrackSearchResult {
  @scala.inline
  def apply(message: AnonBody): TrackSearchResult = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TrackSearchResult]
  }
}

