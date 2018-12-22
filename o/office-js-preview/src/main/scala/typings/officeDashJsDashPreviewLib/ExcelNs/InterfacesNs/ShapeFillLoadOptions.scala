package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         *
         * Represents the fill formatting for a shape object.
         *
         * [Api set: ExcelApi BETA (PREVIEW ONLY)]
         * @beta
         */

trait ShapeFillLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Represents the shape fill fore color in HTML color format, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange")
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var foreColor: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Returns or sets the degree of transparency of the specified fill as a value from 0.0 (opaque) through 1.0 (clear). For API not supported shape types  or special fill type with inconsistent transparencies, return null. For example, gradient fill type could have inconsistent transparencies.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var transparency: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Returns the fill type of the shape. Read-only. See Excel.ShapeFillType for detail.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var `type`: js.UndefOr[scala.Boolean] = js.undefined
}

