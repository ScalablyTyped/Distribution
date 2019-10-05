package typings.parse.Parse.Query

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// According to https://parseplatform.org/Parse-SDK-JS/api/2.1.0/Parse.Query.html#fullText
trait FullTextOptions extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  var diacriticSensitive: js.UndefOr[Boolean] = js.undefined
  var language: js.UndefOr[String] = js.undefined
}

object FullTextOptions {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    diacriticSensitive: js.UndefOr[Boolean] = js.undefined,
    language: String = null
  ): FullTextOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive)
    if (!js.isUndefined(diacriticSensitive)) __obj.updateDynamic("diacriticSensitive")(diacriticSensitive)
    if (language != null) __obj.updateDynamic("language")(language)
    __obj.asInstanceOf[FullTextOptions]
  }
}

