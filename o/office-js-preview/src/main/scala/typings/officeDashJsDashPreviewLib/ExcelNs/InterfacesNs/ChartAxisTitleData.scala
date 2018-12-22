package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "chartAxisTitle.toJSON()". */

trait ChartAxisTitleData extends js.Object {
  /**
              *
              * Represents the formatting of chart axis title. Read-only.
              *
              * [Api set: ExcelApi 1.1]
              */
  var format: js.UndefOr[ChartAxisTitleFormatData] = js.undefined
  /**
               *
               * Represents the axis title.
               *
               * [Api set: ExcelApi 1.1]
               */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
               *
               * A boolean that specifies the visibility of an axis title.
               *
               * [Api set: ExcelApi 1.1]
               */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

