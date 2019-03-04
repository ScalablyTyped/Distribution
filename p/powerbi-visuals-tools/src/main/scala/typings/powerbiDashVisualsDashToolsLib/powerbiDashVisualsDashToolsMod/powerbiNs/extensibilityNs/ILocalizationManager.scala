package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILocalizationManager extends js.Object {
  def getDisplayName(key: java.lang.String): java.lang.String
}

object ILocalizationManager {
  @scala.inline
  def apply(getDisplayName: js.Function1[java.lang.String, java.lang.String]): ILocalizationManager = {
    val __obj = js.Dynamic.literal(getDisplayName = getDisplayName)
  
    __obj.asInstanceOf[ILocalizationManager]
  }
}

