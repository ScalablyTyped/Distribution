package typings.openfin.anon

import typings.openfin.openfinStrings.clean
import typings.openfin.openfinStrings.failed
import typings.openfin.openfinStrings.terminated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var result: clean | terminated | failed
}

object Result {
  @scala.inline
  def apply(result: clean | terminated | failed): Result = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

