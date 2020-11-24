package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpgradeInsight extends js.Object {
  
  /** The name of the package to be upgraded. */
  var packageName: js.UndefOr[String] = js.native
  
  /** The suggested version to upgrade to. Optional: In case we are not sure which version solves this problem */
  var upgradeToVersion: js.UndefOr[String] = js.native
}
object UpgradeInsight {
  
  @scala.inline
  def apply(): UpgradeInsight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpgradeInsight]
  }
  
  @scala.inline
  implicit class UpgradeInsightOps[Self <: UpgradeInsight] (val x: Self) extends AnyVal {
    
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
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageName: Self = this.set("packageName", js.undefined)
    
    @scala.inline
    def setUpgradeToVersion(value: String): Self = this.set("upgradeToVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpgradeToVersion: Self = this.set("upgradeToVersion", js.undefined)
  }
}
