package typings
package officeDashJsDashPreviewLib.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         *
         * Represents an Image. An Image can be a direct child of a PageContent object or a Paragraph object.
         *
         * [Api set: OneNoteApi 1.1]
         */

trait ImageLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Gets or sets the description of the Image.
               *
               * [Api set: OneNoteApi 1.1]
               */
  var description: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Gets or sets the height of the Image layout.
               *
               * [Api set: OneNoteApi 1.1]
               */
  var height: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Gets or sets the hyperlink of the Image.
               *
               * [Api set: OneNoteApi 1.1]
               */
  var hyperlink: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Gets the ID of the Image object. Read-only.
               *
               * [Api set: OneNoteApi 1.1]
               */
  var id: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Gets the data obtained by OCR (Optical Character Recognition) of this Image, such as OCR text and language.
               *
               * [Api set: OneNoteApi 1.1]
               */
  var ocrData: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * Gets the PageContent object that contains the Image. Throws if the Image is not a direct child of a PageContent. This object defines the position of the Image on the page.
              *
              * [Api set: OneNoteApi 1.1]
              */
  var pageContent: js.UndefOr[PageContentLoadOptions] = js.undefined
  /**
              *
              * Gets the Paragraph object that contains the Image. Throws if the Image is not a direct child of a Paragraph.
              *
              * [Api set: OneNoteApi 1.1]
              */
  var paragraph: js.UndefOr[ParagraphLoadOptions] = js.undefined
  /**
               *
               * Gets or sets the width of the Image layout.
               *
               * [Api set: OneNoteApi 1.1]
               */
  var width: js.UndefOr[scala.Boolean] = js.undefined
}

