package typings.openfin

import typings.openfin.openfinStrings.clean
import typings.openfin.openfinStrings.failed
import typings.openfin.openfinStrings.terminated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResult extends js.Object {
  var result: clean | terminated | failed
}

object AnonResult {
  @scala.inline
  def apply(result: clean | terminated | failed): AnonResult = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonResult]
  }
}

