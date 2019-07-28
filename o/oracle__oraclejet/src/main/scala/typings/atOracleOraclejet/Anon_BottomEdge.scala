package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.bottom
import typings.atOracleOraclejet.atOracleOraclejetStrings.end
import typings.atOracleOraclejet.atOracleOraclejetStrings.start
import typings.atOracleOraclejet.atOracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BottomEdge extends js.Object {
  var edge: js.UndefOr[start | end | top | bottom] = js.undefined
  var query: String | Null
  var selector: String
}

object Anon_BottomEdge {
  @scala.inline
  def apply(selector: String, edge: start | end | top | bottom = null, query: String = null): Anon_BottomEdge = {
    val __obj = js.Dynamic.literal(selector = selector)
    if (edge != null) __obj.updateDynamic("edge")(edge.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[Anon_BottomEdge]
  }
}

