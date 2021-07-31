package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpgradeInsight extends StObject {
  
  /** The name of the package to be upgraded. */
  var packageName: js.UndefOr[String] = js.undefined
  
  /** The suggested version to upgrade to. Optional: In case we are not sure which version solves this problem */
  var upgradeToVersion: js.UndefOr[String] = js.undefined
}
object UpgradeInsight {
  
  @scala.inline
  def apply(): UpgradeInsight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpgradeInsight]
  }
  
  @scala.inline
  implicit class UpgradeInsightMutableBuilder[Self <: UpgradeInsight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    @scala.inline
    def setUpgradeToVersion(value: String): Self = StObject.set(x, "upgradeToVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpgradeToVersionUndefined: Self = StObject.set(x, "upgradeToVersion", js.undefined)
  }
}
