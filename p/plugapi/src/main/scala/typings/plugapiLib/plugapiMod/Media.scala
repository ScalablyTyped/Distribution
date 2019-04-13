package typings
package plugapiLib.plugapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Media extends js.Object {
  var author: java.lang.String
  var cid: java.lang.String
  var duration: scala.Double
  var format: scala.Double
  var id: scala.Double
  var image: java.lang.String
  var title: java.lang.String
}

object Media {
  @scala.inline
  def apply(
    author: java.lang.String,
    cid: java.lang.String,
    duration: scala.Double,
    format: scala.Double,
    id: scala.Double,
    image: java.lang.String,
    title: java.lang.String
  ): Media = {
    val __obj = js.Dynamic.literal(author = author, cid = cid, duration = duration, format = format, id = id, image = image, title = title)
  
    __obj.asInstanceOf[Media]
  }
}

