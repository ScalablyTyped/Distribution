package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NonSdkApiUsageViolationReport extends StObject {
  
  /** Examples of the detected API usages. */
  var exampleApis: js.UndefOr[js.Array[NonSdkApi]] = js.undefined
  
  /** Minimum API level required for the application to run. */
  var minSdkVersion: js.UndefOr[Double] = js.undefined
  
  /** Specifies the API Level on which the application is designed to run. */
  var targetSdkVersion: js.UndefOr[Double] = js.undefined
  
  /** Total number of unique Non-SDK API's accessed. */
  var uniqueApis: js.UndefOr[Double] = js.undefined
}
object NonSdkApiUsageViolationReport {
  
  inline def apply(): NonSdkApiUsageViolationReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonSdkApiUsageViolationReport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NonSdkApiUsageViolationReport] (val x: Self) extends AnyVal {
    
    inline def setExampleApis(value: js.Array[NonSdkApi]): Self = StObject.set(x, "exampleApis", value.asInstanceOf[js.Any])
    
    inline def setExampleApisUndefined: Self = StObject.set(x, "exampleApis", js.undefined)
    
    inline def setExampleApisVarargs(value: NonSdkApi*): Self = StObject.set(x, "exampleApis", js.Array(value*))
    
    inline def setMinSdkVersion(value: Double): Self = StObject.set(x, "minSdkVersion", value.asInstanceOf[js.Any])
    
    inline def setMinSdkVersionUndefined: Self = StObject.set(x, "minSdkVersion", js.undefined)
    
    inline def setTargetSdkVersion(value: Double): Self = StObject.set(x, "targetSdkVersion", value.asInstanceOf[js.Any])
    
    inline def setTargetSdkVersionUndefined: Self = StObject.set(x, "targetSdkVersion", js.undefined)
    
    inline def setUniqueApis(value: Double): Self = StObject.set(x, "uniqueApis", value.asInstanceOf[js.Any])
    
    inline def setUniqueApisUndefined: Self = StObject.set(x, "uniqueApis", js.undefined)
  }
}
