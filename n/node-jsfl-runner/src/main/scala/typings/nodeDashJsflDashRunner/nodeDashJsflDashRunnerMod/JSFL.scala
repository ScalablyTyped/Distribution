package typings.nodeDashJsflDashRunner.nodeDashJsflDashRunnerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSFL
  extends /* index */ StringDictionary[js.Any] {
  def init(args: js.Any*): Unit
}

object JSFL {
  @scala.inline
  def apply(init: /* repeated */ js.Any => Unit, StringDictionary: /* index */ StringDictionary[js.Any] = null): JSFL = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[JSFL]
  }
}

