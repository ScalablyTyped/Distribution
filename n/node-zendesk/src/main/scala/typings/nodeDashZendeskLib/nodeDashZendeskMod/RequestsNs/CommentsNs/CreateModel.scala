package typings
package nodeDashZendeskLib.nodeDashZendeskMod.RequestsNs.CommentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateModel extends js.Object {
  var author_id: js.UndefOr[nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID] = js.undefined
  var body: js.UndefOr[java.lang.String] = js.undefined
  var html_body: js.UndefOr[java.lang.String] = js.undefined
  var public: js.UndefOr[scala.Boolean] = js.undefined
  var request_id: js.UndefOr[scala.Double] = js.undefined
  var uploads: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object CreateModel {
  @scala.inline
  def apply(
    author_id: js.UndefOr[nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID] = js.undefined,
    body: java.lang.String = null,
    html_body: java.lang.String = null,
    public: js.UndefOr[scala.Boolean] = js.undefined,
    request_id: scala.Int | scala.Double = null,
    uploads: js.Array[java.lang.String] = null,
    url: java.lang.String = null
  ): CreateModel = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(author_id)) __obj.updateDynamic("author_id")(author_id)
    if (body != null) __obj.updateDynamic("body")(body)
    if (html_body != null) __obj.updateDynamic("html_body")(html_body)
    if (!js.isUndefined(public)) __obj.updateDynamic("public")(public)
    if (request_id != null) __obj.updateDynamic("request_id")(request_id.asInstanceOf[js.Any])
    if (uploads != null) __obj.updateDynamic("uploads")(uploads)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[CreateModel]
  }
}

