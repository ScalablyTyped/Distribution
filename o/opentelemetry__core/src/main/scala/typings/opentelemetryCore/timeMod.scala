package typings.opentelemetryCore

import typings.opentelemetryApi.timeMod.HrTime
import typings.opentelemetryApi.timeMod.TimeInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/core/build/src/common/time", JSImport.Namespace)
@js.native
object timeMod extends js.Object {
  
  def hrTime(): HrTime = js.native
  def hrTime(performanceNow: Double): HrTime = js.native
  
  def hrTimeDuration(startTime: HrTime, endTime: HrTime): HrTime = js.native
  
  def hrTimeToMicroseconds(hrTime: HrTime): Double = js.native
  
  def hrTimeToMilliseconds(hrTime: HrTime): Double = js.native
  
  def hrTimeToNanoseconds(hrTime: HrTime): Double = js.native
  
  def hrTimeToTimeStamp(hrTime: HrTime): String = js.native
  
  def isTimeInput(value: js.Any): Boolean = js.native
  
  def isTimeInputHrTime(value: js.Any): Boolean = js.native
  
  def timeInputToHrTime(time: TimeInput): HrTime = js.native
}
