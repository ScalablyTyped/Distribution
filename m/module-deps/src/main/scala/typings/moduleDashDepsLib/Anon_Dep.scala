package typings
package moduleDashDepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dep extends js.Object {
  var deps: org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  var `package`: js.Any
  var source: java.lang.String
}

object Anon_Dep {
  @scala.inline
  def apply(
    deps: org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    `package`: js.Any,
    source: java.lang.String
  ): Anon_Dep = {
    val __obj = js.Dynamic.literal(`package` = `package`)
    __obj.updateDynamic("deps")(deps)
    __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[Anon_Dep]
  }
}

