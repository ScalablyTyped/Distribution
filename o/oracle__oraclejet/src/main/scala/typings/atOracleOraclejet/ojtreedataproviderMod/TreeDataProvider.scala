package typings.atOracleOraclejet.ojtreedataproviderMod

import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeDataProvider[K, D] extends DataProvider[K, D] {
  def getChildDataProvider(parentKey: js.Any): TreeDataProvider[K, D] = js.native
}

