package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncounteredLoginScreen extends StObject {
  
  /** Number of encountered distinct login screens. */
  var distinctScreens: js.UndefOr[Double] = js.undefined
  
  /** Subset of login screens. */
  var screenIds: js.UndefOr[js.Array[String]] = js.undefined
}
object EncounteredLoginScreen {
  
  inline def apply(): EncounteredLoginScreen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncounteredLoginScreen]
  }
  
  extension [Self <: EncounteredLoginScreen](x: Self) {
    
    inline def setDistinctScreens(value: Double): Self = StObject.set(x, "distinctScreens", value.asInstanceOf[js.Any])
    
    inline def setDistinctScreensUndefined: Self = StObject.set(x, "distinctScreens", js.undefined)
    
    inline def setScreenIds(value: js.Array[String]): Self = StObject.set(x, "screenIds", value.asInstanceOf[js.Any])
    
    inline def setScreenIdsUndefined: Self = StObject.set(x, "screenIds", js.undefined)
    
    inline def setScreenIdsVarargs(value: String*): Self = StObject.set(x, "screenIds", js.Array(value :_*))
  }
}
