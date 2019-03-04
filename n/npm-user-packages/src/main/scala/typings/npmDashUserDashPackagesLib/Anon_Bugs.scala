package typings
package npmDashUserDashPackagesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bugs extends js.Object {
  var bugs: js.UndefOr[java.lang.String] = js.undefined
  var homepage: js.UndefOr[java.lang.String] = js.undefined
  var npm: java.lang.String
  var repository: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Bugs {
  @scala.inline
  def apply(
    npm: java.lang.String,
    bugs: java.lang.String = null,
    homepage: java.lang.String = null,
    repository: java.lang.String = null
  ): Anon_Bugs = {
    val __obj = js.Dynamic.literal(npm = npm)
    if (bugs != null) __obj.updateDynamic("bugs")(bugs)
    if (homepage != null) __obj.updateDynamic("homepage")(homepage)
    if (repository != null) __obj.updateDynamic("repository")(repository)
    __obj.asInstanceOf[Anon_Bugs]
  }
}

