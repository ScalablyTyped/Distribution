package typings.plugapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Media extends js.Object {
  var author: String
  var cid: String
  var duration: Double
  var format: Double
  var id: Double
  var image: String
  var title: String
}

object Media {
  @scala.inline
  def apply(
    author: String,
    cid: String,
    duration: Double,
    format: Double,
    id: Double,
    image: String,
    title: String
  ): Media = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Media]
  }
}

