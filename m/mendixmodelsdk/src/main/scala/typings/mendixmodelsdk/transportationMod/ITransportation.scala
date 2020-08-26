package typings.mendixmodelsdk.transportationMod

import typings.mendixmodelsdk.commonMod.common.IErrorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITransportation extends js.Object {
  /**
    * Send a HTTP request, with specified method, url, data, success and failure callbacks.
    */
  def request[T](options: IRequestOptions, success: IResponseCallback[T], failure: IErrorCallback): Unit = js.native
  def requestFileDownload[T](options: IRequestFileDownloadOptions, success: IResponseCallback[T], failure: IErrorCallback): Unit = js.native
  def requestMultipartBinaryFileUpload[T](
    options: IRequestMultipartBinaryFileUploadOptions,
    success: IResponseCallback[T],
    failure: IErrorCallback
  ): Unit = js.native
  /**
    * Send a HTTP request that will be retried in case of network errors, with specified method, url, data, success and failure callbacks.
    */
  def retryableRequest[T](options: IRequestOptions, success: IResponseCallback[T], failure: IErrorCallback): Unit = js.native
}

object ITransportation {
  @scala.inline
  def apply(
    request: (IRequestOptions, IResponseCallback[js.Any], IErrorCallback) => Unit,
    requestFileDownload: (IRequestFileDownloadOptions, IResponseCallback[js.Any], IErrorCallback) => Unit,
    requestMultipartBinaryFileUpload: (IRequestMultipartBinaryFileUploadOptions, IResponseCallback[js.Any], IErrorCallback) => Unit,
    retryableRequest: (IRequestOptions, IResponseCallback[js.Any], IErrorCallback) => Unit
  ): ITransportation = {
    val __obj = js.Dynamic.literal(request = js.Any.fromFunction3(request), requestFileDownload = js.Any.fromFunction3(requestFileDownload), requestMultipartBinaryFileUpload = js.Any.fromFunction3(requestMultipartBinaryFileUpload), retryableRequest = js.Any.fromFunction3(retryableRequest))
    __obj.asInstanceOf[ITransportation]
  }
  @scala.inline
  implicit class ITransportationOps[Self <: ITransportation] (val x: Self) extends AnyVal {
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
    def setRequest(value: (IRequestOptions, IResponseCallback[js.Any], IErrorCallback) => Unit): Self = this.set("request", js.Any.fromFunction3(value))
    @scala.inline
    def setRequestFileDownload(value: (IRequestFileDownloadOptions, IResponseCallback[js.Any], IErrorCallback) => Unit): Self = this.set("requestFileDownload", js.Any.fromFunction3(value))
    @scala.inline
    def setRequestMultipartBinaryFileUpload(
      value: (IRequestMultipartBinaryFileUploadOptions, IResponseCallback[js.Any], IErrorCallback) => Unit
    ): Self = this.set("requestMultipartBinaryFileUpload", js.Any.fromFunction3(value))
    @scala.inline
    def setRetryableRequest(value: (IRequestOptions, IResponseCallback[js.Any], IErrorCallback) => Unit): Self = this.set("retryableRequest", js.Any.fromFunction3(value))
  }
  
}

