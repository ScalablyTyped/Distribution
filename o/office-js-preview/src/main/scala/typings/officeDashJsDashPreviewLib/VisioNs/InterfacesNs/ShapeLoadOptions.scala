package typings
package officeDashJsDashPreviewLib.VisioNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Shape class.
  *
  * [Api set:  1.1]
  */
trait ShapeLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Shape's identifier. Read-only.
    *
    * [Api set:  1.1]
    */
  var id: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Shape's name. Read-only.
    *
    * [Api set:  1.1]
    */
  var name: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns true, if shape is selected. User can set true to select the shape explicitly.
    *
    * [Api set:  1.1]
    */
  var select: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Shape's text. Read-only.
    *
    * [Api set:  1.1]
    */
  var text: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns the view of the shape.
    *
    * [Api set:  1.1]
    */
  var view: js.UndefOr[ShapeViewLoadOptions] = js.undefined
}

