package typings.officeUiFabricReact.mod

import typings.uifabricUtilities.fabricPerformanceMod.IPerfSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react", "FabricPerformance")
@js.native
class FabricPerformance ()
  extends typings.officeUiFabricReact.utilitiesMod.FabricPerformance

/* static members */
@JSImport("office-ui-fabric-react", "FabricPerformance")
@js.native
object FabricPerformance extends js.Object {
  var _timeoutId: js.Any = js.native
  var summary: IPerfSummary = js.native
  /**
    * Measures execution time of the given syncronous function. If the same logic is executed multiple times,
    * each individual measurement will be collected as well the overall numbers.
    * @param name - The name of this measurement
    * @param func - The logic to be measured for execution time
    */
  def measure(name: String, func: js.Function0[Unit]): Unit = js.native
  def reset(): Unit = js.native
  def setPeriodicReset(): Unit = js.native
}

