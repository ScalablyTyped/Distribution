package typings
package officeDashJsDashPreviewLib.VisioNs.InterfacesNs

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
  var id: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Shape's name. Read-only.
    *
    * [Api set:  1.1]
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Returns true, if shape is selected. User can set true to select the shape explicitly.
    *
    * [Api set:  1.1]
    */
  var select: js.UndefOr[scala.Boolean] = js.undefined
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
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Returns the view of the shape. Read-only.
    *
    * [Api set:  1.1]
    */
  var view: js.UndefOr[ShapeViewData] = js.undefined
}

