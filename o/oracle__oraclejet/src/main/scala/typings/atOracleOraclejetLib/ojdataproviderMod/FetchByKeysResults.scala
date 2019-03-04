package typings
package atOracleOraclejetLib.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchByKeysResults[K, D] extends js.Object {
  var fetchParameters: FetchByKeysParameters[K]
  var results: stdLib.Map[K, Item[K, D]]
}

object FetchByKeysResults {
  @scala.inline
  def apply[K, D](fetchParameters: FetchByKeysParameters[K], results: stdLib.Map[K, Item[K, D]]): FetchByKeysResults[K, D] = {
    val __obj = js.Dynamic.literal(fetchParameters = fetchParameters, results = results)
  
    __obj.asInstanceOf[FetchByKeysResults[K, D]]
  }
}

