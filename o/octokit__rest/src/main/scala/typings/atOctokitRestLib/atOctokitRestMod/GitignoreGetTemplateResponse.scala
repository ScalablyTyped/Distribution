package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitignoreGetTemplateResponse extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var source: js.UndefOr[java.lang.String] = js.undefined
}

object GitignoreGetTemplateResponse {
  @scala.inline
  def apply(name: java.lang.String = null, source: java.lang.String = null): GitignoreGetTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[GitignoreGetTemplateResponse]
  }
}

