package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitignoreGetTemplateResponse extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var source: js.UndefOr[String] = js.undefined
}

object GitignoreGetTemplateResponse {
  @scala.inline
  def apply(name: String = null, source: String = null): GitignoreGetTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[GitignoreGetTemplateResponse]
  }
}

