package typings.pgDashPromise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Prefix extends js.Object {
  var prefix: js.UndefOr[String] = js.undefined
  var source: js.UndefOr[js.Object] = js.undefined
}

object Anon_Prefix {
  @scala.inline
  def apply(prefix: String = null, source: js.Object = null): Anon_Prefix = {
    val __obj = js.Dynamic.literal()
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[Anon_Prefix]
  }
}

