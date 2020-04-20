package typings.pgFormat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPattern extends js.Object {
  var pattern: AnonIdent
}

object AnonPattern {
  @scala.inline
  def apply(pattern: AnonIdent): AnonPattern = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPattern]
  }
}

