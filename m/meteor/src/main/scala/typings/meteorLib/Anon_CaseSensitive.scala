package typings
package meteorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CaseSensitive extends js.Object {
  @JSName("$caseSensitive")
  var $caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("$diacriticSensitive")
  var $diacriticSensitive: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("$language")
  var $language: js.UndefOr[java.lang.String] = js.undefined
  @JSName("$search")
  var $search: java.lang.String
}

object Anon_CaseSensitive {
  @scala.inline
  def apply(
    $search: java.lang.String,
    $caseSensitive: js.UndefOr[scala.Boolean] = js.undefined,
    $diacriticSensitive: js.UndefOr[scala.Boolean] = js.undefined,
    $language: java.lang.String = null
  ): Anon_CaseSensitive = {
    val __obj = js.Dynamic.literal($search = $search)
    if (!js.isUndefined($caseSensitive)) __obj.updateDynamic("$caseSensitive")($caseSensitive)
    if (!js.isUndefined($diacriticSensitive)) __obj.updateDynamic("$diacriticSensitive")($diacriticSensitive)
    if ($language != null) __obj.updateDynamic("$language")($language)
    __obj.asInstanceOf[Anon_CaseSensitive]
  }
}

