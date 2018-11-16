package typings
package moveDashConcurrentlyLib.moveDashConcurrentlyMod.moveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options[T /* <: stdLib.PromiseLike[scala.Unit] */] extends js.Object {
  /**
           * (Default: global.Promise) The promise implementation to use, defaults to Node's.
           */
  var Promise: js.UndefOr[ScalablyTyped.runtime.Instantiable1[/* args (repeated) */ js.Any, T]] = js.undefined
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

