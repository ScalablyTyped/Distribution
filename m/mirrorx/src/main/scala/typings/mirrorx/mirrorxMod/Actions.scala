package typings.mirrorx.mirrorxMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Actions
  extends /* propName */ StringDictionary[js.Any] {
  var routing: routeActions
}

object Actions {
  @scala.inline
  def apply(routing: routeActions, StringDictionary: /* propName */ StringDictionary[js.Any] = null): Actions = {
    val __obj = js.Dynamic.literal(routing = routing.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Actions]
  }
}

@JSImport("mirrorx", "actions")
@js.native
object actions extends TopLevel[Actions]

