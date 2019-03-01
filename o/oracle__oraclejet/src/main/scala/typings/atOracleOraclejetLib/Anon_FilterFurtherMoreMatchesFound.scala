package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FilterFurtherMoreMatchesFound extends js.Object {
  var filterFurther: js.UndefOr[java.lang.String] = js.undefined
  var moreMatchesFound: js.UndefOr[java.lang.String] = js.undefined
  var noMatchesFound: js.UndefOr[java.lang.String] = js.undefined
  var oneMatchesFound: js.UndefOr[java.lang.String] = js.undefined
  var required: js.UndefOr[Anon_Hint] = js.undefined
  var searchField: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_FilterFurtherMoreMatchesFound {
  @scala.inline
  def apply(
    filterFurther: java.lang.String = null,
    moreMatchesFound: java.lang.String = null,
    noMatchesFound: java.lang.String = null,
    oneMatchesFound: java.lang.String = null,
    required: Anon_Hint = null,
    searchField: java.lang.String = null
  ): Anon_FilterFurtherMoreMatchesFound = {
    val __obj = js.Dynamic.literal()
    if (filterFurther != null) __obj.updateDynamic("filterFurther")(filterFurther)
    if (moreMatchesFound != null) __obj.updateDynamic("moreMatchesFound")(moreMatchesFound)
    if (noMatchesFound != null) __obj.updateDynamic("noMatchesFound")(noMatchesFound)
    if (oneMatchesFound != null) __obj.updateDynamic("oneMatchesFound")(oneMatchesFound)
    if (required != null) __obj.updateDynamic("required")(required)
    if (searchField != null) __obj.updateDynamic("searchField")(searchField)
    __obj.asInstanceOf[Anon_FilterFurtherMoreMatchesFound]
  }
}

