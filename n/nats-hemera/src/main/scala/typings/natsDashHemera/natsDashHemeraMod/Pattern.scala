package typings.natsDashHemera.natsDashHemeraMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pattern
  extends /* key */ StringDictionary[js.Any] {
  var topic: String
}

object Pattern {
  @scala.inline
  def apply(topic: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): Pattern = {
    val __obj = js.Dynamic.literal(topic = topic)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Pattern]
  }
}

