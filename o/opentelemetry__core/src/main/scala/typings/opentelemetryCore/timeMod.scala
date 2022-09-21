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
  
  inline def hrTime(): HrTime = ^.asInstanceOf[js.Dynamic].applyDynamic("hrTime")().asInstanceOf[HrTime]
  inline def hrTime(performanceNow: Double): HrTime = ^.asInstanceOf[js.Dynamic].applyDynamic("hrTime")(performanceNow.asInstanceOf[js.Any]).asInstanceOf[HrTime]
  
  inline def hrTimeDuration(startTime: HrTime, endTime: HrTime): HrTime = (^.asInstanceOf[js.Dynamic].applyDynamic("hrTimeDuration")(startTime.asInstanceOf[js.Any], endTime.asInstanceOf[js.Any])).asInstanceOf[HrTime]
  
  inline def hrTimeToMicroseconds(time: HrTime): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hrTimeToMicroseconds")(time.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def hrTimeToMilliseconds(time: HrTime): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hrTimeToMilliseconds")(time.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def hrTimeToNanoseconds(time: HrTime): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hrTimeToNanoseconds")(time.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def hrTimeToTimeStamp(time: HrTime): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hrTimeToTimeStamp")(time.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isTimeInput(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTimeInput")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTimeInputHrTime(value: Any): /* is @opentelemetry/api.@opentelemetry/api/build/src/common/Time.HrTime */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTimeInputHrTime")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @opentelemetry/api.@opentelemetry/api/build/src/common/Time.HrTime */ Boolean]
  
  inline def timeInputToHrTime(time: TimeInput): HrTime = ^.asInstanceOf[js.Dynamic].applyDynamic("timeInputToHrTime")(time.asInstanceOf[js.Any]).asInstanceOf[HrTime]
}
