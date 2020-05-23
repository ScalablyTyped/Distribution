package typings.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaseSensitive extends js.Object {
  @JSName("$caseSensitive")
  var $caseSensitive: js.UndefOr[Boolean] = js.undefined
  @JSName("$diacriticSensitive")
  var $diacriticSensitive: js.UndefOr[Boolean] = js.undefined
  @JSName("$language")
  var $language: js.UndefOr[String] = js.undefined
  @JSName("$search")
  var $search: String
}

object CaseSensitive {
  @scala.inline
  def apply(
    $search: String,
    $caseSensitive: js.UndefOr[Boolean] = js.undefined,
    $diacriticSensitive: js.UndefOr[Boolean] = js.undefined,
    $language: String = null
  ): CaseSensitive = {
    val __obj = js.Dynamic.literal($search = $search.asInstanceOf[js.Any])
    if (!js.isUndefined($caseSensitive)) __obj.updateDynamic("$caseSensitive")($caseSensitive.get.asInstanceOf[js.Any])
    if (!js.isUndefined($diacriticSensitive)) __obj.updateDynamic("$diacriticSensitive")($diacriticSensitive.get.asInstanceOf[js.Any])
    if ($language != null) __obj.updateDynamic("$language")($language.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaseSensitive]
  }
}

