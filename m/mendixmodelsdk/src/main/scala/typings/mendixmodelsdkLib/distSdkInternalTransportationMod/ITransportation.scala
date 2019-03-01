package typings
package mendixmodelsdkLib.distSdkInternalTransportationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransportation extends js.Object {
  /**
    * Send a HTTP request, with specified method, url, data, success and failure callbacks.
    */
  def request[T](
    options: IRequestOptions,
    success: IResponseCallback[T],
    failure: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit
  def requestFileDownload[T](
    options: IRequestFileDownloadOptions,
    success: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[T],
    failure: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit
  def requestMultipartBinaryFileUpload[T](
    options: IRequestMultipartBinaryFileUploadOptions,
    success: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[T],
    failure: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit
  /**
    * Send a HTTP request that will be retried in case of network errors, with specified method, url, data, success and failure callbacks.
    */
  def retryableRequest[T](
    options: IRequestOptions,
    success: IResponseCallback[T],
    failure: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit
}

object ITransportation {
  @scala.inline
  def apply(
    request: js.Function3[
      IRequestOptions, 
      IResponseCallback[js.Any], 
      mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback, 
      scala.Unit
    ],
    requestFileDownload: js.Function3[
      IRequestFileDownloadOptions, 
      mendixmodelsdkLib.distCommonMod.commonNs.ICallback[js.Any], 
      mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback, 
      scala.Unit
    ],
    requestMultipartBinaryFileUpload: js.Function3[
      IRequestMultipartBinaryFileUploadOptions, 
      mendixmodelsdkLib.distCommonMod.commonNs.ICallback[js.Any], 
      mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback, 
      scala.Unit
    ],
    retryableRequest: js.Function3[
      IRequestOptions, 
      IResponseCallback[js.Any], 
      mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback, 
      scala.Unit
    ]
  ): ITransportation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("request")(request)
    __obj.updateDynamic("requestFileDownload")(requestFileDownload)
    __obj.updateDynamic("requestMultipartBinaryFileUpload")(requestMultipartBinaryFileUpload)
    __obj.updateDynamic("retryableRequest")(retryableRequest)
    __obj.asInstanceOf[ITransportation]
  }
}

