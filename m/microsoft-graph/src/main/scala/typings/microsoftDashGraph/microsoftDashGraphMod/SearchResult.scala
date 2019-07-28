package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResult extends js.Object {
  /**
    * A callback URL that can be used to record telemetry information. The application should issue a GET on this URL if the
    * user interacts with this item to improve the quality of results.
    */
  var onClickTelemetryUrl: js.UndefOr[String] = js.undefined
}

object SearchResult {
  @scala.inline
  def apply(onClickTelemetryUrl: String = null): SearchResult = {
    val __obj = js.Dynamic.literal()
    if (onClickTelemetryUrl != null) __obj.updateDynamic("onClickTelemetryUrl")(onClickTelemetryUrl)
    __obj.asInstanceOf[SearchResult]
  }
}

