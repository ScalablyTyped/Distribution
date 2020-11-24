package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncounteredLoginScreen extends js.Object {
  
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
  implicit class EncounteredLoginScreenOps[Self <: EncounteredLoginScreen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDistinctScreens(value: Double): Self = this.set("distinctScreens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistinctScreens: Self = this.set("distinctScreens", js.undefined)
    
    @scala.inline
    def setScreenIdsVarargs(value: String*): Self = this.set("screenIds", js.Array(value :_*))
    
    @scala.inline
    def setScreenIds(value: js.Array[String]): Self = this.set("screenIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenIds: Self = this.set("screenIds", js.undefined)
  }
}
