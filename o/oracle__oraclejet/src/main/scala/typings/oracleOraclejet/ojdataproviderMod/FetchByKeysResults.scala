package typings.oracleOraclejet.ojdataproviderMod

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchByKeysResults[K, D] extends js.Object {
  var fetchParameters: FetchByKeysParameters[K] = js.native
  var results: Map[K, Item[K, D]] = js.native
}

object FetchByKeysResults {
  @scala.inline
  def apply[K, D](fetchParameters: FetchByKeysParameters[K], results: Map[K, Item[K, D]]): FetchByKeysResults[K, D] = {
    val __obj = js.Dynamic.literal(fetchParameters = fetchParameters.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchByKeysResults[K, D]]
  }
  @scala.inline
  implicit class FetchByKeysResultsOps[Self <: FetchByKeysResults[_, _], K, D] (val x: Self with (FetchByKeysResults[K, D])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFetchParameters(value: FetchByKeysParameters[K]): Self = this.set("fetchParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResults(value: Map[K, Item[K, D]]): Self = this.set("results", value.asInstanceOf[js.Any])
  }
  
}

