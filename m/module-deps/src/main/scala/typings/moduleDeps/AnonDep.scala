package typings.moduleDeps

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDep extends js.Object {
  @JSName("package")
  var _package: js.Any
  var deps: StringDictionary[Boolean]
  var source: String
}

object AnonDep {
  @scala.inline
  def apply(_package: js.Any, deps: StringDictionary[Boolean], source: String): AnonDep = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDep]
  }
}

