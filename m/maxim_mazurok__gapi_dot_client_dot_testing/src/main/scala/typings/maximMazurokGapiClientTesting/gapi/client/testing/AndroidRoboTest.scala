package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidRoboTest extends StObject {
  
  /** The APK for the application under test. */
  var appApk: js.UndefOr[FileReference] = js.undefined
  
  /** A multi-apk app bundle for the application under test. */
  var appBundle: js.UndefOr[AppBundle] = js.undefined
  
  /** The initial activity that should be used to start the app. */
  var appInitialActivity: js.UndefOr[String] = js.undefined
  
  /** The java package for the application under test. The default value is determined by examining the application's manifest. */
  var appPackageId: js.UndefOr[String] = js.undefined
  
  /** The max depth of the traversal stack Robo can explore. Needs to be at least 2 to make Robo explore the app beyond the first activity. Default is 50. */
  var maxDepth: js.UndefOr[Double] = js.undefined
  
  /** The max number of steps Robo can execute. Default is no limit. */
  var maxSteps: js.UndefOr[Double] = js.undefined
  
  /** A set of directives Robo should apply during the crawl. This allows users to customize the crawl. For example, the username and password for a test account can be provided. */
  var roboDirectives: js.UndefOr[js.Array[RoboDirective]] = js.undefined
  
  /** The mode in which Robo should run. Most clients should allow the server to populate this field automatically. */
  var roboMode: js.UndefOr[String] = js.undefined
  
  /** A JSON file with a sequence of actions Robo should perform as a prologue for the crawl. */
  var roboScript: js.UndefOr[FileReference] = js.undefined
  
  /**
    * The intents used to launch the app for the crawl. If none are provided, then the main launcher activity is launched. If some are provided, then only those provided are launched (the
    * main launcher activity must be provided explicitly).
    */
  var startingIntents: js.UndefOr[js.Array[RoboStartingIntent]] = js.undefined
}
object AndroidRoboTest {
  
  inline def apply(): AndroidRoboTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidRoboTest]
  }
  
  extension [Self <: AndroidRoboTest](x: Self) {
    
    inline def setAppApk(value: FileReference): Self = StObject.set(x, "appApk", value.asInstanceOf[js.Any])
    
    inline def setAppApkUndefined: Self = StObject.set(x, "appApk", js.undefined)
    
    inline def setAppBundle(value: AppBundle): Self = StObject.set(x, "appBundle", value.asInstanceOf[js.Any])
    
    inline def setAppBundleUndefined: Self = StObject.set(x, "appBundle", js.undefined)
    
    inline def setAppInitialActivity(value: String): Self = StObject.set(x, "appInitialActivity", value.asInstanceOf[js.Any])
    
    inline def setAppInitialActivityUndefined: Self = StObject.set(x, "appInitialActivity", js.undefined)
    
    inline def setAppPackageId(value: String): Self = StObject.set(x, "appPackageId", value.asInstanceOf[js.Any])
    
    inline def setAppPackageIdUndefined: Self = StObject.set(x, "appPackageId", js.undefined)
    
    inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
    
    inline def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
    
    inline def setMaxSteps(value: Double): Self = StObject.set(x, "maxSteps", value.asInstanceOf[js.Any])
    
    inline def setMaxStepsUndefined: Self = StObject.set(x, "maxSteps", js.undefined)
    
    inline def setRoboDirectives(value: js.Array[RoboDirective]): Self = StObject.set(x, "roboDirectives", value.asInstanceOf[js.Any])
    
    inline def setRoboDirectivesUndefined: Self = StObject.set(x, "roboDirectives", js.undefined)
    
    inline def setRoboDirectivesVarargs(value: RoboDirective*): Self = StObject.set(x, "roboDirectives", js.Array(value*))
    
    inline def setRoboMode(value: String): Self = StObject.set(x, "roboMode", value.asInstanceOf[js.Any])
    
    inline def setRoboModeUndefined: Self = StObject.set(x, "roboMode", js.undefined)
    
    inline def setRoboScript(value: FileReference): Self = StObject.set(x, "roboScript", value.asInstanceOf[js.Any])
    
    inline def setRoboScriptUndefined: Self = StObject.set(x, "roboScript", js.undefined)
    
    inline def setStartingIntents(value: js.Array[RoboStartingIntent]): Self = StObject.set(x, "startingIntents", value.asInstanceOf[js.Any])
    
    inline def setStartingIntentsUndefined: Self = StObject.set(x, "startingIntents", js.undefined)
    
    inline def setStartingIntentsVarargs(value: RoboStartingIntent*): Self = StObject.set(x, "startingIntents", js.Array(value*))
  }
}
