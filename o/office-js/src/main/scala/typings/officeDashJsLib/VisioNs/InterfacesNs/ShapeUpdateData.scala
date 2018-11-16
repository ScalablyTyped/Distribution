package typings
package officeDashJsLib.VisioNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Shape object, for use in "shape.set({ ... })". */

trait ShapeUpdateData extends js.Object {
  /**
               *
               * Returns true, if shape is selected. User can set true to select the shape explicitly.
               *
               * [Api set:  1.1]
               */
  var select: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * Returns the view of the shape.
              *
              * [Api set:  1.1]
              */
  var view: js.UndefOr[ShapeViewUpdateData] = js.undefined
}

