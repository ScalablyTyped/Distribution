package typings.moduleDashDeps

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dep extends js.Object {
  var deps: StringDictionary[Boolean]
  var `package`: js.Any
  var source: String
}

object Anon_Dep {
  @scala.inline
  def apply(deps: StringDictionary[Boolean], `package`: js.Any, source: String): Anon_Dep = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(`package`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Dep]
  }
}

