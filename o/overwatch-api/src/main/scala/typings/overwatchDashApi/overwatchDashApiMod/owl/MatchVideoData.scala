package typings.overwatchDashApi.overwatchDashApiMod.owl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchVideoData extends js.Object {
  var description: String
  var name: Double
  var thumbnailUrl: String
  var vodLink: String
  var youtubeId: String
}

object MatchVideoData {
  @scala.inline
  def apply(description: String, name: Double, thumbnailUrl: String, vodLink: String, youtubeId: String): MatchVideoData = {
    val __obj = js.Dynamic.literal(description = description, name = name, thumbnailUrl = thumbnailUrl, vodLink = vodLink, youtubeId = youtubeId)
  
    __obj.asInstanceOf[MatchVideoData]
  }
}

