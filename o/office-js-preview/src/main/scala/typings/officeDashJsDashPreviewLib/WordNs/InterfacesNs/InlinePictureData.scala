package typings
package officeDashJsDashPreviewLib.WordNs.InterfacesNs

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
  var altTextDescription: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets a string that contains the title for the inline image.
    *
    * [Api set: WordApi 1.1]
    */
  var altTextTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets a number that describes the height of the inline image.
    *
    * [Api set: WordApi 1.1]
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Gets or sets a hyperlink on the image. Use a '#' to separate the address part from the optional location part.
    *
    * [Api set: WordApi 1.1]
    */
  var hyperlink: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets the format of the inline image. Read-only.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var imageFormat: js.UndefOr[
    officeDashJsDashPreviewLib.WordNs.ImageFormat | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Unsupported | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Undefined | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Bmp | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Jpeg | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Gif | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Tiff | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Png | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Icon | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Exif | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Wmf | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Emf | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Pict | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Pdf | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Svg
  ] = js.undefined
  /**
    *
    * Gets or sets a value that indicates whether the inline image retains its original proportions when you resize it.
    *
    * [Api set: WordApi 1.1]
    */
  var lockAspectRatio: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets a number that describes the width of the inline image.
    *
    * [Api set: WordApi 1.1]
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object InlinePictureData {
  @scala.inline
  def apply(
    altTextDescription: java.lang.String = null,
    altTextTitle: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    hyperlink: java.lang.String = null,
    imageFormat: officeDashJsDashPreviewLib.WordNs.ImageFormat | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Unsupported | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Undefined | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Bmp | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Jpeg | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Gif | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Tiff | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Png | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Icon | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Exif | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Wmf | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Emf | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Pict | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Pdf | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Svg = null,
    lockAspectRatio: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
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

