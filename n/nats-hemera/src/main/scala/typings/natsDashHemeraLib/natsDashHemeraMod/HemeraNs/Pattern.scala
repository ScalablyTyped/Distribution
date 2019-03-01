package typings
package natsDashHemeraLib.natsDashHemeraMod.HemeraNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pattern
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var topic: java.lang.String
}

object Pattern {
  @scala.inline
  def apply(
    topic: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Pattern = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("topic")(topic)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Pattern]
  }
}

