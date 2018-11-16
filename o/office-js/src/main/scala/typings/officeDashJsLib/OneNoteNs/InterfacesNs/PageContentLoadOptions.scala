package typings
package officeDashJsLib.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         *
         * Represents a region on a page that contains top-level content types such as Outline or Image. A PageContent object can be assigned an XY position.
         *
         * [Api set: OneNoteApi 1.1]
         */

trait PageContentLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Gets the ID of the PageContent object. Read-only.
               *
               * [Api set: OneNoteApi 1.1]
               */
  var id: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * Gets the Image in the PageContent object. Throws an exception if PageContentType is not Image.
              *
              * [Api set: OneNoteApi 1.1]
              */
  var image: js.UndefOr[ImageLoadOptions] = js.undefined
  /**
              *
              * Gets the ink in the PageContent object. Throws an exception if PageContentType is not Ink.
              *
              * [Api set: OneNoteApi 1.1]
              */
  var ink: js.UndefOr[FloatingInkLoadOptions] = js.undefined
  /**
               *
               * Gets or sets the left (X-axis) position of the PageContent object.
               *
               * [Api set: OneNoteApi 1.1]
               */
  var left: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * Gets the Outline in the PageContent object. Throws an exception if PageContentType is not Outline.
              *
              * [Api set: OneNoteApi 1.1]
              */
  var outline: js.UndefOr[OutlineLoadOptions] = js.undefined
  /**
              *
              * Gets the page that contains the PageContent object.
              *
              * [Api set: OneNoteApi 1.1]
              */
  var parentPage: js.UndefOr[PageLoadOptions] = js.undefined
  /**
               *
               * Gets or sets the top (Y-axis) position of the PageContent object.
               *
               * [Api set: OneNoteApi 1.1]
               */
  var top: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Gets the type of the PageContent object. Read-only.
               *
               * [Api set: OneNoteApi 1.1]
               */
  var `type`: js.UndefOr[scala.Boolean] = js.undefined
}

