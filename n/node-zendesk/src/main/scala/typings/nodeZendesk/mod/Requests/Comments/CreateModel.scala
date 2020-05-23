package typings.nodeZendesk.mod.Requests.Comments

import typings.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateModel extends js.Object {
  var author_id: js.UndefOr[ZendeskID] = js.undefined
  var body: js.UndefOr[String] = js.undefined
  var html_body: js.UndefOr[String] = js.undefined
  var public: js.UndefOr[Boolean] = js.undefined
  var request_id: js.UndefOr[Double] = js.undefined
  var uploads: js.UndefOr[js.Array[String]] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object CreateModel {
  @scala.inline
  def apply(
    author_id: js.UndefOr[ZendeskID] = js.undefined,
    body: String = null,
    html_body: String = null,
    public: js.UndefOr[Boolean] = js.undefined,
    request_id: js.UndefOr[Double] = js.undefined,
    uploads: js.Array[String] = null,
    url: String = null
  ): CreateModel = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(author_id)) __obj.updateDynamic("author_id")(author_id.get.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (html_body != null) __obj.updateDynamic("html_body")(html_body.asInstanceOf[js.Any])
    if (!js.isUndefined(public)) __obj.updateDynamic("public")(public.get.asInstanceOf[js.Any])
    if (!js.isUndefined(request_id)) __obj.updateDynamic("request_id")(request_id.get.asInstanceOf[js.Any])
    if (uploads != null) __obj.updateDynamic("uploads")(uploads.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModel]
  }
}

