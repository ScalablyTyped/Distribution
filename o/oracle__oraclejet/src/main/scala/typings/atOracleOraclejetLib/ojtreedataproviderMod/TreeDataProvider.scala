package typings
package atOracleOraclejetLib.ojtreedataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeDataProvider[K, D]
  extends atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D] {
  def getChildDataProvider(parentKey: js.Any): TreeDataProvider[K, D] = js.native
}

