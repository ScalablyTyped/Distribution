package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchResult extends js.Object {
  /**
    * A callback URL that can be used to record telemetry information. The application should issue a GET on this URL if the
    * user interacts with this item to improve the quality of results.
    */
  var onClickTelemetryUrl: js.UndefOr[String] = js.native
}

object SearchResult {
  @scala.inline
  def apply(): SearchResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchResult]
  }
  @scala.inline
  implicit class SearchResultOps[Self <: SearchResult] (val x: Self) extends AnyVal {
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
    def setOnClickTelemetryUrl(value: String): Self = this.set("onClickTelemetryUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnClickTelemetryUrl: Self = this.set("onClickTelemetryUrl", js.undefined)
  }
  
}

