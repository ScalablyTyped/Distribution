package typings.nodeDownloaderHelper.mod

import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.httpMod.RequestOptions
import typings.nodeDownloaderHelper.anon.Delay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
   // Custom HTTP Header ex: Authorization, User-Agent
  var fileName: js.UndefOr[String] = js.native
   // Custom filename when saved
  var forceResume: js.UndefOr[Boolean] = js.native
   // Request Method Verb
  var headers: js.UndefOr[OutgoingHttpHeaders] = js.native
   // if true it will override the file, otherwise will append '(number)' to the end of file
  var httpRequestOptions: js.UndefOr[RequestOptions] = js.native
   // Override the http request options
  var httpsRequestOptions: js.UndefOr[typings.node.httpsMod.RequestOptions] = js.native
  var method: js.UndefOr[String] = js.native
   // If the server does not return the "accept-ranges" header, can be force if it does support it
  var `override`: js.UndefOr[Boolean] = js.native
   // remove the file when is stopped (default:true)
  var removeOnFail: js.UndefOr[Boolean] = js.native
   // { maxRetries: number, delay: number in ms } or false to disable (default)
  var removeOnStop: js.UndefOr[Boolean] = js.native
   // Override the https request options, ex: to add SSL Certs
  var retry: js.UndefOr[Delay] = js.native
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
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    @scala.inline
    def setForceResume(value: Boolean): Self = this.set("forceResume", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceResume: Self = this.set("forceResume", js.undefined)
    @scala.inline
    def setHeaders(value: OutgoingHttpHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setHttpRequestOptions(value: RequestOptions): Self = this.set("httpRequestOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpRequestOptions: Self = this.set("httpRequestOptions", js.undefined)
    @scala.inline
    def setHttpsRequestOptions(value: typings.node.httpsMod.RequestOptions): Self = this.set("httpsRequestOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpsRequestOptions: Self = this.set("httpsRequestOptions", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setOverride(value: Boolean): Self = this.set("override", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverride: Self = this.set("override", js.undefined)
    @scala.inline
    def setRemoveOnFail(value: Boolean): Self = this.set("removeOnFail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveOnFail: Self = this.set("removeOnFail", js.undefined)
    @scala.inline
    def setRemoveOnStop(value: Boolean): Self = this.set("removeOnStop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveOnStop: Self = this.set("removeOnStop", js.undefined)
    @scala.inline
    def setRetry(value: Delay): Self = this.set("retry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetry: Self = this.set("retry", js.undefined)
  }
  
}

