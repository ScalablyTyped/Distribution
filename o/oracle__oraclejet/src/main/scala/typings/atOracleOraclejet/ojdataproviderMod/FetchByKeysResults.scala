package typings.atOracleOraclejet.ojdataproviderMod

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchByKeysResults[K, D] extends js.Object {
  var fetchParameters: FetchByKeysParameters[K]
  var results: Map[K, Item[K, D]]
}

object FetchByKeysResults {
  @scala.inline
  def apply[K, D](fetchParameters: FetchByKeysParameters[K], results: Map[K, Item[K, D]]): FetchByKeysResults[K, D] = {
    val __obj = js.Dynamic.literal(fetchParameters = fetchParameters.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FetchByKeysResults[K, D]]
  }
}

