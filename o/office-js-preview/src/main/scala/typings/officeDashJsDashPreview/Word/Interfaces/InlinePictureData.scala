package typings.officeDashJsDashPreview.Word.Interfaces

import typings.officeDashJsDashPreview.Word.ImageFormat
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Bmp
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Emf
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Exif
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Gif
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Icon
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Jpeg
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Pdf
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Pict
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Png
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Svg
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Tiff
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Undefined
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Unsupported
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Wmf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "inlinePicture.toJSON()". */
trait InlinePictureData extends js.Object {
  /**
    *
    * Gets or sets a string that represents the alternative text associated with the inline image.
    *
    * [Api set: WordApi 1.1]
    */
  var altTextDescription: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets or sets a string that contains the title for the inline image.
    *
    * [Api set: WordApi 1.1]
    */
  var altTextTitle: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets or sets a number that describes the height of the inline image.
    *
    * [Api set: WordApi 1.1]
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    *
    * Gets or sets a hyperlink on the image. Use a '#' to separate the address part from the optional location part.
    *
    * [Api set: WordApi 1.1]
    */
  var hyperlink: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets the format of the inline image. Read-only.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var imageFormat: js.UndefOr[
    ImageFormat | Unsupported | Undefined | Bmp | Jpeg | Gif | Tiff | Png | Icon | Exif | Wmf | Emf | Pict | Pdf | Svg
  ] = js.undefined
  /**
    *
    * Gets or sets a value that indicates whether the inline image retains its original proportions when you resize it.
    *
    * [Api set: WordApi 1.1]
    */
  var lockAspectRatio: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets a number that describes the width of the inline image.
    *
    * [Api set: WordApi 1.1]
    */
  var width: js.UndefOr[Double] = js.undefined
}

object InlinePictureData {
  @scala.inline
  def apply(
    altTextDescription: String = null,
    altTextTitle: String = null,
    height: Int | Double = null,
    hyperlink: String = null,
    imageFormat: ImageFormat | Unsupported | Undefined | Bmp | Jpeg | Gif | Tiff | Png | Icon | Exif | Wmf | Emf | Pict | Pdf | Svg = null,
    lockAspectRatio: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): InlinePictureData = {
    val __obj = js.Dynamic.literal()
    if (altTextDescription != null) __obj.updateDynamic("altTextDescription")(altTextDescription)
    if (altTextTitle != null) __obj.updateDynamic("altTextTitle")(altTextTitle)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hyperlink != null) __obj.updateDynamic("hyperlink")(hyperlink)
    if (imageFormat != null) __obj.updateDynamic("imageFormat")(imageFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(lockAspectRatio)) __obj.updateDynamic("lockAspectRatio")(lockAspectRatio)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlinePictureData]
  }
}

