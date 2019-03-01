package typings
package pageDashIconLib.PageIconNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchOptions extends js.Object {
  var ext: js.UndefOr[java.lang.String] = js.undefined
}

object FetchOptions {
  @scala.inline
  def apply(ext: java.lang.String = null): FetchOptions = {
    val __obj = js.Dynamic.literal()
    if (ext != null) __obj.updateDynamic("ext")(ext)
    __obj.asInstanceOf[FetchOptions]
  }
}

