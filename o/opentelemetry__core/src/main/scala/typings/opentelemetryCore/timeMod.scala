package typings.opentelemetryCore

import typings.opentelemetryApi.timeMod.HrTime
import typings.opentelemetryApi.timeMod.TimeInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeMod {
  
  @JSImport("@opentelemetry/core/build/src/common/time", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def hrTime(): HrTime = ^.asInstanceOf[js.Dynamic].applyDynamic("hrTime")().asInstanceOf[HrTime]
  @scala.inline
  def hrTime(performanceNow: Double): HrTime = ^.asInstanceOf[js.Dynamic].applyDynamic("hrTime")(performanceNow.asInstanceOf[js.Any]).asInstanceOf[HrTime]
  
  @scala.inline
  def hrTimeDuration(startTime: HrTime, endTime: HrTime): HrTime = (^.asInstanceOf[js.Dynamic].applyDynamic("hrTimeDuration")(startTime.asInstanceOf[js.Any], endTime.asInstanceOf[js.Any])).asInstanceOf[HrTime]
  
  @scala.inline
  def hrTimeToMicroseconds(hrTime: HrTime): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hrTimeToMicroseconds")(hrTime.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def hrTimeToMilliseconds(hrTime: HrTime): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hrTimeToMilliseconds")(hrTime.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def hrTimeToNanoseconds(hrTime: HrTime): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hrTimeToNanoseconds")(hrTime.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def hrTimeToTimeStamp(hrTime: HrTime): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hrTimeToTimeStamp")(hrTime.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def isTimeInput(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTimeInput")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isTimeInputHrTime(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTimeInputHrTime")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def timeInputToHrTime(time: TimeInput): HrTime = ^.asInstanceOf[js.Dynamic].applyDynamic("timeInputToHrTime")(time.asInstanceOf[js.Any]).asInstanceOf[HrTime]
}
