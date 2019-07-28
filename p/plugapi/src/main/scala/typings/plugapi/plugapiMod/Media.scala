package typings.plugapi.plugapiMod

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
    val __obj = js.Dynamic.literal(author = author, cid = cid, duration = duration, format = format, id = id, image = image, title = title)
  
    __obj.asInstanceOf[Media]
  }
}

