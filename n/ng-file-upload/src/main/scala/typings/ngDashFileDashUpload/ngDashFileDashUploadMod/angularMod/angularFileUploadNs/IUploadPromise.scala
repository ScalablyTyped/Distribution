package typings.ngDashFileDashUpload.ngDashFileDashUploadMod.angularMod.angularFileUploadNs

import typings.angular.angularMod.IHttpPromiseCallback
import typings.angular.angularMod.IHttpResponse
import typings.angular.angularMod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUploadPromise[T] extends IPromise[IHttpResponse[T]] {
  /**
    * Cancel/abort the upload in progress.
    *
    * @return {IUploadPromise<T>}
    */
  def abort(): IUploadPromise[T] = js.native
  def progress(callback: js.Function1[/* event */ IFileProgressEvent, Unit]): IUploadPromise[T] = js.native
  /**
    * Access or attach event listeners to the underlying XMLHttpRequest
    *
    * @param  {IHttpPromiseCallback<T>}
    * @return {IUploadPromise<T>}
    */
  def xhr(callback: IHttpPromiseCallback[T]): IUploadPromise[T] = js.native
}

