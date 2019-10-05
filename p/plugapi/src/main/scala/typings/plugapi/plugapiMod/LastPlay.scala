package typings.plugapi.plugapiMod

import typings.plugapi.plugapiMod.User.DJ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LastPlay extends js.Object {
  var dj: DJ
  var media: Media
  var score: Score
}

object LastPlay {
  @scala.inline
  def apply(dj: DJ, media: Media, score: Score): LastPlay = {
    val __obj = js.Dynamic.literal(dj = dj, media = media, score = score)
  
    __obj.asInstanceOf[LastPlay]
  }
}

