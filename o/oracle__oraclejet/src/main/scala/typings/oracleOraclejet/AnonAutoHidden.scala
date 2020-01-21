package typings.oracleOraclejet

import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.hidden
import typings.oracleOraclejet.oracleOraclejetStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoHidden extends js.Object {
  var horizontal: js.UndefOr[hidden | visible | auto] = js.undefined
  var vertical: js.UndefOr[hidden | visible | auto] = js.undefined
}

object AnonAutoHidden {
  @scala.inline
  def apply(horizontal: hidden | visible | auto = null, vertical: hidden | visible | auto = null): AnonAutoHidden = {
    val __obj = js.Dynamic.literal()
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoHidden]
  }
}

