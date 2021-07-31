package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppStartTime extends StObject {
  
  /**
    * Optional. The time from app start to reaching the developer-reported "fully drawn" time. This is only stored if the app includes a call to Activity.reportFullyDrawn(). See
    * https://developer.android.com/topic/performance/launch-time.html#time-full
    */
  var fullyDrawnTime: js.UndefOr[Duration] = js.undefined
  
  /** The time from app start to the first displayed activity being drawn, as reported in Logcat. See https://developer.android.com/topic/performance/launch-time.html#time-initial */
  var initialDisplayTime: js.UndefOr[Duration] = js.undefined
}
object AppStartTime {
  
  @scala.inline
  def apply(): AppStartTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppStartTime]
  }
  
  @scala.inline
  implicit class AppStartTimeMutableBuilder[Self <: AppStartTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullyDrawnTime(value: Duration): Self = StObject.set(x, "fullyDrawnTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullyDrawnTimeUndefined: Self = StObject.set(x, "fullyDrawnTime", js.undefined)
    
    @scala.inline
    def setInitialDisplayTime(value: Duration): Self = StObject.set(x, "initialDisplayTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialDisplayTimeUndefined: Self = StObject.set(x, "initialDisplayTime", js.undefined)
  }
}
