package typings.mirrorx.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Actions_
  extends /* propName */ StringDictionary[js.Any] {
  var routing: routeActions
}

object Actions_ {
  @scala.inline
  def apply(routing: routeActions, StringDictionary: /* name */ StringDictionary[js.Any] = null): Actions_ = {
    val __obj = js.Dynamic.literal(routing = routing.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Actions_]
  }
}

