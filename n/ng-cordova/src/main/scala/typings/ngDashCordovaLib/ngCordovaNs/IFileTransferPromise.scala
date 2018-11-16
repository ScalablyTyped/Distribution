package typings
package ngDashCordovaLib.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Dropped any */ @js.native
trait IFileTransferPromise[T] extends js.Object {
  def `catch`[TResult](
    onRejected: js.Function1[
      /* error */ cordovaDashPluginDashFileDashTransferLib.FileTransferError, 
      _ | TResult
    ]
  ): js.Any = js.native
  def `then`[TResult, TResult2](successCallback: js.Function1[/* promiseValue */ T, _ | TResult]): js.Any = js.native
  def `then`[TResult, TResult2](
    successCallback: js.Function1[/* promiseValue */ T, _ | TResult],
    errorCallback: js.Function1[
      /* error */ cordovaDashPluginDashFileDashTransferLib.FileTransferError, 
      _ | TResult2
    ]
  ): js.Any = js.native
  def `then`[TResult, TResult2](
    successCallback: js.Function1[/* promiseValue */ T, _ | TResult],
    errorCallback: js.Function1[
      /* error */ cordovaDashPluginDashFileDashTransferLib.FileTransferError, 
      _ | TResult2
    ],
    notifyCallback: js.Function1[/* state */ js.Any, _]
  ): js.Any = js.native
}

