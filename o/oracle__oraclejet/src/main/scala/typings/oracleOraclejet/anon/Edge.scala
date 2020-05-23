package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.bottom
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.start
import typings.oracleOraclejet.oracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Edge extends js.Object {
  var edge: js.UndefOr[start | end | top | bottom] = js.undefined
  var query: String | Null
  var selector: String
}

object Edge {
  @scala.inline
  def apply(selector: String, edge: start | end | top | bottom = null, query: String = null): Edge = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    if (edge != null) __obj.updateDynamic("edge")(edge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edge]
  }
}

