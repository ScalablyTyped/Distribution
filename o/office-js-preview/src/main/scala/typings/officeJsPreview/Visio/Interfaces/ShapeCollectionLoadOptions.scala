package typings.officeJsPreview.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Shape Collection.
  *
  * [Api set:  1.1]
  */
@js.native
trait ShapeCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Shape's identifier. Read-only.
    *
    * [Api set:  1.1]
    */
  var id: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Shape's name. Read-only.
    *
    * [Api set:  1.1]
    */
  var name: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns true, if shape is selected. User can set true to select the shape explicitly.
    *
    * [Api set:  1.1]
    */
  var select: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Shape's text. Read-only.
    *
    * [Api set:  1.1]
    */
  var text: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns the view of the shape.
    *
    * [Api set:  1.1]
    */
  var view: js.UndefOr[ShapeViewLoadOptions] = js.native
}

