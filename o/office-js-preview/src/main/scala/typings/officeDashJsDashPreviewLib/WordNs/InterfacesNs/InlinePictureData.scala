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
    * Gets the parent paragraph that contains the inline image. Read-only.
    *
    * [Api set: WordApi 1.2]
    */
  var paragraph: js.UndefOr[ParagraphData] = js.undefined
  /**
    *
    * Gets the content control that contains the inline image. Throws if there isn't a parent content control. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var parentContentControl: js.UndefOr[ContentControlData] = js.undefined
  /**
    *
    * Gets the content control that contains the inline image. Returns a null object if there isn't a parent content control. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var parentContentControlOrNullObject: js.UndefOr[ContentControlData] = js.undefined
  /**
    *
    * Gets the table that contains the inline image. Throws if it is not contained in a table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTable: js.UndefOr[TableData] = js.undefined
  /**
    *
    * Gets the table cell that contains the inline image. Throws if it is not contained in a table cell. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableCell: js.UndefOr[TableCellData] = js.undefined
  /**
    *
    * Gets the table cell that contains the inline image. Returns a null object if it is not contained in a table cell. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableCellOrNullObject: js.UndefOr[TableCellData] = js.undefined
  /**
    *
    * Gets the table that contains the inline image. Returns a null object if it is not contained in a table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableOrNullObject: js.UndefOr[TableData] = js.undefined
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
    paragraph: ParagraphData = null,
    parentContentControl: ContentControlData = null,
    parentContentControlOrNullObject: ContentControlData = null,
    parentTable: TableData = null,
    parentTableCell: TableCellData = null,
    parentTableCellOrNullObject: TableCellData = null,
    parentTableOrNullObject: TableData = null,
    width: scala.Int | scala.Double = null
  ): InlinePictureData = {
    val __obj = js.Dynamic.literal()
    if (altTextDescription != null) __obj.updateDynamic("altTextDescription")(altTextDescription)
    if (altTextTitle != null) __obj.updateDynamic("altTextTitle")(altTextTitle)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hyperlink != null) __obj.updateDynamic("hyperlink")(hyperlink)
    if (imageFormat != null) __obj.updateDynamic("imageFormat")(imageFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(lockAspectRatio)) __obj.updateDynamic("lockAspectRatio")(lockAspectRatio)
    if (paragraph != null) __obj.updateDynamic("paragraph")(paragraph)
    if (parentContentControl != null) __obj.updateDynamic("parentContentControl")(parentContentControl)
    if (parentContentControlOrNullObject != null) __obj.updateDynamic("parentContentControlOrNullObject")(parentContentControlOrNullObject)
    if (parentTable != null) __obj.updateDynamic("parentTable")(parentTable)
    if (parentTableCell != null) __obj.updateDynamic("parentTableCell")(parentTableCell)
    if (parentTableCellOrNullObject != null) __obj.updateDynamic("parentTableCellOrNullObject")(parentTableCellOrNullObject)
    if (parentTableOrNullObject != null) __obj.updateDynamic("parentTableOrNullObject")(parentTableOrNullObject)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlinePictureData]
  }
}

