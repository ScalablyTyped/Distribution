package typings.oracleOraclejet.ojdataproviderMod

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainsKeysResults[K] extends js.Object {
  var containsParameters: FetchByKeysParameters[K]
  var results: Set[K]
}

object ContainsKeysResults {
  @scala.inline
  def apply[K](containsParameters: FetchByKeysParameters[K], results: Set[K]): ContainsKeysResults[K] = {
    val __obj = js.Dynamic.literal(containsParameters = containsParameters.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ContainsKeysResults[K]]
  }
}

