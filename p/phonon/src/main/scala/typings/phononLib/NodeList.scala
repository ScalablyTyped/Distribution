package typings
package phononLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeList extends js.Object {
  def off(event: java.lang.String, callback: js.Function1[/* event */ js.Any, scala.Unit]): scala.Unit = js.native
  def off(
    event: java.lang.String,
    callback: js.Function1[/* event */ js.Any, scala.Unit],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def on(event: java.lang.String, callback: js.Function1[/* event */ js.Any, scala.Unit]): scala.Unit = js.native
  def on(
    event: java.lang.String,
    callback: js.Function1[/* event */ js.Any, scala.Unit],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
}

