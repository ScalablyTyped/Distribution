package typings.oracleOraclejet

import typings.oracleOraclejet.oracleOraclejetStrings.bottom
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.start
import typings.oracleOraclejet.oracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBottomEdge extends js.Object {
  var edge: js.UndefOr[start | end | top | bottom] = js.undefined
  var query: String | Null
  var selector: String
}

object AnonBottomEdge {
  @scala.inline
  def apply(selector: String, edge: start | end | top | bottom = null, query: String = null): AnonBottomEdge = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
    if (edge != null) __obj.updateDynamic("edge")(edge.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBottomEdge]
  }
}

