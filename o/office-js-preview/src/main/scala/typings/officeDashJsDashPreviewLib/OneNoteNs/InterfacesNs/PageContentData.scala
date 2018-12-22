package typings
package officeDashJsDashPreviewLib.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "pageContent.toJSON()". */

trait PageContentData extends js.Object {
  /**
               *
               * Gets the ID of the PageContent object. Read-only.
               *
               * [Api set: OneNoteApi 1.1]
               */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
              *
              * Gets the Image in the PageContent object. Throws an exception if PageContentType is not Image.
              *
              * [Api set: OneNoteApi 1.1]
              */
  var image: js.UndefOr[ImageData] = js.undefined
  /**
              *
              * Gets the ink in the PageContent object. Throws an exception if PageContentType is not Ink.
              *
              * [Api set: OneNoteApi 1.1]
              */
  var ink: js.UndefOr[FloatingInkData] = js.undefined
  /**
               *
               * Gets or sets the left (X-axis) position of the PageContent object.
               *
               * [Api set: OneNoteApi 1.1]
               */
  var left: js.UndefOr[scala.Double] = js.undefined
  /**
              *
              * Gets the Outline in the PageContent object. Throws an exception if PageContentType is not Outline.
              *
              * [Api set: OneNoteApi 1.1]
              */
  var outline: js.UndefOr[OutlineData] = js.undefined
  /**
              *
              * Gets the page that contains the PageContent object. Read-only.
              *
              * [Api set: OneNoteApi 1.1]
              */
  var parentPage: js.UndefOr[PageData] = js.undefined
  /**
               *
               * Gets or sets the top (Y-axis) position of the PageContent object.
               *
               * [Api set: OneNoteApi 1.1]
               */
  var top: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Gets the type of the PageContent object. Read-only.
               *
               * [Api set: OneNoteApi 1.1]
               */
  var `type`: js.UndefOr[
    officeDashJsDashPreviewLib.OneNoteNs.PageContentType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Outline | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Image | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Ink | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Other
  ] = js.undefined
}

