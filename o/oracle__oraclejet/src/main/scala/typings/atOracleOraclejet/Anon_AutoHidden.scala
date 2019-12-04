package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.hidden
import typings.atOracleOraclejet.atOracleOraclejetStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoHidden extends js.Object {
  var horizontal: js.UndefOr[hidden | visible | auto] = js.undefined
  var vertical: js.UndefOr[hidden | visible | auto] = js.undefined
}

object Anon_AutoHidden {
  @scala.inline
  def apply(horizontal: hidden | visible | auto = null, vertical: hidden | visible | auto = null): Anon_AutoHidden = {
    val __obj = js.Dynamic.literal()
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoHidden]
  }
}

