package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filename extends js.Object {
  var filename: js.UndefOr[String] = js.undefined
  var hash: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var url: String
}

object Anon_Filename {
  @scala.inline
  def apply(url: String, filename: String = null, hash: String = null, size: Int | Double = null): Anon_Filename = {
    val __obj = js.Dynamic.literal(url = url)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Filename]
  }
}

