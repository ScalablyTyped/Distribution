package typings.parseGitConfig.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse-git-config", "resolveConfigPath")
@js.native
object resolveConfigPath extends js.Object {
  /**
    * Resolve the git config path
    */
  def apply(options: String): String | Null = js.native
  def apply(options: ResolveConfigOptions): String | Null = js.native
}

