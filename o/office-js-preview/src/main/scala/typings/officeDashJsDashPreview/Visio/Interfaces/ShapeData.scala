package typings.officeDashJsDashPreview.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "shape.toJSON()". */
trait ShapeData extends js.Object {
  /**
    *
    * Returns the Comments Collection. Read-only.
    *
    * [Api set:  1.1]
    */
  var comments: js.UndefOr[js.Array[CommentData]] = js.undefined
  /**
    *
    * Returns the Hyperlinks collection for a Shape object. Read-only.
    *
    * [Api set:  1.1]
    */
  var hyperlinks: js.UndefOr[js.Array[HyperlinkData]] = js.undefined
  /**
    *
    * Shape's identifier. Read-only.
    *
    * [Api set:  1.1]
    */
  var id: js.UndefOr[Double] = js.undefined
  /**
    *
    * Shape's name. Read-only.
    *
    * [Api set:  1.1]
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    *
    * Returns true, if shape is selected. User can set true to select the shape explicitly.
    *
    * [Api set:  1.1]
    */
  var select: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns the Shape's Data Section. Read-only.
    *
    * [Api set:  1.1]
    */
  var shapeDataItems: js.UndefOr[js.Array[ShapeDataItemData]] = js.undefined
  /**
    *
    * Gets SubShape Collection. Read-only.
    *
    * [Api set:  1.1]
    */
  var subShapes: js.UndefOr[js.Array[ShapeData]] = js.undefined
  /**
    *
    * Shape's text. Read-only.
    *
    * [Api set:  1.1]
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    *
    * Returns the view of the shape. Read-only.
    *
    * [Api set:  1.1]
    */
  var view: js.UndefOr[ShapeViewData] = js.undefined
}

object ShapeData {
  @scala.inline
  def apply(
    comments: js.Array[CommentData] = null,
    hyperlinks: js.Array[HyperlinkData] = null,
    id: Int | Double = null,
    name: String = null,
    select: js.UndefOr[Boolean] = js.undefined,
    shapeDataItems: js.Array[ShapeDataItemData] = null,
    subShapes: js.Array[ShapeData] = null,
    text: String = null,
    view: ShapeViewData = null
  ): ShapeData = {
    val __obj = js.Dynamic.literal()
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (hyperlinks != null) __obj.updateDynamic("hyperlinks")(hyperlinks.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(select)) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (shapeDataItems != null) __obj.updateDynamic("shapeDataItems")(shapeDataItems.asInstanceOf[js.Any])
    if (subShapes != null) __obj.updateDynamic("subShapes")(subShapes.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeData]
  }
}

