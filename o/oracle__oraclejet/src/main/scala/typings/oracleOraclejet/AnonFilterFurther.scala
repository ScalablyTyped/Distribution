package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilterFurther extends js.Object {
  var filterFurther: js.UndefOr[String] = js.undefined
  var noMatchesFound: js.UndefOr[String] = js.undefined
  var required: js.UndefOr[AnonHint] = js.undefined
}

object AnonFilterFurther {
  @scala.inline
  def apply(filterFurther: String = null, noMatchesFound: String = null, required: AnonHint = null): AnonFilterFurther = {
    val __obj = js.Dynamic.literal()
    if (filterFurther != null) __obj.updateDynamic("filterFurther")(filterFurther.asInstanceOf[js.Any])
    if (noMatchesFound != null) __obj.updateDynamic("noMatchesFound")(noMatchesFound.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilterFurther]
  }
}

