package typings.netconf

import typings.netconf.netconfStrings.`override`
import typings.netconf.netconfStrings.merge
import typings.netconf.netconfStrings.replace
import typings.netconf.netconfStrings.set
import typings.netconf.netconfStrings.text
import typings.netconf.netconfStrings.update
import typings.netconf.netconfStrings.xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Action extends js.Object {
  var action: js.UndefOr[merge | replace | `override` | update | set] = js.undefined
  var config: js.Any
  var format: js.UndefOr[text | xml] = js.undefined
}

object Anon_Action {
  @scala.inline
  def apply(
    config: js.Any,
    action: merge | replace | `override` | update | set = null,
    format: text | xml = null
  ): Anon_Action = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Action]
  }
}

