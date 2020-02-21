package typings.plotlyJs

import typings.plotlyJs.plotlyJsStrings.`bottom plot`
import typings.plotlyJs.plotlyJsStrings.`bottom to top`
import typings.plotlyJs.plotlyJsStrings.`left plot`
import typings.plotlyJs.plotlyJsStrings.`right plot`
import typings.plotlyJs.plotlyJsStrings.`top plot`
import typings.plotlyJs.plotlyJsStrings.`top to bottom`
import typings.plotlyJs.plotlyJsStrings.bottom
import typings.plotlyJs.plotlyJsStrings.coupled
import typings.plotlyJs.plotlyJsStrings.independent
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.right
import typings.plotlyJs.plotlyJsStrings.top
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBottom extends js.Object {
  var columns: Double
  var domain: Partial[AnonX]
  var pattern: independent | coupled
  var roworder: (`top to bottom`) | (`bottom to top`)
  var rows: Double
  var subplots: js.Array[String]
  var xaxes: js.Array[String]
  var xgap: Double
  var xside: bottom | (`bottom plot`) | (`top plot`) | top
  var yaxes: js.Array[String]
  var ygap: Double
  var yside: left | (`left plot`) | (`right plot`) | right
}

object AnonBottom {
  @scala.inline
  def apply(
    columns: Double,
    domain: Partial[AnonX],
    pattern: independent | coupled,
    roworder: (`top to bottom`) | (`bottom to top`),
    rows: Double,
    subplots: js.Array[String],
    xaxes: js.Array[String],
    xgap: Double,
    xside: bottom | (`bottom plot`) | (`top plot`) | top,
    yaxes: js.Array[String],
    ygap: Double,
    yside: left | (`left plot`) | (`right plot`) | right
  ): AnonBottom = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], roworder = roworder.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], subplots = subplots.asInstanceOf[js.Any], xaxes = xaxes.asInstanceOf[js.Any], xgap = xgap.asInstanceOf[js.Any], xside = xside.asInstanceOf[js.Any], yaxes = yaxes.asInstanceOf[js.Any], ygap = ygap.asInstanceOf[js.Any], yside = yside.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBottom]
  }
}

