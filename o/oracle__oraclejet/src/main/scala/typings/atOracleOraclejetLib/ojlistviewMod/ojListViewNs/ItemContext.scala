package typings
package atOracleOraclejetLib.ojlistviewMod.ojListViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ItemContext[K, D] extends js.Object {
  var data: D
  var datasource: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]
  var depth: js.UndefOr[scala.Double] = js.undefined
  var index: scala.Double
  var key: K
  var leaf: js.UndefOr[scala.Boolean] = js.undefined
  var parentElement: stdLib.Element
  var parentKey: js.UndefOr[K] = js.undefined
}

