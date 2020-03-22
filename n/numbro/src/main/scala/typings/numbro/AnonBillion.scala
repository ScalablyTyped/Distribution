package typings.numbro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBillion extends js.Object {
  var billion: js.UndefOr[String] = js.undefined
  var million: js.UndefOr[String] = js.undefined
  var thousand: js.UndefOr[String] = js.undefined
  var trillion: js.UndefOr[String] = js.undefined
}

object AnonBillion {
  @scala.inline
  def apply(billion: String = null, million: String = null, thousand: String = null, trillion: String = null): AnonBillion = {
    val __obj = js.Dynamic.literal()
    if (billion != null) __obj.updateDynamic("billion")(billion.asInstanceOf[js.Any])
    if (million != null) __obj.updateDynamic("million")(million.asInstanceOf[js.Any])
    if (thousand != null) __obj.updateDynamic("thousand")(thousand.asInstanceOf[js.Any])
    if (trillion != null) __obj.updateDynamic("trillion")(trillion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBillion]
  }
}

