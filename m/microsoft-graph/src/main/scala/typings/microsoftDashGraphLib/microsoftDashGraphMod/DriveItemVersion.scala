package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DriveItemVersion extends BaseItemVersion {
  /** The content stream for this version of the item. */
  var content: js.UndefOr[js.Any] = js.undefined
  /** Indicates the size of the content stream for this version of the item. */
  var size: js.UndefOr[scala.Double] = js.undefined
}

object DriveItemVersion {
  @scala.inline
  def apply(
    content: js.Any = null,
    id: java.lang.String = null,
    lastModifiedBy: IdentitySet = null,
    lastModifiedDateTime: java.lang.String = null,
    publication: PublicationFacet = null,
    size: scala.Int | scala.Double = null
  ): DriveItemVersion = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastModifiedBy != null) __obj.updateDynamic("lastModifiedBy")(lastModifiedBy)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (publication != null) __obj.updateDynamic("publication")(publication)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[DriveItemVersion]
  }
}

