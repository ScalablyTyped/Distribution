package typings
package atOracleOraclejetLib.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainsKeysResults[K] extends js.Object {
  var containsParameters: FetchByKeysParameters[K]
  var results: stdLib.Set[K]
}

object ContainsKeysResults {
  @scala.inline
  def apply[K](containsParameters: FetchByKeysParameters[K], results: stdLib.Set[K]): ContainsKeysResults[K] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("containsParameters")(containsParameters)
    __obj.updateDynamic("results")(results)
    __obj.asInstanceOf[ContainsKeysResults[K]]
  }
}

