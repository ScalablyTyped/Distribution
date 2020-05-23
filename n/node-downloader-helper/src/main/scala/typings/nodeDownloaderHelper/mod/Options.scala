package typings.nodeDownloaderHelper.mod

import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.httpMod.RequestOptions
import typings.nodeDownloaderHelper.anon.Delay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
   // Custom HTTP Header ex: Authorization, User-Agent
  var fileName: js.UndefOr[String] = js.undefined
   // Custom filename when saved
  var forceResume: js.UndefOr[Boolean] = js.undefined
   // Request Method Verb
  var headers: js.UndefOr[OutgoingHttpHeaders] = js.undefined
   // if true it will override the file, otherwise will append '(number)' to the end of file
  var httpRequestOptions: js.UndefOr[RequestOptions] = js.undefined
   // Override the http request options
  var httpsRequestOptions: js.UndefOr[typings.node.httpsMod.RequestOptions] = js.undefined
  var method: js.UndefOr[String] = js.undefined
   // If the server does not return the "accept-ranges" header, can be force if it does support it
  var `override`: js.UndefOr[Boolean] = js.undefined
   // remove the file when is stopped (default:true)
  var removeOnFail: js.UndefOr[Boolean] = js.undefined
   // { maxRetries: number, delay: number in ms } or false to disable (default)
  var removeOnStop: js.UndefOr[Boolean] = js.undefined
   // Override the https request options, ex: to add SSL Certs
  var retry: js.UndefOr[Delay] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    fileName: String = null,
    forceResume: js.UndefOr[Boolean] = js.undefined,
    headers: OutgoingHttpHeaders = null,
    httpRequestOptions: RequestOptions = null,
    httpsRequestOptions: typings.node.httpsMod.RequestOptions = null,
    method: String = null,
    `override`: js.UndefOr[Boolean] = js.undefined,
    removeOnFail: js.UndefOr[Boolean] = js.undefined,
    removeOnStop: js.UndefOr[Boolean] = js.undefined,
    retry: Delay = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (!js.isUndefined(forceResume)) __obj.updateDynamic("forceResume")(forceResume.get.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (httpRequestOptions != null) __obj.updateDynamic("httpRequestOptions")(httpRequestOptions.asInstanceOf[js.Any])
    if (httpsRequestOptions != null) __obj.updateDynamic("httpsRequestOptions")(httpsRequestOptions.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(`override`)) __obj.updateDynamic("override")(`override`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(removeOnFail)) __obj.updateDynamic("removeOnFail")(removeOnFail.get.asInstanceOf[js.Any])
    if (!js.isUndefined(removeOnStop)) __obj.updateDynamic("removeOnStop")(removeOnStop.get.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

