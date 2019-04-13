package typings
package orientjsLib.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOptions extends js.Object {
  var `class`: js.UndefOr[java.lang.String] = js.undefined
  var fetchPlan: js.UndefOr[js.Any] = js.undefined
  var language: js.UndefOr[orientjsLib.orientjsLibStrings.SQL | orientjsLib.orientjsLibStrings.Javascript] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var mode: js.UndefOr[
    orientjsLib.orientjsLibStrings.s | orientjsLib.orientjsLibStrings.a | orientjsLib.orientjsLibStrings.l
  ] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
  var token: js.UndefOr[js.Any] = js.undefined
}

object QueryOptions {
  @scala.inline
  def apply(
    `class`: java.lang.String = null,
    fetchPlan: js.Any = null,
    language: orientjsLib.orientjsLibStrings.SQL | orientjsLib.orientjsLibStrings.Javascript = null,
    limit: scala.Int | scala.Double = null,
    mode: orientjsLib.orientjsLibStrings.s | orientjsLib.orientjsLibStrings.a | orientjsLib.orientjsLibStrings.l = null,
    params: js.Any = null,
    token: js.Any = null
  ): QueryOptions = {
    val __obj = js.Dynamic.literal()
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (fetchPlan != null) __obj.updateDynamic("fetchPlan")(fetchPlan)
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params)
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[QueryOptions]
  }
}

