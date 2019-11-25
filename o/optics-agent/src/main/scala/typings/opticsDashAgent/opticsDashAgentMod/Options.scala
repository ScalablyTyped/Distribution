package typings.opticsDashAgent.opticsDashAgentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Your API key for the Optics service.
    *
    * This defaults to the OPTICS_API_KEY environment variable, but can be overridden here.
    */
  var apiKey: js.UndefOr[String] = js.undefined
  /**
    * Where to send the reports. Defaults to the production Optics endpoint, or the OPTICS_ENDPOINT_URL environment variable if it is set.
    *
    * You shouldn't need to set this unless you are debugging.
    */
  var endpointUrl: js.UndefOr[String] = js.undefined
  /**
    * Called to determine the query shape for for a GraphQL query.
    *
    * You shouldn't need to set this unless you are debugging.
    */
  var normalizeQuery: js.UndefOr[js.Function1[/* graphQLResolveInfo */ js.Any, String]] = js.undefined
  /**
    * Print a JSON version of reports as they are sent. This may be useful for debugging. Defaults to false.
    */
  var printReports: js.UndefOr[Boolean] = js.undefined
  /**
    * HTTP proxy to use when sending reports. Default to no proxying, or the HTTPS_PROXY environment variable if it is set.
    *
    * You should only set this when your servers cannot connect directly to the Optics service.
    */
  var proxyUrl: js.UndefOr[String] = js.undefined
  /**
    * How often to send reports in milliseconds. Defaults to 1 minute. Minimum 10 seconds.
    *
    * You shouldn't need to set this unless you are debugging.
    */
  var reportIntervalMs: js.UndefOr[Double] = js.undefined
  /**
    * Send detailed traces along with usage reports. Defaults to true.
    */
  var reportTraces: js.UndefOr[Boolean] = js.undefined
  /**
    * Send the query variables along with traces. Defaults to true.
    */
  var reportVariables: js.UndefOr[Boolean] = js.undefined
  /**
    * Send statistics when the process exits. Defaults to true.
    */
  var shutdownGracefully: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    apiKey: String = null,
    endpointUrl: String = null,
    normalizeQuery: /* graphQLResolveInfo */ js.Any => String = null,
    printReports: js.UndefOr[Boolean] = js.undefined,
    proxyUrl: String = null,
    reportIntervalMs: Int | Double = null,
    reportTraces: js.UndefOr[Boolean] = js.undefined,
    reportVariables: js.UndefOr[Boolean] = js.undefined,
    shutdownGracefully: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey.asInstanceOf[js.Any])
    if (endpointUrl != null) __obj.updateDynamic("endpointUrl")(endpointUrl.asInstanceOf[js.Any])
    if (normalizeQuery != null) __obj.updateDynamic("normalizeQuery")(js.Any.fromFunction1(normalizeQuery))
    if (!js.isUndefined(printReports)) __obj.updateDynamic("printReports")(printReports.asInstanceOf[js.Any])
    if (proxyUrl != null) __obj.updateDynamic("proxyUrl")(proxyUrl.asInstanceOf[js.Any])
    if (reportIntervalMs != null) __obj.updateDynamic("reportIntervalMs")(reportIntervalMs.asInstanceOf[js.Any])
    if (!js.isUndefined(reportTraces)) __obj.updateDynamic("reportTraces")(reportTraces.asInstanceOf[js.Any])
    if (!js.isUndefined(reportVariables)) __obj.updateDynamic("reportVariables")(reportVariables.asInstanceOf[js.Any])
    if (!js.isUndefined(shutdownGracefully)) __obj.updateDynamic("shutdownGracefully")(shutdownGracefully.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

