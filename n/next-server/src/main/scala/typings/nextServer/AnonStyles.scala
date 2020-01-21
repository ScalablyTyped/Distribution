package typings.nextServer

import typings.react.mod.ReactElement
import typings.react.mod.ReactFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStyles extends js.Object {
  var styles: js.UndefOr[js.Array[ReactElement] | ReactFragment] = js.undefined
}

object AnonStyles {
  @scala.inline
  def apply(styles: js.Array[ReactElement] | ReactFragment = null): AnonStyles = {
    val __obj = js.Dynamic.literal()
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStyles]
  }
}

