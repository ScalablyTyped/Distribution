package typings
package opticsDashAgentLib.opticsDashAgentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Your API key for the Optics service.
    *
    * This defaults to the OPTICS_API_KEY environment variable, but can be overridden here.
    */
  var apiKey: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Where to send the reports. Defaults to the production Optics endpoint, or the OPTICS_ENDPOINT_URL environment variable if it is set.
    *
    * You shouldn't need to set this unless you are debugging.
    */
  var endpointUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Called to determine the query shape for for a GraphQL query.
    *
    * You shouldn't need to set this unless you are debugging.
    */
  var normalizeQuery: js.UndefOr[js.Function1[/* graphQLResolveInfo */ js.Any, java.lang.String]] = js.undefined
  /**
    * Print a JSON version of reports as they are sent. This may be useful for debugging. Defaults to false.
    */
  var printReports: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * HTTP proxy to use when sending reports. Default to no proxying, or the HTTPS_PROXY environment variable if it is set.
    *
    * You should only set this when your servers cannot connect directly to the Optics service.
    */
  var proxyUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * How often to send reports in milliseconds. Defaults to 1 minute. Minimum 10 seconds.
    *
    * You shouldn't need to set this unless you are debugging.
    */
  var reportIntervalMs: js.UndefOr[scala.Double] = js.undefined
  /**
    * Send detailed traces along with usage reports. Defaults to true.
    */
  var reportTraces: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Send the query variables along with traces. Defaults to true.
    */
  var reportVariables: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Send statistics when the process exits. Defaults to true.
    */
  var shutdownGracefully: js.UndefOr[scala.Boolean] = js.undefined
}

