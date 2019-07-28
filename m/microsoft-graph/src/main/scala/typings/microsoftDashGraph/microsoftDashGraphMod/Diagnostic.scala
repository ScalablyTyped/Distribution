package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Diagnostic extends js.Object {
  var message: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object Diagnostic {
  @scala.inline
  def apply(message: String = null, url: String = null): Diagnostic = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Diagnostic]
  }
}

