package typings
package mongodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CaseSensitive extends js.Object {
  @JSName("$caseSensitive")
  var $caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("$diacraticSensitive")
  var $diacraticSensitive: js.UndefOr[scala.Boolean] = js.undefined
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
    $diacraticSensitive: js.UndefOr[scala.Boolean] = js.undefined,
    $language: java.lang.String = null
  ): Anon_CaseSensitive = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$search")($search)
    if (!js.isUndefined($caseSensitive)) __obj.updateDynamic("$caseSensitive")($caseSensitive)
    if (!js.isUndefined($diacraticSensitive)) __obj.updateDynamic("$diacraticSensitive")($diacraticSensitive)
    if ($language != null) __obj.updateDynamic("$language")($language)
    __obj.asInstanceOf[Anon_CaseSensitive]
  }
}

