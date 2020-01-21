package typings.officeJsPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the contents of a page, as a collection of PageContent objects.
  *
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait PageContentCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the ID of the PageContent object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the Image in the PageContent object. Throws an exception if PageContentType is not Image.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var image: js.UndefOr[ImageLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the ink in the PageContent object. Throws an exception if PageContentType is not Ink.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var ink: js.UndefOr[FloatingInkLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the left (X-axis) position of the PageContent object.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var left: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the Outline in the PageContent object. Throws an exception if PageContentType is not Outline.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var outline: js.UndefOr[OutlineLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the page that contains the PageContent object.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var parentPage: js.UndefOr[PageLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the top (Y-axis) position of the PageContent object.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var top: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the type of the PageContent object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var `type`: js.UndefOr[Boolean] = js.native
}

