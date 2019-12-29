package typings.moduleDashDeps

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dep extends js.Object {
  @JSName("package")
  var _package: js.Any
  var deps: StringDictionary[Boolean]
  var source: String
}

object Anon_Dep {
  @scala.inline
  def apply(_package: js.Any, deps: StringDictionary[Boolean], source: String): Anon_Dep = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Dep]
  }
}

