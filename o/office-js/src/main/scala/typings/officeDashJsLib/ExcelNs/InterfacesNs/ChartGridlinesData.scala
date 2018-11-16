package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "chartGridlines.toJSON()". */

trait ChartGridlinesData extends js.Object {
  /**
              *
              * Represents the formatting of chart gridlines. Read-only.
              *
              * [Api set: ExcelApi 1.1]
              */
  var format: js.UndefOr[ChartGridlinesFormatData] = js.undefined
  /**
               *
               * Boolean value representing if the axis gridlines are visible or not.
               *
               * [Api set: ExcelApi 1.1]
               */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

