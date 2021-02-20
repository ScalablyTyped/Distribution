package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncounteredNonAndroidUiWidgetScreen extends StObject {
  
  /** Number of encountered distinct screens with non Android UI widgets. */
  var distinctScreens: js.UndefOr[Double] = js.native
  
  /** Subset of screens which contain non Android UI widgets. */
  var screenIds: js.UndefOr[js.Array[String]] = js.native
}
object EncounteredNonAndroidUiWidgetScreen {
  
  @scala.inline
  def apply(): EncounteredNonAndroidUiWidgetScreen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncounteredNonAndroidUiWidgetScreen]
  }
  
  @scala.inline
  implicit class EncounteredNonAndroidUiWidgetScreenMutableBuilder[Self <: EncounteredNonAndroidUiWidgetScreen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistinctScreens(value: Double): Self = StObject.set(x, "distinctScreens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistinctScreensUndefined: Self = StObject.set(x, "distinctScreens", js.undefined)
    
    @scala.inline
    def setScreenIds(value: js.Array[String]): Self = StObject.set(x, "screenIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenIdsUndefined: Self = StObject.set(x, "screenIds", js.undefined)
    
    @scala.inline
    def setScreenIdsVarargs(value: String*): Self = StObject.set(x, "screenIds", js.Array(value :_*))
  }
}
