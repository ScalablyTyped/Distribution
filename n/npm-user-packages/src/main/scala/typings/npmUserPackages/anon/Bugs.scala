package typings.npmUserPackages.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bugs extends js.Object {
  var bugs: js.UndefOr[String] = js.undefined
  var homepage: js.UndefOr[String] = js.undefined
  var npm: String
  var repository: js.UndefOr[String] = js.undefined
}

object Bugs {
  @scala.inline
  def apply(npm: String, bugs: String = null, homepage: String = null, repository: String = null): Bugs = {
    val __obj = js.Dynamic.literal(npm = npm.asInstanceOf[js.Any])
    if (bugs != null) __obj.updateDynamic("bugs")(bugs.asInstanceOf[js.Any])
    if (homepage != null) __obj.updateDynamic("homepage")(homepage.asInstanceOf[js.Any])
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bugs]
  }
}

