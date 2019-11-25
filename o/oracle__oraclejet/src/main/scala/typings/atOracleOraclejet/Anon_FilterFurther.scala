package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FilterFurther extends js.Object {
  var filterFurther: js.UndefOr[String] = js.undefined
  var noMatchesFound: js.UndefOr[String] = js.undefined
  var required: js.UndefOr[Anon_Hint] = js.undefined
}

object Anon_FilterFurther {
  @scala.inline
  def apply(filterFurther: String = null, noMatchesFound: String = null, required: Anon_Hint = null): Anon_FilterFurther = {
    val __obj = js.Dynamic.literal()
    if (filterFurther != null) __obj.updateDynamic("filterFurther")(filterFurther.asInstanceOf[js.Any])
    if (noMatchesFound != null) __obj.updateDynamic("noMatchesFound")(noMatchesFound.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FilterFurther]
  }
}

