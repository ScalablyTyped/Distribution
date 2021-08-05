package typings.officeUiFabricReact.mod

import typings.uifabricUtilities.fabricPerformanceMod.IPerfSummary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "FabricPerformance")
@js.native
class FabricPerformance ()
  extends typings.officeUiFabricReact.utilitiesMod.FabricPerformance
/* static members */
object FabricPerformance {
  
  @JSImport("office-ui-fabric-react", "FabricPerformance")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "FabricPerformance._timeoutId")
  @js.native
  def _timeoutId: js.Any = js.native
  inline def _timeoutId_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_timeoutId")(x.asInstanceOf[js.Any])
  
  /**
    * Measures execution time of the given syncronous function. If the same logic is executed multiple times,
    * each individual measurement will be collected as well the overall numbers.
    * @param name - The name of this measurement
    * @param func - The logic to be measured for execution time
    */
  inline def measure(name: String, func: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("measure")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  
  inline def setPeriodicReset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPeriodicReset")().asInstanceOf[Unit]
  
  @JSImport("office-ui-fabric-react", "FabricPerformance.summary")
  @js.native
  def summary: IPerfSummary = js.native
  inline def summary_=(x: IPerfSummary): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("summary")(x.asInstanceOf[js.Any])
}
