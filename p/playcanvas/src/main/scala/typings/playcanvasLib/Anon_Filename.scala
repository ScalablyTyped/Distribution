package typings
package playcanvasLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filename extends js.Object {
  var filename: js.UndefOr[java.lang.String] = js.undefined
  var hash: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var url: java.lang.String
}

object Anon_Filename {
  @scala.inline
  def apply(
    url: java.lang.String,
    filename: java.lang.String = null,
    hash: java.lang.String = null,
    size: scala.Int | scala.Double = null
  ): Anon_Filename = {
    val __obj = js.Dynamic.literal(url = url)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Filename]
  }
}

