package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescriptionDefinition extends js.Object {
  var content: java.lang.String
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object DescriptionDefinition {
  @scala.inline
  def apply(content: java.lang.String, `type`: java.lang.String = null): DescriptionDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content")(content)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DescriptionDefinition]
  }
}

