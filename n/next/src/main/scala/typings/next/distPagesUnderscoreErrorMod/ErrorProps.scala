package typings.next.distPagesUnderscoreErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorProps extends js.Object {
  var statusCode: Double
  var title: js.UndefOr[String] = js.undefined
}

object ErrorProps {
  @scala.inline
  def apply(statusCode: Double, title: String = null): ErrorProps = {
    val __obj = js.Dynamic.literal(statusCode = statusCode)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ErrorProps]
  }
}

