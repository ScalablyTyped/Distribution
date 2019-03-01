package typings
package plugapiLib.plugapiMod.PlugAPINs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("author")(author)
    __obj.updateDynamic("cid")(cid)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("image")(image)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Media]
  }
}

