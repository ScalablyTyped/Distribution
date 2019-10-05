package typings.oauth2orize.oauth2orizeMod.grant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  // For maximum flexibility, multiple scope spearators can optionally be
  // allowed.  This allows the server to accept clients that separate scope
  // with either space or comma (' ', ',').  This violates the specification,
  // but achieves compatibility with existing client libraries that are already
  // deployed.
  var scopeSeparator: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(scopeSeparator: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (scopeSeparator != null) __obj.updateDynamic("scopeSeparator")(scopeSeparator)
    __obj.asInstanceOf[Options]
  }
}

