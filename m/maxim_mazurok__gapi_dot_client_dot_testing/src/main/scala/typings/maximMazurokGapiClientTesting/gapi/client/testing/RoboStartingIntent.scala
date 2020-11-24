package typings.maximMazurokGapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoboStartingIntent extends js.Object {
  
  /** An intent that starts the main launcher activity. */
  var launcherActivity: js.UndefOr[js.Any] = js.native
  
  /** An intent that starts an activity with specific details. */
  var startActivity: js.UndefOr[StartActivityIntent] = js.native
  
  /** Timeout in seconds for each intent. */
  var timeout: js.UndefOr[String] = js.native
}
object RoboStartingIntent {
  
  @scala.inline
  def apply(): RoboStartingIntent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoboStartingIntent]
  }
  
  @scala.inline
  implicit class RoboStartingIntentOps[Self <: RoboStartingIntent] (val x: Self) extends AnyVal {
    
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
    def setLauncherActivity(value: js.Any): Self = this.set("launcherActivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLauncherActivity: Self = this.set("launcherActivity", js.undefined)
    
    @scala.inline
    def setStartActivity(value: StartActivityIntent): Self = this.set("startActivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartActivity: Self = this.set("startActivity", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
