package typings.nodeGcm.mod

import typings.nodeGcm.anon.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResponseBody extends js.Object {
  var canonical_ids: Double = js.native
  var failure: Double = js.native
  var multicast_id: js.UndefOr[Double] = js.native
  var results: js.UndefOr[js.Array[Error]] = js.native
  var success: Double = js.native
}

object IResponseBody {
  @scala.inline
  def apply(canonical_ids: Double, failure: Double, success: Double): IResponseBody = {
    val __obj = js.Dynamic.literal(canonical_ids = canonical_ids.asInstanceOf[js.Any], failure = failure.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResponseBody]
  }
  @scala.inline
  implicit class IResponseBodyOps[Self <: IResponseBody] (val x: Self) extends AnyVal {
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
    def setCanonical_ids(value: Double): Self = this.set("canonical_ids", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailure(value: Double): Self = this.set("failure", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: Double): Self = this.set("success", value.asInstanceOf[js.Any])
    @scala.inline
    def setMulticast_id(value: Double): Self = this.set("multicast_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMulticast_id: Self = this.set("multicast_id", js.undefined)
    @scala.inline
    def setResultsVarargs(value: Error*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[Error]): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
  }
  
}

