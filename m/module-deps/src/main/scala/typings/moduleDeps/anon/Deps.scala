package typings.moduleDeps.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deps extends js.Object {
  @JSName("package")
  var _package: js.Any
  var deps: StringDictionary[Boolean]
  var source: String
}

object Deps {
  @scala.inline
  def apply(_package: js.Any, deps: StringDictionary[Boolean], source: String): Deps = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deps]
  }
}

