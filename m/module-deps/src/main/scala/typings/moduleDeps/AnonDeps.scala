package typings.moduleDeps

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeps extends js.Object {
  @JSName("package")
  var _package: js.Any
  var deps: StringDictionary[Boolean]
  var source: String
}

object AnonDeps {
  @scala.inline
  def apply(_package: js.Any, deps: StringDictionary[Boolean], source: String): AnonDeps = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDeps]
  }
}

