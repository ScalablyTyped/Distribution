package typings.phantomjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Charset extends js.Object {
  var charset: js.UndefOr[String] = js.undefined
  var mode: String
}

object Anon_Charset {
  @scala.inline
  def apply(mode: String, charset: String = null): Anon_Charset = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    if (charset != null) __obj.updateDynamic("charset")(charset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Charset]
  }
}

