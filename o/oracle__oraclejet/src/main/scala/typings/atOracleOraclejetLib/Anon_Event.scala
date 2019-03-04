package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Event
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var event: stdLib.Event
}

object Anon_Event {
  @scala.inline
  def apply(
    event: stdLib.Event,
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_Event = {
    val __obj = js.Dynamic.literal(event = event)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Event]
  }
}

