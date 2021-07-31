package typings.netTicks

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("net-ticks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def netTicksToDate(ticks: Double, timezoneOffsetHours: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("netTicksToDate")(ticks.asInstanceOf[js.Any], timezoneOffsetHours.asInstanceOf[js.Any])).asInstanceOf[Date]
}
