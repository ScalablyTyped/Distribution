package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidTestLoop extends StObject {
  
  /** The APK for the application under test. */
  var appApk: js.UndefOr[FileReference] = js.undefined
  
  /** A multi-apk app bundle for the application under test. */
  var appBundle: js.UndefOr[AppBundle] = js.undefined
  
  /** The java package for the application under test. The default is determined by examining the application's manifest. */
  var appPackageId: js.UndefOr[String] = js.undefined
  
  /**
    * The list of scenario labels that should be run during the test. The scenario labels should map to labels defined in the application's manifest. For example, player_experience and
    * com.google.test.loops.player_experience add all of the loops labeled in the manifest with the com.google.test.loops.player_experience name to the execution. Scenarios can also be
    * specified in the scenarios field.
    */
  var scenarioLabels: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The list of scenarios that should be run during the test. The default is all test loops, derived from the application's manifest. */
  var scenarios: js.UndefOr[js.Array[Double]] = js.undefined
}
object AndroidTestLoop {
  
  inline def apply(): AndroidTestLoop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidTestLoop]
  }
  
  extension [Self <: AndroidTestLoop](x: Self) {
    
    inline def setAppApk(value: FileReference): Self = StObject.set(x, "appApk", value.asInstanceOf[js.Any])
    
    inline def setAppApkUndefined: Self = StObject.set(x, "appApk", js.undefined)
    
    inline def setAppBundle(value: AppBundle): Self = StObject.set(x, "appBundle", value.asInstanceOf[js.Any])
    
    inline def setAppBundleUndefined: Self = StObject.set(x, "appBundle", js.undefined)
    
    inline def setAppPackageId(value: String): Self = StObject.set(x, "appPackageId", value.asInstanceOf[js.Any])
    
    inline def setAppPackageIdUndefined: Self = StObject.set(x, "appPackageId", js.undefined)
    
    inline def setScenarioLabels(value: js.Array[String]): Self = StObject.set(x, "scenarioLabels", value.asInstanceOf[js.Any])
    
    inline def setScenarioLabelsUndefined: Self = StObject.set(x, "scenarioLabels", js.undefined)
    
    inline def setScenarioLabelsVarargs(value: String*): Self = StObject.set(x, "scenarioLabels", js.Array(value*))
    
    inline def setScenarios(value: js.Array[Double]): Self = StObject.set(x, "scenarios", value.asInstanceOf[js.Any])
    
    inline def setScenariosUndefined: Self = StObject.set(x, "scenarios", js.undefined)
    
    inline def setScenariosVarargs(value: Double*): Self = StObject.set(x, "scenarios", js.Array(value*))
  }
}
