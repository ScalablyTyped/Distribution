package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailureDetail extends StObject {
  
  /** If the failure was severe because the system (app) under test crashed. */
  var crashed: js.UndefOr[Boolean] = js.undefined
  
  /** If the device ran out of memory during a test, causing the test to crash. */
  var deviceOutOfMemory: js.UndefOr[Boolean] = js.undefined
  
  /** If the Roboscript failed to complete successfully, e.g., because a Roboscript action or assertion failed or a Roboscript action could not be matched during the entire crawl. */
  var failedRoboscript: js.UndefOr[Boolean] = js.undefined
  
  /** If an app is not installed and thus no test can be run with the app. This might be caused by trying to run a test on an unsupported platform. */
  var notInstalled: js.UndefOr[Boolean] = js.undefined
  
  /** If a native process (including any other than the app) crashed. */
  var otherNativeCrash: js.UndefOr[Boolean] = js.undefined
  
  /** If the test overran some time limit, and that is why it failed. */
  var timedOut: js.UndefOr[Boolean] = js.undefined
  
  /** If the robo was unable to crawl the app; perhaps because the app did not start. */
  var unableToCrawl: js.UndefOr[Boolean] = js.undefined
}
object FailureDetail {
  
  @scala.inline
  def apply(): FailureDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailureDetail]
  }
  
  @scala.inline
  implicit class FailureDetailMutableBuilder[Self <: FailureDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrashed(value: Boolean): Self = StObject.set(x, "crashed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrashedUndefined: Self = StObject.set(x, "crashed", js.undefined)
    
    @scala.inline
    def setDeviceOutOfMemory(value: Boolean): Self = StObject.set(x, "deviceOutOfMemory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceOutOfMemoryUndefined: Self = StObject.set(x, "deviceOutOfMemory", js.undefined)
    
    @scala.inline
    def setFailedRoboscript(value: Boolean): Self = StObject.set(x, "failedRoboscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedRoboscriptUndefined: Self = StObject.set(x, "failedRoboscript", js.undefined)
    
    @scala.inline
    def setNotInstalled(value: Boolean): Self = StObject.set(x, "notInstalled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotInstalledUndefined: Self = StObject.set(x, "notInstalled", js.undefined)
    
    @scala.inline
    def setOtherNativeCrash(value: Boolean): Self = StObject.set(x, "otherNativeCrash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherNativeCrashUndefined: Self = StObject.set(x, "otherNativeCrash", js.undefined)
    
    @scala.inline
    def setTimedOut(value: Boolean): Self = StObject.set(x, "timedOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimedOutUndefined: Self = StObject.set(x, "timedOut", js.undefined)
    
    @scala.inline
    def setUnableToCrawl(value: Boolean): Self = StObject.set(x, "unableToCrawl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnableToCrawlUndefined: Self = StObject.set(x, "unableToCrawl", js.undefined)
  }
}
