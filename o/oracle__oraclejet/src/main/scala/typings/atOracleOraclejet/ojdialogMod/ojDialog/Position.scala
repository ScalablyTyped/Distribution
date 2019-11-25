package typings.atOracleOraclejet.ojdialogMod.ojDialog

import typings.atOracleOraclejet.atOracleOraclejetStrings.fit
import typings.atOracleOraclejet.atOracleOraclejetStrings.flip
import typings.atOracleOraclejet.atOracleOraclejetStrings.flipfit
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait Position extends js.Object {
  var at: js.UndefOr[PositionAlign] = js.undefined
  var collision: js.UndefOr[flip | fit | flipfit | none] = js.undefined
  var my: js.UndefOr[PositionAlign] = js.undefined
  var of: js.UndefOr[String | PositionPoint] = js.undefined
  var offset: js.UndefOr[PositionPoint] = js.undefined
}

object Position {
  @scala.inline
  def apply(
    at: PositionAlign = null,
    collision: flip | fit | flipfit | none = null,
    my: PositionAlign = null,
    of: String | PositionPoint = null,
    offset: PositionPoint = null
  ): Position = {
    val __obj = js.Dynamic.literal()
    if (at != null) __obj.updateDynamic("at")(at.asInstanceOf[js.Any])
    if (collision != null) __obj.updateDynamic("collision")(collision.asInstanceOf[js.Any])
    if (my != null) __obj.updateDynamic("my")(my.asInstanceOf[js.Any])
    if (of != null) __obj.updateDynamic("of")(of.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
}

