package typings.postcssUrl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  /**
    * File path.
    */
  var file: js.UndefOr[String] = js.undefined
  /**
    * PostCSS from option.
    */
  var from: js.UndefOr[String] = js.undefined
  /**
    * PostCSS to option.
    */
  var to: js.UndefOr[String] = js.undefined
}

object File {
  @scala.inline
  def apply(file: String = null, from: String = null, to: String = null): File = {
    val __obj = js.Dynamic.literal()
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
}

