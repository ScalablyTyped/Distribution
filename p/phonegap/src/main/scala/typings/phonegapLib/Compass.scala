package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Compass extends js.Object {
  def clearWatch(watchID: scala.Double): scala.Unit = js.native
  def getCurrentHeading(
    compassSuccess: js.Function1[/* heading */ CompassHeading, scala.Unit],
    compassError: js.Function1[/* error */ CompassError, scala.Unit]
  ): scala.Unit = js.native
  def getCurrentHeading(
    compassSuccess: js.Function1[/* heading */ CompassHeading, scala.Unit],
    compassError: js.Function1[/* error */ CompassError, scala.Unit],
    compassOptions: CompassOptions
  ): scala.Unit = js.native
  def watchHeading(
    compassSuccess: js.Function1[/* heading */ CompassHeading, scala.Unit],
    compassError: js.Function1[/* error */ CompassError, scala.Unit]
  ): scala.Unit = js.native
  def watchHeading(
    compassSuccess: js.Function1[/* heading */ CompassHeading, scala.Unit],
    compassError: js.Function1[/* error */ CompassError, scala.Unit],
    compassOptions: CompassOptions
  ): scala.Unit = js.native
}

