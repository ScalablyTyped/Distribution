package typings.parseGitConfig.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse-git-config", "promise")
@js.native
object promise extends js.Object {
  /**
    * Asynchronously parse a .git/config file. Returns a promise.
    * Resolves with `null` if unable to resolve path to the git config file.
    * If no arguments are passed, the .git/config file relative to process.cwd() is used.
    */
  def apply(): js.Promise[Config | Null] = js.native
  def apply(options: String): js.Promise[Config | Null] = js.native
  def apply(options: Options): js.Promise[Config | Null] = js.native
}

