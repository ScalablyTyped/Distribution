package typings.officeJsPreview.Word.Interfaces

import typings.officeJsPreview.Word.ImageFormat
import typings.officeJsPreview.officeJsPreviewStrings.Bmp_
import typings.officeJsPreview.officeJsPreviewStrings.Emf
import typings.officeJsPreview.officeJsPreviewStrings.Exif
import typings.officeJsPreview.officeJsPreviewStrings.Gif_
import typings.officeJsPreview.officeJsPreviewStrings.Icon
import typings.officeJsPreview.officeJsPreviewStrings.Jpeg_
import typings.officeJsPreview.officeJsPreviewStrings.Pdf
import typings.officeJsPreview.officeJsPreviewStrings.Pict
import typings.officeJsPreview.officeJsPreviewStrings.Png_
import typings.officeJsPreview.officeJsPreviewStrings.Svg_
import typings.officeJsPreview.officeJsPreviewStrings.Tiff
import typings.officeJsPreview.officeJsPreviewStrings.Undefined
import typings.officeJsPreview.officeJsPreviewStrings.Unsupported
import typings.officeJsPreview.officeJsPreviewStrings.Wmf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `inlinePicture.toJSON()`. */
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
    ImageFormat | Unsupported | Undefined | Bmp_ | Jpeg_ | Gif_ | Tiff | Png_ | Icon | Exif | Wmf | Emf | Pict | Pdf | Svg_
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
    height: js.UndefOr[Double] = js.undefined,
    hyperlink: String = null,
    imageFormat: ImageFormat | Unsupported | Undefined | Bmp_ | Jpeg_ | Gif_ | Tiff | Png_ | Icon | Exif | Wmf | Emf | Pict | Pdf | Svg_ = null,
    lockAspectRatio: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): InlinePictureData = {
    val __obj = js.Dynamic.literal()
    if (altTextDescription != null) __obj.updateDynamic("altTextDescription")(altTextDescription.asInstanceOf[js.Any])
    if (altTextTitle != null) __obj.updateDynamic("altTextTitle")(altTextTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (hyperlink != null) __obj.updateDynamic("hyperlink")(hyperlink.asInstanceOf[js.Any])
    if (imageFormat != null) __obj.updateDynamic("imageFormat")(imageFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(lockAspectRatio)) __obj.updateDynamic("lockAspectRatio")(lockAspectRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlinePictureData]
  }
}

