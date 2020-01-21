package typings.mendixmodelsdk.transportationMod

import typings.mendixmodelsdk.commonMod.common.ICallback
import typings.mendixmodelsdk.commonMod.common.IErrorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransportation extends js.Object {
  /**
    * Send a HTTP request, with specified method, url, data, success and failure callbacks.
    */
  def request[T](options: IRequestOptions, success: IResponseCallback[T], failure: IErrorCallback): Unit
  def requestFileDownload[T](options: IRequestFileDownloadOptions, success: IResponseCallback[T], failure: IErrorCallback): Unit
  def requestMultipartBinaryFileUpload[T](options: IRequestMultipartBinaryFileUploadOptions, success: ICallback[T], failure: IErrorCallback): Unit
  /**
    * Send a HTTP request that will be retried in case of network errors, with specified method, url, data, success and failure callbacks.
    */
  def retryableRequest[T](options: IRequestOptions, success: IResponseCallback[T], failure: IErrorCallback): Unit
}

object ITransportation {
  @scala.inline
  def apply(
    request: (IRequestOptions, IResponseCallback[js.Any], IErrorCallback) => Unit,
    requestFileDownload: (IRequestFileDownloadOptions, IResponseCallback[js.Any], IErrorCallback) => Unit,
    requestMultipartBinaryFileUpload: (IRequestMultipartBinaryFileUploadOptions, ICallback[js.Any], IErrorCallback) => Unit,
    retryableRequest: (IRequestOptions, IResponseCallback[js.Any], IErrorCallback) => Unit
  ): ITransportation = {
    val __obj = js.Dynamic.literal(request = js.Any.fromFunction3(request), requestFileDownload = js.Any.fromFunction3(requestFileDownload), requestMultipartBinaryFileUpload = js.Any.fromFunction3(requestMultipartBinaryFileUpload), retryableRequest = js.Any.fromFunction3(retryableRequest))
  
    __obj.asInstanceOf[ITransportation]
  }
}

