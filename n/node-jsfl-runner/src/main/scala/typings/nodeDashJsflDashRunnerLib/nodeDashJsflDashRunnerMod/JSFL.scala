package typings
package nodeDashJsflDashRunnerLib.nodeDashJsflDashRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSFL
  extends /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  def init(args: js.Any*): scala.Unit
}

object JSFL {
  @scala.inline
  def apply(
    init: js.Function1[/* repeated */ js.Any, scala.Unit],
    StringDictionary: /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): JSFL = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("init")(init)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[JSFL]
  }
}

