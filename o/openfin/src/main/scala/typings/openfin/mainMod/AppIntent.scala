package typings.openfin.mainMod

import typings.openfin.directoryMod.Application
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppIntent extends js.Object {
  
  /**
    * An array of applications that are associated with this intent.
    */
  var apps: js.Array[Application] = js.native
  
  /**
    * Descriptor of this intent.
    */
  var intent: IntentMetadata = js.native
}
object AppIntent {
  
  @scala.inline
  def apply(apps: js.Array[Application], intent: IntentMetadata): AppIntent = {
    val __obj = js.Dynamic.literal(apps = apps.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppIntent]
  }
  
  @scala.inline
  implicit class AppIntentOps[Self <: AppIntent] (val x: Self) extends AnyVal {
    
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
    def setAppsVarargs(value: Application*): Self = this.set("apps", js.Array(value :_*))
    
    @scala.inline
    def setApps(value: js.Array[Application]): Self = this.set("apps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntent(value: IntentMetadata): Self = this.set("intent", value.asInstanceOf[js.Any])
  }
}
