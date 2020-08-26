package typings.oracleOraclejet.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchByOffsetResults[K, D] extends js.Object {
  var done: Boolean = js.native
  var fetchParameters: FetchByOffsetParameters[D] = js.native
  var results: js.Array[Item[K, D]] = js.native
}

object FetchByOffsetResults {
  @scala.inline
  def apply[K, D](done: Boolean, fetchParameters: FetchByOffsetParameters[D], results: js.Array[Item[K, D]]): FetchByOffsetResults[K, D] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], fetchParameters = fetchParameters.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchByOffsetResults[K, D]]
  }
  @scala.inline
  implicit class FetchByOffsetResultsOps[Self <: FetchByOffsetResults[_, _], K, D] (val x: Self with (FetchByOffsetResults[K, D])) extends AnyVal {
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
    def setDone(value: Boolean): Self = this.set("done", value.asInstanceOf[js.Any])
    @scala.inline
    def setFetchParameters(value: FetchByOffsetParameters[D]): Self = this.set("fetchParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultsVarargs(value: (Item[K, D])*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[Item[K, D]]): Self = this.set("results", value.asInstanceOf[js.Any])
  }
  
}

