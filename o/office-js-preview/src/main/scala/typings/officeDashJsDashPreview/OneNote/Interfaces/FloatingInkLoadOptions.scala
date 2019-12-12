package typings.officeDashJsDashPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a group of ink strokes.
  *
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait FloatingInkLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the ID of the FloatingInk object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the strokes of the FloatingInk object.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var inkStrokes: js.UndefOr[InkStrokeCollectionLoadOptions] = js.native
  /**
    *
    * Gets the PageContent parent of the FloatingInk object.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var pageContent: js.UndefOr[PageContentLoadOptions] = js.native
}

