package typings.nextDashServer

import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Styles extends js.Object {
  var styles: js.UndefOr[js.Array[ReactElement] | ReactFragment] = js.undefined
}

object Anon_Styles {
  @scala.inline
  def apply(styles: js.Array[ReactElement] | ReactFragment = null): Anon_Styles = {
    val __obj = js.Dynamic.literal()
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Styles]
  }
}

