package typings
package ngDashFileDashUploadLib.ngDashFileDashUploadMod.angularMod.angularFileUploadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUploadPromise[T]
  extends angularLib.angularMod.IPromise[angularLib.angularMod.IHttpResponse[T]] {
  /**
    * Cancel/abort the upload in progress.
    *
    * @return {IUploadPromise<T>}
    */
  def abort(): IUploadPromise[T] = js.native
  def progress(callback: js.Function1[/* event */ IFileProgressEvent, scala.Unit]): IUploadPromise[T] = js.native
  /**
    * Access or attach event listeners to the underlying XMLHttpRequest
    *
    * @param  {IHttpPromiseCallback<T>}
    * @return {IUploadPromise<T>}
    */
  def xhr(callback: angularLib.angularMod.IHttpPromiseCallback[T]): IUploadPromise[T] = js.native
}

