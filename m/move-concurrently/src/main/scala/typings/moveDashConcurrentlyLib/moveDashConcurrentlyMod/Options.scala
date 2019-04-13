package typings
package moveDashConcurrentlyLib.moveDashConcurrentlyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[T /* <: js.Thenable[scala.Unit] */] extends js.Object {
  /**
    * (Default: global.Promise) The promise implementation to use, defaults to Node's.
    */
  var Promise: js.UndefOr[org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, T]] = js.undefined
  /**
    * (Default: require('fs')) The filesystem module to use. Can be used to use graceful-fs or to inject a mock.
    */
  var fs: js.UndefOr[js.Any] = js.undefined
  /**
    * (Default: process.getuid) A function that returns the current UID. Used to inject a mock.
    */
  var getuid: js.UndefOr[js.Any] = js.undefined
  /**
    * (Default: process.platform === 'win32') If true enables Windows symlink semantics.
    * This requires an extra stat to determine if the destination of a symlink is a file or directory.
    * If symlinking a directory fails then we'll try making a junction instead.
    */
  var isWindows: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * (Default: 1) The maximum number of concurrent copies to do at once.
    */
  var maxConcurrency: js.UndefOr[scala.Double] = js.undefined
  /**
    * (Default: require('fs-write-stream-atomic')) The implementation of writeStreamAtomic to use. Used to inject a mock.
    */
  var writeStreamAtomic: js.UndefOr[js.Any] = js.undefined
}

object Options {
  @scala.inline
  def apply[T /* <: js.Thenable[scala.Unit] */](
    Promise: org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, T] = null,
    fs: js.Any = null,
    getuid: js.Any = null,
    isWindows: js.UndefOr[scala.Boolean] = js.undefined,
    maxConcurrency: scala.Int | scala.Double = null,
    writeStreamAtomic: js.Any = null
  ): Options[T] = {
    val __obj = js.Dynamic.literal()
    if (Promise != null) __obj.updateDynamic("Promise")(Promise)
    if (fs != null) __obj.updateDynamic("fs")(fs)
    if (getuid != null) __obj.updateDynamic("getuid")(getuid)
    if (!js.isUndefined(isWindows)) __obj.updateDynamic("isWindows")(isWindows)
    if (maxConcurrency != null) __obj.updateDynamic("maxConcurrency")(maxConcurrency.asInstanceOf[js.Any])
    if (writeStreamAtomic != null) __obj.updateDynamic("writeStreamAtomic")(writeStreamAtomic)
    __obj.asInstanceOf[Options[T]]
  }
}

