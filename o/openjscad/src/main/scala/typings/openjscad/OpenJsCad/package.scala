package typings.openjscad

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object OpenJsCad {
  import typings.std.Event

  type EventHandler = js.Function1[/* ev */ js.UndefOr[Event], js.Any]
}
