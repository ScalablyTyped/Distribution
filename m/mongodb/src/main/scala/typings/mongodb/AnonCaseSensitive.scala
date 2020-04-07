package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCaseSensitive extends js.Object {
  @JSName("$caseSensitive")
  var $caseSensitive: js.UndefOr[Boolean] = js.undefined
  @JSName("$diacraticSensitive")
  var $diacraticSensitive: js.UndefOr[Boolean] = js.undefined
  @JSName("$language")
  var $language: js.UndefOr[String] = js.undefined
  @JSName("$search")
  var $search: String
}

object AnonCaseSensitive {
  @scala.inline
  def apply(
    $search: String,
    $caseSensitive: js.UndefOr[Boolean] = js.undefined,
    $diacraticSensitive: js.UndefOr[Boolean] = js.undefined,
    $language: String = null
  ): AnonCaseSensitive = {
    val __obj = js.Dynamic.literal($search = $search.asInstanceOf[js.Any])
    if (!js.isUndefined($caseSensitive)) __obj.updateDynamic("$caseSensitive")($caseSensitive.asInstanceOf[js.Any])
    if (!js.isUndefined($diacraticSensitive)) __obj.updateDynamic("$diacraticSensitive")($diacraticSensitive.asInstanceOf[js.Any])
    if ($language != null) __obj.updateDynamic("$language")($language.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCaseSensitive]
  }
}

