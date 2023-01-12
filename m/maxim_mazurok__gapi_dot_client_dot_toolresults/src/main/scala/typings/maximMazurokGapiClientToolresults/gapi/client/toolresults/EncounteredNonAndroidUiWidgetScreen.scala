package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncounteredNonAndroidUiWidgetScreen extends StObject {
  
  /** Number of encountered distinct screens with non Android UI widgets. */
  var distinctScreens: js.UndefOr[Double] = js.undefined
  
  /** Subset of screens which contain non Android UI widgets. */
  var screenIds: js.UndefOr[js.Array[String]] = js.undefined
}
object EncounteredNonAndroidUiWidgetScreen {
  
  inline def apply(): EncounteredNonAndroidUiWidgetScreen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncounteredNonAndroidUiWidgetScreen]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncounteredNonAndroidUiWidgetScreen] (val x: Self) extends AnyVal {
    
    inline def setDistinctScreens(value: Double): Self = StObject.set(x, "distinctScreens", value.asInstanceOf[js.Any])
    
    inline def setDistinctScreensUndefined: Self = StObject.set(x, "distinctScreens", js.undefined)
    
    inline def setScreenIds(value: js.Array[String]): Self = StObject.set(x, "screenIds", value.asInstanceOf[js.Any])
    
    inline def setScreenIdsUndefined: Self = StObject.set(x, "screenIds", js.undefined)
    
    inline def setScreenIdsVarargs(value: String*): Self = StObject.set(x, "screenIds", js.Array(value*))
  }
}
