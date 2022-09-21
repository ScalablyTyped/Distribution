package typings.netTicks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("net-ticks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def netTicksToDate(ticks: Double, timezoneOffsetHours: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("netTicksToDate")(ticks.asInstanceOf[js.Any], timezoneOffsetHours.asInstanceOf[js.Any])).asInstanceOf[js.Date]
}
