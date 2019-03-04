package typings
package mirrorxLib.mirrorxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Actions
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var routing: routeActions
}

object Actions {
  @scala.inline
  def apply(
    routing: routeActions,
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Actions = {
    val __obj = js.Dynamic.literal(routing = routing)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Actions]
  }
}

