package typings.oracleOraclejet.ojmessagesMod.ojMessages

import typings.oracleOraclejet.oracleOraclejetStrings.bottom
import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.left
import typings.oracleOraclejet.oracleOraclejetStrings.start
import typings.oracleOraclejet.oracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait PositionAlign extends js.Object {
  var horizontal: js.UndefOr[start | end | left | center | bottom] = js.undefined
  var vertical: js.UndefOr[top | bottom | center] = js.undefined
}

object PositionAlign {
  @scala.inline
  def apply(horizontal: start | end | left | center | bottom = null, vertical: top | bottom | center = null): PositionAlign = {
    val __obj = js.Dynamic.literal()
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionAlign]
  }
}

