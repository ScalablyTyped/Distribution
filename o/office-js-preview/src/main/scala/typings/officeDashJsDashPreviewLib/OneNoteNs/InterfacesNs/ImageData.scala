package typings
package officeDashJsDashPreviewLib.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "image.toJSON()". */
trait ImageData extends js.Object {
  /**
    *
    * Gets or sets the description of the Image.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the height of the Image layout.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Gets or sets the hyperlink of the Image.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var hyperlink: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets the ID of the Image object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets the data obtained by OCR (Optical Character Recognition) of this Image, such as OCR text and language.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var ocrData: js.UndefOr[officeDashJsDashPreviewLib.OneNoteNs.ImageOcrData] = js.undefined
  /**
    *
    * Gets or sets the width of the Image layout.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ImageData {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    hyperlink: java.lang.String = null,
    id: java.lang.String = null,
    ocrData: officeDashJsDashPreviewLib.OneNoteNs.ImageOcrData = null,
    width: scala.Int | scala.Double = null
  ): ImageData = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hyperlink != null) __obj.updateDynamic("hyperlink")(hyperlink)
    if (id != null) __obj.updateDynamic("id")(id)
    if (ocrData != null) __obj.updateDynamic("ocrData")(ocrData)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageData]
  }
}

