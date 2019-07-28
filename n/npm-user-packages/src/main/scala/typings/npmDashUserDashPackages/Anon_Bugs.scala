package typings.npmDashUserDashPackages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bugs extends js.Object {
  var bugs: js.UndefOr[String] = js.undefined
  var homepage: js.UndefOr[String] = js.undefined
  var npm: String
  var repository: js.UndefOr[String] = js.undefined
}

object Anon_Bugs {
  @scala.inline
  def apply(npm: String, bugs: String = null, homepage: String = null, repository: String = null): Anon_Bugs = {
    val __obj = js.Dynamic.literal(npm = npm)
    if (bugs != null) __obj.updateDynamic("bugs")(bugs)
    if (homepage != null) __obj.updateDynamic("homepage")(homepage)
    if (repository != null) __obj.updateDynamic("repository")(repository)
    __obj.asInstanceOf[Anon_Bugs]
  }
}

