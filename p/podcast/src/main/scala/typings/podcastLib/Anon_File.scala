package typings
package podcastLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_File extends js.Object {
  var file: js.UndefOr[java.lang.String] = js.undefined
  var mime: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var url: java.lang.String
}

object Anon_File {
  @scala.inline
  def apply(
    url: java.lang.String,
    file: java.lang.String = null,
    mime: java.lang.String = null,
    size: scala.Int | scala.Double = null
  ): Anon_File = {
    val __obj = js.Dynamic.literal(url = url)
    if (file != null) __obj.updateDynamic("file")(file)
    if (mime != null) __obj.updateDynamic("mime")(mime)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_File]
  }
}

