package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.jsCommonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStringResourceProvider extends js.Object {
  def get(id: java.lang.String): java.lang.String
  def getOptional(id: java.lang.String): java.lang.String
}

object IStringResourceProvider {
  @scala.inline
  def apply(get: java.lang.String => java.lang.String, getOptional: java.lang.String => java.lang.String): IStringResourceProvider = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getOptional = js.Any.fromFunction1(getOptional))
  
    __obj.asInstanceOf[IStringResourceProvider]
  }
}

