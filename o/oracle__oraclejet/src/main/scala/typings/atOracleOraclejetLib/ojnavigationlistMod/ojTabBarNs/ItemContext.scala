package typings
package atOracleOraclejetLib.ojnavigationlistMod.ojTabBarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ItemContext[K, D] extends js.Object {
  var componentElement: stdLib.Element
  var data: D
  var datasource: js.UndefOr[atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]] = js.undefined
  var index: scala.Double
  var key: K
  var parentElement: stdLib.Element
}

