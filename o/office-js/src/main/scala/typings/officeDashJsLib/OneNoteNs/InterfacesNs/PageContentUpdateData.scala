package typings
package officeDashJsLib.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the PageContent object, for use in "pageContent.set({ ... })". */
trait PageContentUpdateData extends js.Object {
  /**
    *
    * Gets the Image in the PageContent object. Throws an exception if PageContentType is not Image.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var image: js.UndefOr[ImageUpdateData] = js.undefined
  /**
    *
    * Gets or sets the left (X-axis) position of the PageContent object.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var left: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Gets or sets the top (Y-axis) position of the PageContent object.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var top: js.UndefOr[scala.Double] = js.undefined
}

object PageContentUpdateData {
  @scala.inline
  def apply(
    image: ImageUpdateData = null,
    left: scala.Int | scala.Double = null,
    top: scala.Int | scala.Double = null
  ): PageContentUpdateData = {
    val __obj = js.Dynamic.literal()
    if (image != null) __obj.updateDynamic("image")(image)
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageContentUpdateData]
  }
}

