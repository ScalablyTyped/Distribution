package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Compass extends StObject {
  
  def clearWatch(watchID: Double): Unit = js.native
  
  def getCurrentHeading(
    compassSuccess: js.Function1[/* heading */ CompassHeading, Unit],
    compassError: js.Function1[/* error */ CompassError, Unit]
  ): Unit = js.native
  def getCurrentHeading(
    compassSuccess: js.Function1[/* heading */ CompassHeading, Unit],
    compassError: js.Function1[/* error */ CompassError, Unit],
    compassOptions: CompassOptions
  ): Unit = js.native
  
  def watchHeading(
    compassSuccess: js.Function1[/* heading */ CompassHeading, Unit],
    compassError: js.Function1[/* error */ CompassError, Unit]
  ): Unit = js.native
  def watchHeading(
    compassSuccess: js.Function1[/* heading */ CompassHeading, Unit],
    compassError: js.Function1[/* error */ CompassError, Unit],
    compassOptions: CompassOptions
  ): Unit = js.native
}
