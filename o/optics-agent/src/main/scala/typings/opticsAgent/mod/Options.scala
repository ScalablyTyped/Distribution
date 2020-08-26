package typings.opticsAgent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Your API key for the Optics service.
    *
    * This defaults to the OPTICS_API_KEY environment variable, but can be overridden here.
    */
  var apiKey: js.UndefOr[String] = js.native
  /**
    * Where to send the reports. Defaults to the production Optics endpoint, or the OPTICS_ENDPOINT_URL environment variable if it is set.
    *
    * You shouldn't need to set this unless you are debugging.
    */
  var endpointUrl: js.UndefOr[String] = js.native
  /**
    * Called to determine the query shape for for a GraphQL query.
    *
    * You shouldn't need to set this unless you are debugging.
    */
  var normalizeQuery: js.UndefOr[js.Function1[/* graphQLResolveInfo */ js.Any, String]] = js.native
  /**
    * Print a JSON version of reports as they are sent. This may be useful for debugging. Defaults to false.
    */
  var printReports: js.UndefOr[Boolean] = js.native
  /**
    * HTTP proxy to use when sending reports. Default to no proxying, or the HTTPS_PROXY environment variable if it is set.
    *
    * You should only set this when your servers cannot connect directly to the Optics service.
    */
  var proxyUrl: js.UndefOr[String] = js.native
  /**
    * How often to send reports in milliseconds. Defaults to 1 minute. Minimum 10 seconds.
    *
    * You shouldn't need to set this unless you are debugging.
    */
  var reportIntervalMs: js.UndefOr[Double] = js.native
  /**
    * Send detailed traces along with usage reports. Defaults to true.
    */
  var reportTraces: js.UndefOr[Boolean] = js.native
  /**
    * Send the query variables along with traces. Defaults to true.
    */
  var reportVariables: js.UndefOr[Boolean] = js.native
  /**
    * Send statistics when the process exits. Defaults to true.
    */
  var shutdownGracefully: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiKey: Self = this.set("apiKey", js.undefined)
    @scala.inline
    def setEndpointUrl(value: String): Self = this.set("endpointUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointUrl: Self = this.set("endpointUrl", js.undefined)
    @scala.inline
    def setNormalizeQuery(value: /* graphQLResolveInfo */ js.Any => String): Self = this.set("normalizeQuery", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNormalizeQuery: Self = this.set("normalizeQuery", js.undefined)
    @scala.inline
    def setPrintReports(value: Boolean): Self = this.set("printReports", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrintReports: Self = this.set("printReports", js.undefined)
    @scala.inline
    def setProxyUrl(value: String): Self = this.set("proxyUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxyUrl: Self = this.set("proxyUrl", js.undefined)
    @scala.inline
    def setReportIntervalMs(value: Double): Self = this.set("reportIntervalMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportIntervalMs: Self = this.set("reportIntervalMs", js.undefined)
    @scala.inline
    def setReportTraces(value: Boolean): Self = this.set("reportTraces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportTraces: Self = this.set("reportTraces", js.undefined)
    @scala.inline
    def setReportVariables(value: Boolean): Self = this.set("reportVariables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportVariables: Self = this.set("reportVariables", js.undefined)
    @scala.inline
    def setShutdownGracefully(value: Boolean): Self = this.set("shutdownGracefully", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShutdownGracefully: Self = this.set("shutdownGracefully", js.undefined)
  }
  
}

