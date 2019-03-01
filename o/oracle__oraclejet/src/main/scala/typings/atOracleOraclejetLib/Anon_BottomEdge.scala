package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BottomEdge extends js.Object {
  var edge: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.start | atOracleOraclejetLib.atOracleOraclejetLibStrings.end | atOracleOraclejetLib.atOracleOraclejetLibStrings.top | atOracleOraclejetLib.atOracleOraclejetLibStrings.bottom
  ] = js.undefined
  var query: java.lang.String | scala.Null
  var selector: java.lang.String
}

object Anon_BottomEdge {
  @scala.inline
  def apply(
    selector: java.lang.String,
    edge: atOracleOraclejetLib.atOracleOraclejetLibStrings.start | atOracleOraclejetLib.atOracleOraclejetLibStrings.end | atOracleOraclejetLib.atOracleOraclejetLibStrings.top | atOracleOraclejetLib.atOracleOraclejetLibStrings.bottom = null,
    query: java.lang.String = null
  ): Anon_BottomEdge = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("selector")(selector)
    if (edge != null) __obj.updateDynamic("edge")(edge.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[Anon_BottomEdge]
  }
}

