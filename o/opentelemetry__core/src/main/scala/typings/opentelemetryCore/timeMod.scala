package typings.opentelemetryCore

import typings.opentelemetryApi.timeMod.HrTime
import typings.opentelemetryApi.timeMod.TimeInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeMod {
  
  @JSImport("@opentelemetry/core/build/src/common/time", "hrTime")
  @js.native
  def hrTime(): HrTime = js.native
  @JSImport("@opentelemetry/core/build/src/common/time", "hrTime")
  @js.native
  def hrTime(performanceNow: Double): HrTime = js.native
  
  @JSImport("@opentelemetry/core/build/src/common/time", "hrTimeDuration")
  @js.native
  def hrTimeDuration(startTime: HrTime, endTime: HrTime): HrTime = js.native
  
  @JSImport("@opentelemetry/core/build/src/common/time", "hrTimeToMicroseconds")
  @js.native
  def hrTimeToMicroseconds(hrTime: HrTime): Double = js.native
  
  @JSImport("@opentelemetry/core/build/src/common/time", "hrTimeToMilliseconds")
  @js.native
  def hrTimeToMilliseconds(hrTime: HrTime): Double = js.native
  
  @JSImport("@opentelemetry/core/build/src/common/time", "hrTimeToNanoseconds")
  @js.native
  def hrTimeToNanoseconds(hrTime: HrTime): Double = js.native
  
  @JSImport("@opentelemetry/core/build/src/common/time", "hrTimeToTimeStamp")
  @js.native
  def hrTimeToTimeStamp(hrTime: HrTime): String = js.native
  
  @JSImport("@opentelemetry/core/build/src/common/time", "isTimeInput")
  @js.native
  def isTimeInput(value: js.Any): Boolean = js.native
  
  @JSImport("@opentelemetry/core/build/src/common/time", "isTimeInputHrTime")
  @js.native
  def isTimeInputHrTime(value: js.Any): Boolean = js.native
  
  @JSImport("@opentelemetry/core/build/src/common/time", "timeInputToHrTime")
  @js.native
  def timeInputToHrTime(time: TimeInput): HrTime = js.native
}
