package typings.pouchdbCore.PouchDB.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangesResponse[Content /* <: js.Object */] extends js.Object {
  var last_seq: Double | String = js.native
  var results: js.Array[ChangesResponseChange[Content]] = js.native
  var status: String = js.native
}

object ChangesResponse {
  @scala.inline
  def apply[/* <: js.Object */ Content](last_seq: Double | String, results: js.Array[ChangesResponseChange[Content]], status: String): ChangesResponse[Content] = {
    val __obj = js.Dynamic.literal(last_seq = last_seq.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangesResponse[Content]]
  }
  @scala.inline
  implicit class ChangesResponseOps[Self <: ChangesResponse[_], /* <: js.Object */ Content] (val x: Self with ChangesResponse[Content]) extends AnyVal {
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
    def setLast_seq(value: Double | String): Self = this.set("last_seq", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultsVarargs(value: ChangesResponseChange[Content]*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[ChangesResponseChange[Content]]): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

