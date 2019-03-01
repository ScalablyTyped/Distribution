package typings
package mirrorxLib.mirrorxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromptProps extends js.Object {
  var message: java.lang.String | (js.Function1[
    /* location */ historyLib.historyMod.Location[historyLib.historyMod.LocationState], 
    java.lang.String | scala.Boolean
  ])
  var when: js.UndefOr[scala.Boolean] = js.undefined
}

object PromptProps {
  @scala.inline
  def apply(
    message: java.lang.String | (js.Function1[
      /* location */ historyLib.historyMod.Location[historyLib.historyMod.LocationState], 
      java.lang.String | scala.Boolean
    ]),
    when: js.UndefOr[scala.Boolean] = js.undefined
  ): PromptProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(when)) __obj.updateDynamic("when")(when)
    __obj.asInstanceOf[PromptProps]
  }
}

