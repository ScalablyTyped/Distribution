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

