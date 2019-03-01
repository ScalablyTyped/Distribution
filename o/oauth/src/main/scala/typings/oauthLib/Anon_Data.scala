package typings
package oauthLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var statusCode: scala.Double
}

object Anon_Data {
  @scala.inline
  def apply(statusCode: scala.Double, data: js.Any = null): Anon_Data = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("statusCode")(statusCode)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[Anon_Data]
  }
}

