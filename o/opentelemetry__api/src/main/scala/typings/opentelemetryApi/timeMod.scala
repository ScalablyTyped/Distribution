package typings.opentelemetryApi

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/api/build/src/common/Time", JSImport.Namespace)
@js.native
object timeMod extends js.Object {
  
  type HrTime = js.Tuple2[Double, Double]
  
  type TimeInput = HrTime | Double | Date
}
