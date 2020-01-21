package typings.parseGitConfig.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse-git-config", "sync")
@js.native
object sync extends js.Object {
  /**
    * Synchronously parse a `.git/config` file. If no arguments are passed,
    * the `.git/config` file relative to `process.cwd()` is used.
    *
    * @example ```js
    * console.log(parse.sync());
    * console.log(parse.sync({ cwd: 'foo' }));
    * console.log(parse.sync({ cwd: 'foo', path: 'some/.git/config' }));
    * ```
    * @param options Options with `cwd` or `path`, or the cwd to use.
    */
  def apply(): Config = js.native
  def apply(options: String): Config = js.native
  def apply(options: Options): Config = js.native
}

