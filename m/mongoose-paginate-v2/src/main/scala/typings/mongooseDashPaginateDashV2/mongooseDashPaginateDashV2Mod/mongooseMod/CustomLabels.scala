package typings.mongooseDashPaginateDashV2.mongooseDashPaginateDashV2Mod.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomLabels extends js.Object {
  var docs: js.UndefOr[String] = js.undefined
  var limit: js.UndefOr[String] = js.undefined
  var nextPage: js.UndefOr[String] = js.undefined
  var page: js.UndefOr[String] = js.undefined
  var prevPage: js.UndefOr[String] = js.undefined
  var totalDocs: js.UndefOr[String] = js.undefined
  var totalPages: js.UndefOr[String] = js.undefined
}

object CustomLabels {
  @scala.inline
  def apply(
    docs: String = null,
    limit: String = null,
    nextPage: String = null,
    page: String = null,
    prevPage: String = null,
    totalDocs: String = null,
    totalPages: String = null
  ): CustomLabels = {
    val __obj = js.Dynamic.literal()
    if (docs != null) __obj.updateDynamic("docs")(docs.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (nextPage != null) __obj.updateDynamic("nextPage")(nextPage.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (prevPage != null) __obj.updateDynamic("prevPage")(prevPage.asInstanceOf[js.Any])
    if (totalDocs != null) __obj.updateDynamic("totalDocs")(totalDocs.asInstanceOf[js.Any])
    if (totalPages != null) __obj.updateDynamic("totalPages")(totalPages.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomLabels]
  }
}

