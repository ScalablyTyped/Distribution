package typings.mkdirp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mkdirp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Create a new directory and any necessary subdirectories at dir with octal
    * permission string `opts.mode`. If opts is a string or number, it will be
    * treated as the `opts.mode`. If opts.mode isn't specified, it defaults to
    * 0o777 & (~`process.umask()`).
    *
    * Promise resolves to first directory made that had to be created, or
    * undefined if everything already exists. Promise rejects if any errors are
    * encountered. Note that, in the case of promise rejection, some directories
    * may have been created, as recursive directory creation is not an atomic operation.
    * You can optionally pass in an alternate fs implementation by passing in
    * opts.fs.
    *
    * Your implementation should have `opts.fs.mkdir(path, opts, cb)` and
    * `opts.fs.stat(path, cb)`.
    *
    * You can also override just one or the other of mkdir and stat by passing in
    * `opts.stat` or `opts.mkdir`, or providing an fs option that only overrides one
    * of these.
    */
  def apply(dir: String): js.Promise[js.UndefOr[String]] = js.native
  def apply(dir: String, opts: Mode): js.Promise[js.UndefOr[String]] = js.native
  def apply(dir: String, opts: Options): js.Promise[js.UndefOr[String]] = js.native
}
