package typings.oracleOraclejet.ojdataproviderMod

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainsKeysResults[K] extends js.Object {
  var containsParameters: FetchByKeysParameters[K] = js.native
  var results: Set[K] = js.native
}

object ContainsKeysResults {
  @scala.inline
  def apply[K](containsParameters: FetchByKeysParameters[K], results: Set[K]): ContainsKeysResults[K] = {
    val __obj = js.Dynamic.literal(containsParameters = containsParameters.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainsKeysResults[K]]
  }
  @scala.inline
  implicit class ContainsKeysResultsOps[Self <: ContainsKeysResults[_], K] (val x: Self with ContainsKeysResults[K]) extends AnyVal {
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
    def setContainsParameters(value: FetchByKeysParameters[K]): Self = this.set("containsParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResults(value: Set[K]): Self = this.set("results", value.asInstanceOf[js.Any])
  }
  
}

