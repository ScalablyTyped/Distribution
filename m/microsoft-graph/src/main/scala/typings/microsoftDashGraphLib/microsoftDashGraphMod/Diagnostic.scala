package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Diagnostic extends js.Object {
  var message: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Diagnostic {
  @scala.inline
  def apply(message: java.lang.String = null, url: java.lang.String = null): Diagnostic = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Diagnostic]
  }
}

