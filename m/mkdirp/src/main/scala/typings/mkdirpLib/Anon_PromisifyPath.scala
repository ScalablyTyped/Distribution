package typings
package mkdirpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_PromisifyPath extends js.Object {
  /**
           * Asynchronous stat(2) - Get file status.
           * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
           */
  def `__promisify__`(path: nodeLib.fsMod.PathLike): stdLib.Promise[nodeLib.fsMod.Stats]
}

