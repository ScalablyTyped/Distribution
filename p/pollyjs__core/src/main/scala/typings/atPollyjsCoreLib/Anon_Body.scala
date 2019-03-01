package typings
package atPollyjsCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: js.UndefOr[scala.Boolean | (atPollyjsCoreLib.atPollyjsCoreMod.MatchBy[_, _])] = js.undefined
  var headers: js.UndefOr[
    scala.Boolean | Anon_Exclude | (atPollyjsCoreLib.atPollyjsCoreMod.MatchBy[
      stdLib.Record[java.lang.String, java.lang.String], 
      stdLib.Record[java.lang.String, java.lang.String]
    ])
  ] = js.undefined
  var method: js.UndefOr[
    scala.Boolean | (atPollyjsCoreLib.atPollyjsCoreMod.MatchBy[java.lang.String, java.lang.String])
  ] = js.undefined
  var order: js.UndefOr[scala.Boolean] = js.undefined
  var url: js.UndefOr[Anon_Hash] = js.undefined
}

object Anon_Body {
  @scala.inline
  def apply(
    body: scala.Boolean | (atPollyjsCoreLib.atPollyjsCoreMod.MatchBy[_, _]) = null,
    headers: scala.Boolean | Anon_Exclude | (atPollyjsCoreLib.atPollyjsCoreMod.MatchBy[
      stdLib.Record[java.lang.String, java.lang.String], 
      stdLib.Record[java.lang.String, java.lang.String]
    ]) = null,
    method: scala.Boolean | (atPollyjsCoreLib.atPollyjsCoreMod.MatchBy[java.lang.String, java.lang.String]) = null,
    order: js.UndefOr[scala.Boolean] = js.undefined,
    url: Anon_Hash = null
  ): Anon_Body = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(order)) __obj.updateDynamic("order")(order)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Body]
  }
}

