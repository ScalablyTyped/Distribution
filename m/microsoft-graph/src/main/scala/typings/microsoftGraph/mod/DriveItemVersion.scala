package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DriveItemVersion extends BaseItemVersion {
  // The content stream for this version of the item.
  var content: js.UndefOr[js.Any] = js.undefined
  // Indicates the size of the content stream for this version of the item.
  var size: js.UndefOr[Double] = js.undefined
}

object DriveItemVersion {
  @scala.inline
  def apply(
    content: js.Any = null,
    id: String = null,
    lastModifiedBy: IdentitySet = null,
    lastModifiedDateTime: String = null,
    publication: PublicationFacet = null,
    size: js.UndefOr[Double] = js.undefined
  ): DriveItemVersion = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastModifiedBy != null) __obj.updateDynamic("lastModifiedBy")(lastModifiedBy.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (publication != null) __obj.updateDynamic("publication")(publication.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DriveItemVersion]
  }
}

