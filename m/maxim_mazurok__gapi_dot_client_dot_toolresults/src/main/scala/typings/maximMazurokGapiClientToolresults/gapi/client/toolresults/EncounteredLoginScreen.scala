package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncounteredLoginScreen extends StObject {
  
  /** Number of encountered distinct login screens. */
  var distinctScreens: js.UndefOr[Double] = js.native
  
  /** Subset of login screens. */
  var screenIds: js.UndefOr[js.Array[String]] = js.native
}
object EncounteredLoginScreen {
  
  @scala.inline
  def apply(): EncounteredLoginScreen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncounteredLoginScreen]
  }
  
  @scala.inline
  implicit class EncounteredLoginScreenMutableBuilder[Self <: EncounteredLoginScreen] (val x: Self) extends AnyVal {
    
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
