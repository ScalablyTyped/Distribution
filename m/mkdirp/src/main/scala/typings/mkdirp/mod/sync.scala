package typings.mkdirp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mkdirp", "sync")
@js.native
object sync extends js.Object {
  
  /**
    * Synchronously create a new directory and any necessary subdirectories at
    * dir with octal permission string `opts.mode`. If opts is a string or number,
    * it will be treated as the `opts.mode`. If `opts.mode` isn't specified, it
    * defaults to 0o777 & (~`process.umask()`).
    * You can optionally pass in an alternate fs implementation by passing in
    * `opts.fs`. Your implementation should have `opts.fs.mkdirSync(path, mode)`
    * and `opts.fs.statSync(path)`. You can also override just one or the other
    * of `mkdirSync` and `statSync` by passing in `opts.statSync` or `opts.mkdirSync`,
    * or providing an fs option that only overrides one of these.
    * @returns Returns the first directory that had to be created, or undefined if everything already exists.
    */
  def apply(dir: String): js.UndefOr[String] = js.native
  def apply(dir: String, opts: Mode): js.UndefOr[String] = js.native
  def apply(dir: String, opts: OptionsSync): js.UndefOr[String] = js.native
}
