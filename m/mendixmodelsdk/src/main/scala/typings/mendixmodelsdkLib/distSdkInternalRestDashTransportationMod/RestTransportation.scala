package typings
package mendixmodelsdkLib.distSdkInternalRestDashTransportationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/rest-transportation", "RestTransportation")
@js.native
class RestTransportation protected ()
  extends mendixmodelsdkLib.distSdkInternalTransportationMod.ITransportation {
  def this(config: mendixmodelsdkLib.distSdkConfigMod.configurationNs.ISdkConfig) = this()
  var config: js.Any = js.native
  var generateStandardOptions: js.Any = js.native
  var handleRequest: js.Any = js.native
  var prepareRequestOptions: js.Any = js.native
  var sanitizedMethod: js.Any = js.native
  var url: js.Any = js.native
  /**
       * Send a HTTP request, with specified method, url, data, success and failure callbacks.
       */
  /* CompleteClass */
  override def request[T](
    options: mendixmodelsdkLib.distSdkInternalTransportationMod.IRequestOptions,
    success: mendixmodelsdkLib.distSdkInternalTransportationMod.IResponseCallback[T],
    failure: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  /* CompleteClass */
  override def requestFileDownload[T](
    options: mendixmodelsdkLib.distSdkInternalTransportationMod.IRequestFileDownloadOptions,
    success: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[T],
    failure: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  /* CompleteClass */
  override def requestMultipartBinaryFileUpload[T](
    options: mendixmodelsdkLib.distSdkInternalTransportationMod.IRequestMultipartBinaryFileUploadOptions,
    success: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[T],
    failure: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  /**
       * Send a HTTP request that will be retried in case of network errors, with specified method, url, data, success and failure callbacks.
       */
  /* CompleteClass */
  override def retryableRequest[T](
    options: mendixmodelsdkLib.distSdkInternalTransportationMod.IRequestOptions,
    success: mendixmodelsdkLib.distSdkInternalTransportationMod.IResponseCallback[T],
    failure: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
}

