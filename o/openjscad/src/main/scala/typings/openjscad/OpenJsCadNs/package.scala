package typings.openjscad

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object OpenJsCadNs {
  type EventHandler = js.Function1[/* ev */ js.UndefOr[Event], js.Any]
}
