package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPromiseResult[T] extends js.Object {
  var `type`: PromiseResultType
  var value: T
}

object IPromiseResult {
  @scala.inline
  def apply[T](`type`: PromiseResultType, value: T): IPromiseResult[T] = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPromiseResult[T]]
  }
}

