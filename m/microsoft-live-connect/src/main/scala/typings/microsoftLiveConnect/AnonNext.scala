package typings.microsoftLiveConnect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNext extends js.Object {
  /**
    * Path string for the next set of results.
    */
  var next: js.UndefOr[String] = js.undefined
  /**
    * Path string for the previous set of results.
    */
  var previous: js.UndefOr[String] = js.undefined
}

object AnonNext {
  @scala.inline
  def apply(next: String = null, previous: String = null): AnonNext = {
    val __obj = js.Dynamic.literal()
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (previous != null) __obj.updateDynamic("previous")(previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNext]
  }
}

