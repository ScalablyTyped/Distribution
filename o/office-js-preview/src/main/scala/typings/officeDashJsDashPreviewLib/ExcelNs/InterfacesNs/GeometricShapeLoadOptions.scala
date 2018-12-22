package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         *
         * Represents a geometric shape object inside a worksheet. A geometric shape can be a line, rectangle, block arrow, equation, flowchart, start, banner, callout or basic shape in Excel.
         *
         * [Api set: ExcelApi BETA (PREVIEW ONLY)]
         * @beta
         */

trait GeometricShapeLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Represents the shape identifier. Read-only.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var id: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * Returns the shape object for the geometric shape.
              *
              * [Api set: ExcelApi BETA (PREVIEW ONLY)]
              * @beta
              */
  var shape: js.UndefOr[ShapeLoadOptions] = js.undefined
}

